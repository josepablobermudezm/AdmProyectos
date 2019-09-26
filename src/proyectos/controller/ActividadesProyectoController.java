/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import proyectos.util.FlowController;

/**
 * FXML Controller class
 *
 * @author Jose Pablo Bermudez
 */
public class ActividadesProyectoController extends Controller {

    @FXML
    private ImageView omg;
    @FXML
    private JFXTextField txtEncargado;
    @FXML
    private JFXTextArea txtDescripcion;
    @FXML
    private JFXButton btnVolver;
    @FXML
    private JFXButton btnBuscar;
    @FXML
    private JFXButton btnNueva;
    @FXML
    private JFXButton btnEliminar;
    @FXML
    private TableView<?> table;
    @FXML
    private JFXComboBox<?> Estado;
    @FXML
    private JFXDatePicker InicioEsperado;
    @FXML
    private JFXDatePicker FinalEsperado;
    @FXML
    private JFXDatePicker InicioReal;
    @FXML
    private JFXDatePicker FinalReal;

    @Override
    public void initialize() {
        Image imglogo;
        try {
            imglogo = new Image("/proyectos/resources/logo2.png");
            omg.setImage(imglogo);
        } catch (Exception e) {
        }

    }

    @FXML
    private void Volver(ActionEvent event) {
        
        FlowController.getInstance().initialize();
        FlowController.getInstance().goView("MantenimientosProyectos", "Center", "");
        
    }

    @FXML
    private void Buscar(ActionEvent event) {
    }

    @FXML
    private void Ingresar(ActionEvent event) {
    }

    @FXML
    private void Eliminar(ActionEvent event) {
    }

    
    
}
