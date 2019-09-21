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
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    private JFXPasswordField txtClave;
    @FXML
    private JFXTextField txtCorreo;
    private AdministradorDto administradorDto;
    private AdministradorService administradorService;
    private Respuesta resp;
    private Mensaje ms;
  

    @Override
    public void initialize() {
        
        administradorService = new AdministradorService();
        administradorDto = new AdministradorDto();
        ms = new Mensaje();
        
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
    }

    @FXML
    private void salir(ActionEvent event) {
        FlowController.getInstance().initialize();
        FlowController.getInstance().goViewInStage("LogIn", this.getStage());
    }

    @FXML
    private void ingresar(ActionEvent event) {
        
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
        } 
    }
    boolean registroCorrecto() {
        return !txtCedula.getText().isEmpty() && !txtClave.getText().isEmpty() && !txtCorreo.getText().isEmpty()
                && !txtNombre.getText().isEmpty() && !txtpApellido.getText().isEmpty()
                && !txtsApellido.getText().isEmpty() && !txtUsuario.getText().isEmpty();
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
