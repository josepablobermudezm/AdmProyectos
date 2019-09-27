/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import proyectos.model.AdministradorDto;
import proyectos.model.ProyectoDto;
import proyectos.service.AdministradorService;
import proyectos.service.ProyectoService;
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
public class MantenimientosProyectosController  extends Controller implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private ImageView logo;
    @FXML
    private JFXTextField txtId;
    @FXML
    private JFXTextField txtNombre;
    @FXML
    private HBox hbPatrocinador;
    @FXML
    private JFXTextField txtNomPatro;
    @FXML
    private JFXTextField txtCorreoPatro;
    @FXML
    private HBox hbLiderUsuario;
    @FXML
    private JFXTextField txtNomUsuario;
    @FXML
    private JFXTextField txtCorreoUsuario;
    @FXML
    private HBox hbLiderTecnico;
    @FXML
    private JFXTextField txtLidTec;
    @FXML
    private JFXTextField txtCorreoTecnico;
    @FXML
    private JFXDatePicker dpInicioEsperado;
    @FXML
    private JFXDatePicker dpFinalEsperado;
    @FXML
    private JFXDatePicker DateInicioReal;
    @FXML
    private JFXDatePicker DateFinalReal;
    @FXML
    private JFXComboBox<String> Estado;
    @FXML
    private JFXButton btnGuarda_Modificar;
    @FXML
    private JFXButton btnResumSegui;
    private JFXListView<ProyectoDto> Proyectos;
    private AdministradorDto admin;
    ProyectoDto proyecto;
    
    List<Node> requeridos = new ArrayList<>();
    
    private ObservableList<String> estados = FXCollections.observableArrayList();
    private ObservableList<ProyectoDto> proyectos;
    private List<JFXTextField> ProyetoList = new ArrayList();
    @FXML
    private JFXButton Actividades;
    @FXML
<<<<<<< HEAD
    private JFXButton btn_buscarPro001;
=======
    private TableView<ProyectoDto> table;
    @FXML
    private TableColumn<ProyectoDto, String> CL_NOMBRE_PRO;
    @FXML
    private TableColumn<ProyectoDto, String> CL_PATROCINADOR_PRO;
    private ProyectoService proyectoService;
    private Mensaje ms;
    private Respuesta resp;
     private ObservableList items;
    @FXML
    private JFXButton btnEditar;
>>>>>>> 45664b290822d5e56ccbcc1b66c6a7af0951e4d9
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize() {
        Image imglogo;
        try {
            imglogo = new Image("/proyectos/resources/logo2.png");
            logo.setImage(imglogo);
        } catch (Exception e) {
        }
        estados.addAll("Planificado", "En Curso", "Suspendido", "Finalizado");
        admin = ((AdministradorDto) AppContext.getInstance().get("AdministradorDto"));
        Estado.setItems(estados);
        proyectoService = new ProyectoService();
        proyecto = new ProyectoDto();
        /*ms = new Mensaje();
        resp = proyectoService.getProyectos();*/
        nuevoProyecto();
        indicarRequeridos();
        Estado.getSelectionModel().selectFirst();
        
        CL_NOMBRE_PRO.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getProNombre()));
        CL_PATROCINADOR_PRO.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getProPatrocinador()));
        
        proyectoService = new ProyectoService();
        ms = new Mensaje();
        List<ProyectoDto> proyectosList = new ArrayList<>();
        resp = proyectoService.getProyectos();
        for (Object pro : (List<Object>) resp.getResultado("Proyectos")) {
            
            proyectosList.add(new ProyectoDto((webservice.ProyectoDto) pro));
        }
        items = FXCollections.observableArrayList(proyectosList);
        table.setItems(items);
    }
    
    
    @FXML
     private void guardar(ActionEvent event) {
        String req = validarValores();
        if (req.isEmpty()) {
            if (new Mensaje().showConfirmation("Guardar Proyecto", this.getStage(), "¿Deseas guardar el proyecto?")) {
                Respuesta respuesta = new ProyectoService().guardarProyecto(proyecto);
                if (respuesta.getEstado()) {
                    AdministradorDto admin = (AdministradorDto) AppContext.getInstance().get("AdministradorDto");
                    List<ProyectoDto> proyectosList = new ArrayList<>();
                    resp = proyectoService.getProyectos();
                    for (Object pro : (List<Object>) resp.getResultado("Proyectos")) {
                        proyectosList.add(new ProyectoDto((webservice.ProyectoDto) pro));
                    }
                    table.getItems().clear();
                    items = FXCollections.observableArrayList(proyectosList);
                    table.setItems(items);
                    nuevoProyecto();
                    new Mensaje().showModal(Alert.AlertType.INFORMATION, "Información de Registro", this.getStage(), respuesta.getMensaje());
                } else {
                    new Mensaje().showModal(Alert.AlertType.ERROR, "Información de Registro", this.getStage(), "Error de guardado: " + respuesta.getMensaje());
                }
            }
        } else {
            new Mensaje().showModal(Alert.AlertType.WARNING, "Registrar Administrador", this.getStage(), req);
        }
    }

     @FXML
    private void editar(ActionEvent event) {
        
        String requisitos = validarValores();
        if (requisitos.isEmpty()) {
            if (new Mensaje().showConfirmation("Guardar Proyecto", this.getStage(), "¿Deseas guardar el proyecto?")) {
                Respuesta respuesta = new ProyectoService().guardarProyecto(proyecto);
                if (respuesta.getEstado()) {
                    proyecto = (ProyectoDto)respuesta.getResultado("ProyectoDto");
                    List<ProyectoDto> proyectosList = new ArrayList<>();
                    resp = proyectoService.getProyectos();
                    for (Object pro : (List<Object>) resp.getResultado("Proyectos")) {
                        proyectosList.add(new ProyectoDto((webservice.ProyectoDto) pro));
                    }
                    table.getItems().clear();
                    items = FXCollections.observableArrayList(proyectosList);
                    table.setItems(items);
                    clear();
                    new Mensaje().showModal(Alert.AlertType.INFORMATION, "Información de Registro", this.getStage(), respuesta.getMensaje());
                } else {
                    new Mensaje().showModal(Alert.AlertType.ERROR, "Información de Registro", this.getStage(), "Error de guardado: " + respuesta.getMensaje());
                }
            }
        } else {
            new Mensaje().showModal(Alert.AlertType.WARNING, "Registrar Administrador", this.getStage(), requisitos);
        }
    }
    
    public void Formato(){
        txtCorreoTecnico.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtCorreoUsuario.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtCorreoPatro.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtLidTec.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtNomUsuario.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtNombre.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtNomUsuario.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
    }
    
    private void bindProyecto(Boolean nuevo) {
        if (!nuevo) {
            txtId.textProperty().bind(proyecto.proId);
        }
        txtCorreoPatro.textProperty().bindBidirectional(proyecto.proCorreopatrocinador);
        txtCorreoTecnico.textProperty().bindBidirectional(proyecto.proCorreotecnico);
        txtCorreoUsuario.textProperty().bindBidirectional(proyecto.proCorreousuario);
        txtLidTec.textProperty().bindBidirectional(proyecto.proLidertecnico);
        txtNomUsuario.textProperty().bindBidirectional(proyecto.proLiderusuario);
        txtNomPatro.textProperty().bindBidirectional(proyecto.proPatrocinador);
        txtNombre.textProperty().bindBidirectional(proyecto.proNombre);
        Estado.valueProperty().bindBidirectional(proyecto.proEstado);
        DateFinalReal.valueProperty().bindBidirectional(proyecto.proFechafinreal);
        dpFinalEsperado.valueProperty().bindBidirectional(proyecto.proFechafinal);
        dpInicioEsperado.valueProperty().bindBidirectional(proyecto.proFechainicio);
        DateInicioReal.valueProperty().bindBidirectional(proyecto.proFechainireal);
    }
     private void unbindProyecto() {
        txtId.textProperty().unbind();
        txtCorreoPatro.textProperty().unbindBidirectional(proyecto.proCorreopatrocinador);
        txtCorreoTecnico.textProperty().unbindBidirectional(proyecto.proCorreotecnico);
        txtCorreoUsuario.textProperty().unbindBidirectional(proyecto.proCorreousuario);
        txtLidTec.textProperty().unbindBidirectional(proyecto.proLidertecnico);
        txtNomPatro.textProperty().unbindBidirectional(proyecto.proPatrocinador);
        txtNomUsuario.textProperty().unbindBidirectional(proyecto.proLiderusuario);
        txtNombre.textProperty().unbindBidirectional(proyecto.proNombre);
        Estado.valueProperty().unbindBidirectional(proyecto.proEstado);
        dpFinalEsperado.valueProperty().unbindBidirectional(proyecto.proFechafinal);
        DateFinalReal.valueProperty().unbindBidirectional(proyecto.proFechafinreal);
        dpInicioEsperado.valueProperty().unbindBidirectional(proyecto.proFechainicio);
        DateInicioReal.valueProperty().unbindBidirectional(proyecto.proFechainireal);
    }
    
     public void indicarRequeridos() {
        requeridos.clear();
        requeridos.addAll(Arrays.asList(txtNombre, txtCorreoPatro, txtCorreoTecnico, txtCorreoUsuario, txtLidTec, txtNomPatro, txtNomUsuario, DateInicioReal, DateFinalReal, Estado,dpFinalEsperado,dpInicioEsperado));
    }
    
    public String validarValores() {
        Boolean validos = true;
        String invalidos = "";
        for (Node node : requeridos) {
            if (node instanceof JFXTextField) {
                if(((JFXTextField) node).getText() == null || ((JFXTextField) node).getText().isEmpty()){
                    if (validos) {
                        invalidos += ((JFXTextField) node).getPromptText();
                    } else {
                        invalidos += ", " + ((JFXTextField) node).getPromptText();
                    }
                    validos = false;
                }
            } else if (node instanceof JFXDatePicker) {
                if(((JFXDatePicker) node).getValue() == null){
                    if (validos) {
                        invalidos += ((JFXDatePicker) node).getPromptText();
                    } else {
                        invalidos += ", " + ((JFXDatePicker) node).getPromptText();
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
    
    private void nuevoProyecto() {
        unbindProyecto();
        proyecto = new ProyectoDto();
        bindProyecto(true);
        txtId.clear();
        Estado.getSelectionModel().clearSelection();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
    @FXML
    private void btnResumSegui_OnAction(ActionEvent event) {
        
        FlowController.getInstance().initialize();
        FlowController.getInstance().goView("ResumenSeguimiento", "Center", "");
        
    }

    @FXML
    private void Actividades(ActionEvent event) {
        
        FlowController.getInstance().initialize();
        FlowController.getInstance().goView("ActividadesProyecto", "Center", "");
        
    }

    @FXML
<<<<<<< HEAD
    private void AbrirBuscador(ActionEvent event) {
        FlowController.getInstance().goViewInWindowModal("BuscarProyecto", this.stage, Boolean.FALSE);//queda esprando finalisacion
        try{
            proyecto=(ProyectoDto) AppContext.getInstance().get("ProyectoTemporal");
            unbindProyecto();
            bindProyecto(Boolean.TRUE); //corregir
            AppContext.getInstance().delete("ProyectoTemporal"); //elimina el objeto buscando, para poder reutilizar el espacio
        } catch(Exception ex){
            
        }
    }
=======
    private void datosProyecto(MouseEvent event) {
        proyecto = table.getSelectionModel().getSelectedItem();
        bindProyecto(Boolean.TRUE);
        txtId.textProperty().bind(proyecto.proId);
        
    }
    void clear(){
    
        txtNombre.clear();
        txtCorreoPatro.clear();
        txtCorreoTecnico.clear();
        txtCorreoUsuario.clear();
        txtLidTec.clear();
        txtNomPatro.clear();
        txtNomUsuario.clear();
        DateFinalReal.setValue(null);
        DateInicioReal.setValue(null);
        dpFinalEsperado.setValue(null);
        dpInicioEsperado.setValue(null);
        Estado.getSelectionModel().clearSelection();
        
    }
    
    void datos(){
        if (table.getSelectionModel() != null) {
            if (table.getSelectionModel().getSelectedItem() != null) {
                proyecto = table.getSelectionModel().getSelectedItem();
                /*txtId.setText(proyecto.getProId().toString());
                txtNombre.setText(proyecto.getProNombre());
                txtCorreoPatro.setText(proyecto.getProCorreopatrocinador());
                txtCorreoTecnico.setText(proyecto.getProCorreotecnico());
                txtCorreoUsuario.setText(proyecto.getProCorreousuario());
                txtLidTec.setText(proyecto.getProLidertecnico());
                txtNomPatro.setText(proyecto.getProPatrocinador());
                txtNomUsuario.setText(proyecto.getProLiderusuario());
                DateFinalReal.setValue(proyecto.getProFechafinreal());
                DateInicioReal.setValue(proyecto.getProFechainireal());
                dpFinalEsperado.setValue(proyecto.getProFechafinal());
                dpInicioEsperado.setValue(proyecto.getProFechainicio());
                Estado.setValue(proyecto.getProEstado());*/
            }
        }
    }

    
>>>>>>> 45664b290822d5e56ccbcc1b66c6a7af0951e4d9
}
