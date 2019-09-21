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
import proyectos.service.AdministradorService;
import proyectos.util.FlowController;
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
    private JFXTextField txtUsuario1;
    @FXML
    private ImageView imgPassword;
    @FXML
    private JFXPasswordField txtClave1;
    @FXML
    private JFXButton button2;

    @Override
    public void initialize() {
        
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

        /*if (txtUsuario1.getText() == null || txtUsuario1.getText().isEmpty()) {
                new Mensaje().showModal(Alert.AlertType.WARNING, "Validación de usuario", this.getStage(), "Es necesario digitar un usuario para ingresar al sistema.");
            }else if (txtClave1.getText() == null || txtClave1.getText().isEmpty()) {
                new Mensaje().showModal(Alert.AlertType.WARNING, "Validación de usuario", this.getStage(), "Es necesario digitar la clave para ingresar al sistema.");
            }else{
                AdministradorService administradorService = new AdministradorService();
                Respuesta respuesta = administradorService.getAdministradorUsuClave(txtUsuario1.getText(), txtClave1.getText());
                if (respuesta.getEstado()) {
                
                this.getStage().close();
            }
        }*/
        FlowController.getInstance().initialize();
                FlowController.getInstance().goMain();
    }
}
