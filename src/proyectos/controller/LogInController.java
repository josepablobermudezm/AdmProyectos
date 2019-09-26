/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
public class LogInController extends Controller {

    @FXML
    private AnchorPane root;
    @FXML
    private ImageView imvFondo;
    @FXML
    private VBox VboxLOG;
    @FXML
    private ImageView omg;
    @FXML
    private ImageView imguser;
    @FXML
    private JFXTextField txtUsuario;
    @FXML
    private ImageView imgPassword;
    @FXML
    private JFXPasswordField txtClave;
    @FXML
    private JFXButton button2;
    //private AdministradorDto admin;
    List<Node> requeridos = new ArrayList<>();
    private AdministradorDto admin;
    @Override
    public void initialize() {
        
         Formato();
        admin = new AdministradorDto();
        //bindAdmin();
        //indicarRequeridos();
        Image imglogo;
        try {
            imglogo = new Image("/proyectos/resources/logo.png");
            omg.setImage(imglogo);
        } catch (Exception e) {
        }
        
        Image imgFondo;
        try {
            imgFondo = new Image("/proyectos/resources/e.jpg");
            imvFondo.setImage(imgFondo);
        } catch (Exception e) {
        }

        Image omg1;
        try {
            omg1 = new Image("/proyectos/resources/key (1).png");
            imgPassword.setImage(omg1);
        } catch (Exception e) {

        }

        Image omg2;
        try {
            omg2 = new Image("/proyectos/resources/user (3).png");
            imguser.setImage(omg2);
        } catch (Exception e) {
        }
    }
    
    /*public void indicarRequeridos() {
        requeridos.clear();
        requeridos.addAll(Arrays.asList(txtUsuario, txtClave));
    }*/
    
     public void Formato(){
        txtUsuario.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
        txtClave.setTextFormatter(Formato.getInstance().maxLengthFormat(15));
    }

    /*private void bindAdmin(){
        txtClave.textProperty().bindBidirectional(admin.);
        txtUsuario.textProperty().bindBidirectional(admin.adnSapellidoP);
    }*/
     
    @FXML
    private void restablecerContrasenna(MouseEvent event) {
        
        FlowController.getInstance().goViewInStage("Registro", this.getStage());
        
    }

    @FXML
    private void salir(ActionEvent event) {
        this.getStage().close();
    }

    @FXML
    private void ingresar(ActionEvent event) {
        Login();
         
    }
    
    
    
    public void Login(){
    if(!txtUsuario.getText().isEmpty() && !txtClave.getText().isEmpty()){
            Respuesta respuesta = new AdministradorService().getAdministradorUsuClave(txtUsuario.getText(), txtClave.getText());
            if(respuesta.getEstado()){
                AdministradorDto admin = (AdministradorDto) respuesta.getResultado("AdministradorDto");
                if(admin.getAdnEstado().equals("A")){
                    AppContext.getInstance().set("AdministradorDto", admin);
                    FlowController.getInstance().goMain();
                    this.getStage().close();
                }else{
                    new Mensaje().showModal(Alert.AlertType.ERROR, "Iniciar Sesión", this.getStage(), "Usuario se encuentra inactivo");
                }
            }else{
                new Mensaje().showModal(Alert.AlertType.ERROR, "Iniciar Sesión", this.getStage(), respuesta.getMensaje());
            }
        }else{
            new Mensaje().showModal(Alert.AlertType.ERROR, "Iniciar Sesión", this.getStage(), "Usuario y Contraseña son obligatorios.");
        }
    }
        
    @FXML
    private void LogInKey(KeyEvent event) {
        if (event.getCode() == event.getCode().ENTER) {
            Login();
        }
    }
}
