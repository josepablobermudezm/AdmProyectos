/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import proyectos.util.FlowController;

/**
 * FXML Controller class
 *
 * @author Bran
 */
public class PantallaInicioController extends Controller  implements Initializable {

    @FXML
    private Label label_nombre001;
    @FXML
    private Label label_Usuario001;
    @FXML
    private Label label_pass001;
    @FXML
    private Label label_PApellido001;
    @FXML
    private Label label_SApellido;
    @FXML
    private Label label_Correo001;
    @FXML
    private JFXButton btn_Regstrarse001;
    @FXML
    private JFXButton btn_YTCuenta001;
    @FXML
    private JFXTextField tField_nombre001;
    @FXML
    private JFXTextField tField_PApellido001;
    @FXML
    private JFXTextField tField_SApellido001;
    @FXML
    private JFXTextField tField_Correo001;
    @FXML
    private JFXTextField tField_Usuario001;
    @FXML
    private JFXTextField tField_pass001;
    @FXML
    private BorderPane bp_main;
    @FXML
    private AnchorPane APMain;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @Override
    public void initialize() {
     }

    @FXML
    private void registarUsuario(ActionEvent event) {
    }

    @FXML
    private void regresarLogin(ActionEvent event) {
        FlowController.getInstance().goView("InicioSesion");
    }
    
}
