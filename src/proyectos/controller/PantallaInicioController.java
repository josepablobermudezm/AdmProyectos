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
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import proyectos.model.AdministradorDto;
import proyectos.service.AdministradorService;
import proyectos.util.FlowController;

/**
 * FXML Controller class
 *
 * @author Bran
 */
public class PantallaInicioController extends Controller implements Initializable {

    @FXML
    private Label label_nombre001;
    @FXML
    private Label label_Usuario001;
    @FXML
    private Label label_pass001;
    @FXML
    private Label label_PApellido001;
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
    private JFXTextField tField_Correo001;
    @FXML
    private JFXTextField tField_Usuario001;
    @FXML
    private JFXTextField tField_pass001;
    @FXML
    private BorderPane bp_main;
    @FXML
    private AnchorPane APMain;
    @FXML
    private Label label_Cedula001;
    @FXML
    private JFXTextField tField_cedula001;
    @FXML
    private Label label_SApellido001;
    @FXML
    private JFXTextField tField_SApellido0011;

    /**
     * Initializes the controller class.
     */
    AdministradorService adminstradorService = new AdministradorService();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @Override
    public void initialize() {
    }

    @FXML
    private void registarUsuario(ActionEvent event) {
        if (!tField_nombre001.getText().isEmpty()
                && !tField_PApellido001.getText().isEmpty()
                && !tField_SApellido0011.getText().isEmpty()
                && !tField_Usuario001.getText().isEmpty()
                && !tField_pass001.getText().isEmpty()
                && !tField_Correo001.getText().isEmpty()) {
            AdministradorDto administradorDto = new AdministradorDto(tField_nombre001.getText().toLowerCase(),
                    tField_PApellido001.getText().toLowerCase(),
                    tField_SApellido0011.getText().toLowerCase(), tField_cedula001.getText(),
                    tField_Usuario001.getText().toLowerCase(), tField_Correo001.getText().toLowerCase(),
                    tField_pass001.getText());
            if (adminstradorService.guardarAdministrador(administradorDto).getEstado()) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText("Exitosamente insertado");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText("Ha Ocurrido un error");
                alert.showAndWait();
            }

        }
    }

    @FXML
    private void regresarLogin(ActionEvent event) {
        FlowController.getInstance().goView("InicioSesion");
    }

}
