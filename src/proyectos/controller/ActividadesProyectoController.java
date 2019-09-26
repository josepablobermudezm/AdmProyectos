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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import proyectos.model.ActividadesDto;
import proyectos.model.AdministradorDto;
import proyectos.service.ActividadesService;
import proyectos.service.AdministradorService;
import proyectos.util.FlowController;
import proyectos.util.Formato;
import proyectos.util.Mensaje;
import proyectos.util.Respuesta;

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
    private ActividadesDto actividadesDto;
    List<Node> requeridos = new ArrayList<>();
    @Override
    public void initialize() {
        Image imglogo;
        try {
            imglogo = new Image("/proyectos/resources/logo2.png");
            omg.setImage(imglogo);
        } catch (Exception e) {
        }
        Formato();
        actividadesDto = new ActividadesDto();
        bindAct();
        indicarRequeridos();
    }

    public void indicarRequeridos() {
        requeridos.clear();
        requeridos.addAll(Arrays.asList(txtDescripcion, txtEncargado, FinalEsperado, FinalReal, InicioEsperado, InicioReal, Estado));
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
    private void Volver(ActionEvent event) {
        
        FlowController.getInstance().initialize();
        FlowController.getInstance().goView("MantenimientosProyectos", "Center", "");
        
    }

    @FXML
    private void Buscar(ActionEvent event) {
    }

    @FXML
    private void Ingresar(ActionEvent event) {
    String req = validarRequeridos();
        if(req.isEmpty()){
            if(new Mensaje().showConfirmation("Información de Registro", this.getStage(), "¿Deseas registrar al Adminstrador?")){
                //Respuesta respuesta = new ActividadesService().guardarActividad(actividadesDto);
                /*if(respuesta.getEstado()){
                    nuevaActividad();
                    new Mensaje().showModal(Alert.AlertType.INFORMATION, "Información de Registro", this.getStage(), "Administrador registrado exitosamente.");
                }else{
                    new Mensaje().showModal(Alert.AlertType.ERROR, "Información de Registro", this.getStage(), "Error de Registro: "+respuesta.getMensaje());
                }*/
            }
        }else{
            new Mensaje().showModal(Alert.AlertType.WARNING, "Registrar Administrador", this.getStage(), req);
        }
    }
    
     private void bindAct(){
        txtDescripcion.textProperty().bindBidirectional(actividadesDto.actDescripcion);
        txtEncargado.textProperty().bindBidirectional(actividadesDto.actEncargado);
        FinalEsperado.valueProperty().bindBidirectional(actividadesDto.actFechafinal);
        FinalReal.valueProperty().bindBidirectional(actividadesDto.actFechafinreal);
        InicioEsperado.valueProperty().bindBidirectional(actividadesDto.actFechainicio);
        InicioReal.valueProperty().bindBidirectional(actividadesDto.actFechainireal);
    }
     
     private void unbindAct(){
        txtDescripcion.textProperty().unbindBidirectional(actividadesDto.actDescripcion);
        txtEncargado.textProperty().unbindBidirectional(actividadesDto.actEncargado);
        FinalEsperado.valueProperty().unbindBidirectional(actividadesDto.actFechafinal);
        FinalReal.valueProperty().unbindBidirectional(actividadesDto.actFechafinreal);
        InicioEsperado.valueProperty().unbindBidirectional(actividadesDto.actFechainicio);
        InicioReal.valueProperty().unbindBidirectional(actividadesDto.actFechainireal);
    }

     private void nuevaActividad(){
        unbindAct();
        actividadesDto = new ActividadesDto();
        bindAct();
        txtEncargado.requestFocus();
    }
     
     public void Formato(){
        txtDescripcion.setTextFormatter(Formato.getInstance().maxLengthFormat(150));
        txtEncargado.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
    }
     
    @FXML
    private void Eliminar(ActionEvent event) {
    }

    
    
}
