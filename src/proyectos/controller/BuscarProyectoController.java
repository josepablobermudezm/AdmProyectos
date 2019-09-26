/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.controller;

import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import proyectos.model.ProyectoDto;
import proyectos.service.ProyectoService;

/**
 * FXML Controller class
 *
 * @author Bran
 */
public class BuscarProyectoController implements Initializable {

    @FXML
    private Label lbl_nombre001;
    @FXML
    private JFXTextField tF_nombre001;
    @FXML
    private Label lbl_patrocinador001;
    @FXML
    private JFXTextField tf_patrocinador001;
    @FXML
    private Label lbl_estado001;
    @FXML
    private JFXRadioButton rb_enProgreso001;
    @FXML
    private JFXRadioButton rb_detenido001;
    @FXML
    private JFXRadioButton rb_finalizado001;
    @FXML
    private Button btn_buscar001;
    @FXML
    private Label lbl_titulo001;
    @FXML
    private TableView<?> tb_proyectos001;
    @FXML
    private TableColumn<ProyectoDto, String> clm_nombre001;
    @FXML
    private TableColumn<ProyectoDto, String> clm_patrocinador001;
    @FXML
    private TableColumn<ProyectoDto, String> clm_usuarios001;
    @FXML
    private TableColumn<ProyectoDto, String> clm_tecnicos001;
    @FXML
    private TableColumn<ProyectoDto, String> clm_estado001;
    @FXML
    private Button btn_cancelar001;
    //otros objetos
    ProyectoDto proyectoDto = new ProyectoDto();
    List<ProyectoDto> listaProyectosDto = new ArrayList<>();
    ProyectoService proyectoservice;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void filtrar(ActionEvent event) {
    //enviar datos en mayuscula        
    }

    @FXML
    private void cancelar(ActionEvent event) {
    }

    @FXML
    private void setEnProgreso(ActionEvent event) {
       rb_finalizado001.setSelected(false);
       rb_detenido001.setSelected(false);
    }

    @FXML
    private void setDetenido(ActionEvent event) {
        rb_finalizado001.setSelected(false);
        rb_enProgreso001.setSelected(false);
    }

    @FXML
    private void setFinalizado(ActionEvent event) {
        rb_enProgreso001.setSelected(false);
        rb_detenido001.setSelected(false);
    }
    
}
