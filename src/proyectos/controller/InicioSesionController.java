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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Bran
 */
public class InicioSesionController implements Initializable {

    @FXML
    private ImageView iView_cuenta001;
    @FXML
    private ImageView iView_Pass001;
    @FXML
    private JFXTextField tField_Cuenta001;
    @FXML
    private JFXPasswordField tField_Pass001;
    @FXML
    private Label lbl_CrearCuenta001;
    @FXML
    private JFXButton btn_IniciarSesion001;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void crearCuenta(MouseEvent event) {
    }

    @FXML
    private void iniciarSesion(ActionEvent event) {
    }
    
}