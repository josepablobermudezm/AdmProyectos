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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import proyectos.model.AdministradorDto;
import proyectos.model.ProyectoDto;
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
    private JFXComboBox<String> cbEstado;
    @FXML
    private JFXButton btnGuarda_Modificar;
    @FXML
    private JFXButton btnResumSegui;
    @FXML
    private JFXListView<ProyectoDto> Proyectos;
    private AdministradorDto admin;
    ProyectoDto proyecto;
    
    List<Node> requeridos = new ArrayList<>();
    
    private ObservableList<String> estados = FXCollections.observableArrayList();
    private ObservableList<ProyectoDto> proyectos;
    private List<JFXTextField> ProyetoList = new ArrayList();
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
        proyectos = FXCollections.observableArrayList(admin.getProyectos());
        //proyectos.add(proyecto);
        cbEstado.setItems(estados);
/*
        Proyectos.setItems(proyectos);
        Proyectos.setCellFactory(param -> {
            return new ListCel();
        });*/
        proyecto = new ProyectoDto();
        nuevoProyecto();
        indicarRequeridos();
        cbEstado.getSelectionModel().selectFirst();
        
        
        
    }
    
    
    @FXML
     private void guardar(ActionEvent event) {
        String req = validarRequeridos();
        if (req.isEmpty()) {
            if (new Mensaje().showConfirmation("Guardar Proyecto", this.getStage(), "¿Deseas guardar el proyecto?")) {
                Respuesta respuesta = new ProyectoService().guardarProyecto(proyecto);
                if (respuesta.getEstado()) {
                    Proyectos.getItems().clear();
                    AdministradorDto admin = (AdministradorDto) AppContext.getInstance().get("AdministradorDto");
                    proyectos = FXCollections.observableArrayList(admin.getProyectos());
                    Proyectos.setItems(proyectos);
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
        txtCorreoPatro.textProperty().bindBidirectional(proyecto.proPatrocinador);
        txtNomUsuario.textProperty().bindBidirectional(proyecto.proLiderusuario);
        txtNombre.textProperty().bindBidirectional(proyecto.proNombre);
        cbEstado.valueProperty().bindBidirectional(proyecto.proEstado);
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
        cbEstado.valueProperty().unbindBidirectional(proyecto.proEstado);
        dpFinalEsperado.valueProperty().unbindBidirectional(proyecto.proFechafinal);
        DateFinalReal.valueProperty().unbindBidirectional(proyecto.proFechafinreal);
        dpInicioEsperado.valueProperty().unbindBidirectional(proyecto.proFechainicio);
        DateInicioReal.valueProperty().unbindBidirectional(proyecto.proFechainireal);
    }
    
     public void indicarRequeridos() {
        requeridos.clear();
        requeridos.addAll(Arrays.asList(txtNombre, txtCorreoPatro, txtCorreoTecnico, txtCorreoUsuario, txtLidTec, txtNomPatro, txtNomUsuario, DateInicioReal, DateFinalReal, cbEstado,dpFinalEsperado,dpInicioEsperado));
    }
    
    public String validarRequeridos() {
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
        cbEstado.getSelectionModel().clearSelection();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
    /*public class ListCel extends ListCell<ProyectoDto> {

        HBox hbox = new HBox();
        Label label = new Label();
        Pane pane = new Pane();
        JFXButton btnActividad = new JFXButton("Actividades");
        JFXButton btnSeguimiento = new JFXButton("Seguimientos");

        public ListCel() {
            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            setAlignment(Pos.CENTER);
            btnActividad.getStyleClass().add("JFXButton");
            btnSeguimiento.getStyleClass().add("JFXButton");

            btnActividad.setOnAction(m -> {
                AppContext.getInstance().set("ProyectoDto", this.getItem());
                FlowController.getInstance().goView("Actividades", "Center", "");
                FlowController.getInstance().initialize();
            });

            btnSeguimiento.setOnAction(m -> {
                AppContext.getInstance().set("ProyectoDto", this.getItem());
                FlowController.getInstance().goView("Seguimiento", "Center", "");
                FlowController.getInstance().initialize();
            });

            label.getStyleClass().add("Label2");

            label.setOnMouseReleased(event -> {
                unbindProyecto();
                proyecto = this.getItem();
                bindProyecto(false);
            });

            label.setCursor(Cursor.HAND);

            hbox.setSpacing(10);
            hbox.getChildren().addAll(label, pane, btnActividad, btnSeguimiento);
            HBox.setHgrow(pane, Priority.ALWAYS);
        }

        @Override
        public void updateItem(ProyectoDto pro, boolean empty) {
            super.updateItem(pro, empty);

            setText(null);
            setGraphic(null);

            if (pro != null && !empty) {
                label.setText(pro.getProNombre());
                setGraphic(hbox);
            }

        }
    }
*/
    @FXML
    private void btnResumSegui_OnAction(ActionEvent event) {
    }
}
