/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import proyectos.model.AdministradorDto;
import proyectos.service.AdministradorService;
import proyectos.util.AppContext;
import proyectos.util.FlowController;
import proyectos.util.Formato;
import proyectos.util.Mensaje;
import proyectos.util.Respuesta;

/**
 * FXML Controller class
 *
 * @author Jose Pablo Bermudez
 */
public class RegistroController extends Controller {

    @FXML
    private AnchorPane root;
    @FXML
    private ImageView imvFondo;
    @FXML
    private VBox VboxLOG;
    @FXML
    private JFXButton button2;
    @FXML
    private ImageView omg;
    @FXML
    private JFXTextField txtNombre;
    @FXML
    private JFXTextField txtpApellido;
    @FXML
    private JFXTextField txtsApellido;
    @FXML
    private JFXTextField txtCedula;
    @FXML
    private JFXTextField txtUsuario;
    @FXML
    private JFXTextField  txtClave;
    @FXML
    private JFXTextField txtCorreo;
    private AdministradorDto administradorDto;
    private AdministradorService administradorService;
    private Respuesta resp;
    private Mensaje ms;
    private AdministradorDto admin;
    List<Node> requeridos = new ArrayList<>();

    @Override
    public void initialize() {
        /*
        administradorService = new AdministradorService();
        administradorDto = new AdministradorDto();
        ms = new Mensaje();*/
        Image imgFondo;
        try {
            imgFondo = new Image("/proyectos/resources/e.jpg");
            imvFondo.setImage(imgFondo);
        } catch (Exception e) {
        }
        Image imglogo;
        try {
            imglogo = new Image("/proyectos/resources/logo.png");
            omg.setImage(imglogo);
        } catch (Exception e) {
        }
        Formato();
        admin = new AdministradorDto();
        bindAdmin();
        indicarRequeridos();
    }

    public void indicarRequeridos() {
        requeridos.clear();
        requeridos.addAll(Arrays.asList(txtNombre, txtpApellido, txtsApellido, txtCedula, txtCorreo, txtUsuario, txtClave));
    }
    
    @FXML
    private void salir(ActionEvent event) {
        FlowController.getInstance().initialize();
        FlowController.getInstance().goViewInStage("LogIn", this.getStage());
    }

    public String validarRequeridos() {
        Boolean validos = true;
        String invalidos = "";
        for (Node node : requeridos) {
            if (((JFXTextField) node).getText() != null || ((JFXTextField) node).getText() != "") {
                if(((JFXTextField) node).getText().isEmpty()){
                    if (validos) {
                        invalidos += ((JFXTextField) node).getPromptText();
                    } else {
                        invalidos += ", " + ((JFXTextField) node).getPromptText();
                    }
                    validos = false;
                }
            }
        }
        if (validos) {
            return "";
        } else {
            return "Campos requeridos o con problemas de formato [" + invalidos + "].";
        }
    }
    
    @FXML
    private void ingresar(ActionEvent event) {
        /*
        if (registroCorrecto()) {
            String nombre = txtNombre.getText();
            String papellido = txtpApellido.getText();
            String sapellido = txtsApellido.getText();
            String correo = txtCorreo.getText();
            String cedula = txtCedula.getText();
            String usuario = txtUsuario.getText();
            String clave = txtClave.getText();
            Long version = new Long(1);
            //administradorDto = new AdministradorDto(null, nombre, papellido, sapellido, cedula, usuario, correo, clave, version, "A");
            resp = administradorService.guardarAdministrador(administradorDto);
            administradorDto = (AdministradorDto) resp.getResultado("Administrador");
            AppContext.getInstance().set("AdministradorDto", (AdministradorDto) resp.getResultado("AdministradorDto"));
            ms.showModal(Alert.AlertType.INFORMATION, "Informacion de guardado", this.getStage(), resp.getMensaje());
            FlowController.getInstance().initialize();
            FlowController.getInstance().goViewInStage("LogIn", this.getStage());
        } */
        String req = validarRequeridos();
        if(req.isEmpty()){
            if(new Mensaje().showConfirmation("Información de Registro", this.getStage(), "¿Deseas registrar al Adminstrador?")){
                Respuesta respuesta = new AdministradorService().guardarAdministrador(admin);
                if(respuesta.getEstado()){
                    nuevoAdministrador();
                    new Mensaje().showModal(Alert.AlertType.INFORMATION, "Información de Registro", this.getStage(), "Administrador registrado exitosamente.");
                }else{
                    new Mensaje().showModal(Alert.AlertType.ERROR, "Información de Registro", this.getStage(), "Error de Registro: "+respuesta.getMensaje());
                }
            }
        }else{
            new Mensaje().showModal(Alert.AlertType.WARNING, "Registrar Administrador", this.getStage(), req);
        }
    }
    boolean registroCorrecto() {
        return !txtCedula.getText().isEmpty() && !txtClave.getText().isEmpty() && !txtCorreo.getText().isEmpty()
                && !txtNombre.getText().isEmpty() && !txtpApellido.getText().isEmpty()
                && !txtsApellido.getText().isEmpty() && !txtUsuario.getText().isEmpty();
    }

    private void bindAdmin(){
        txtpApellido.textProperty().bindBidirectional(admin.adnPapellidoP);
        txtsApellido.textProperty().bindBidirectional(admin.adnSapellidoP);
        txtCedula.textProperty().bindBidirectional(admin.adnCedulaP);
        txtClave.textProperty().bindBidirectional(admin.adnContrasenaP);
        txtCorreo.textProperty().bindBidirectional(admin.adnCorreoP);
        txtNombre.textProperty().bindBidirectional(admin.adnNombreP);
        txtUsuario.textProperty().bindBidirectional(admin.adnUsuarioP);
    }
    
    /**
     * Desliga los TextField con el Administrador
     */
    private void unbindAdmin(){
        txtpApellido.textProperty().unbindBidirectional(admin.adnPapellidoP);
        txtsApellido.textProperty().unbindBidirectional(admin.adnSapellidoP);
        txtCedula.textProperty().unbindBidirectional(admin.adnCedulaP);
        txtClave.textProperty().unbindBidirectional(admin.adnContrasenaP);
        txtCorreo.textProperty().unbindBidirectional(admin.adnCorreoP);
        txtNombre.textProperty().unbindBidirectional(admin.adnNombreP);
        txtUsuario.textProperty().unbindBidirectional(admin.adnUsuarioP);
    }
    
    private void nuevoAdministrador(){
        unbindAdmin();
        admin = new AdministradorDto();
        bindAdmin();
        txtNombre.requestFocus();
    }
    
    public void Formato(){
        txtpApellido.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
        txtsApellido.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
        txtCedula.setTextFormatter(Formato.getInstance().cedulaFormat(15));
        txtClave.setTextFormatter(Formato.getInstance().maxLengthFormat(15));
        txtCorreo.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtNombre.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
        txtUsuario.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
        //txtUserName.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
        //txtPass.setTextFormatter(Formato.getInstance().maxLengthFormat(15));
    }
    
    @FXML
    private void limpiarRegistro(ActionEvent event) {
        txtCedula.clear();
        txtClave.clear();
        txtCorreo.clear();
        txtNombre.clear();
        txtpApellido.clear();
        txtsApellido.clear();
    }
}
