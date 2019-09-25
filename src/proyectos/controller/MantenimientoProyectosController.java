
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import static javafx.scene.control.Alert.AlertType.CONFIRMATION;
import static javafx.scene.control.Alert.AlertType.ERROR;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import proyectos.Proyectos;
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
public class MantenimientoProyectosController extends Controller  {

    @FXML
    private Label Titulo;
    private TableView<ProyectoDto> table;
    @FXML
    private JFXButton btnEditar1;
    @FXML
    private JFXButton btnEliminar1;
    @FXML
    private JFXButton btnAgregar1;
    @FXML
    private JFXTextField txtFiltroEmpleado;
    @FXML
    private JFXButton btnBuscar;
    @FXML
    private JFXTextField txtNombreProyecto;
    private JFXRadioButton btnSuspendido;
    private JFXRadioButton btnEnCurso;
    private JFXRadioButton btnFinalizado;
    @FXML
    private JFXTextField txtPatrocinador;
    @FXML
    private JFXTextField txtLiderUsuario;
    @FXML
    private JFXTextField txtLiderTecnico;
    @FXML
    private JFXTextField txtCorreoLiderTecnico;
    @FXML
    private JFXTextField txtCorreoPatrocinador;
    @FXML
    private JFXTextField txtCorreoLiderUsuario;
    ProyectoDto proyecto;
    private List<JFXTextField> ProyetoList = new ArrayList();
    private String estadoString = "C";
    Mensaje msj = new Mensaje();
    @FXML
    private JFXDatePicker FechaInicialEsperada;
    @FXML
    private JFXDatePicker FechaInicialReal;
    @FXML
    private JFXDatePicker fechaFinalReal;
    @FXML
    private JFXDatePicker FechaFinalEsperada;
    List<Node> requeridos = new ArrayList<>();
    @FXML
    private JFXListView<ProyectoDto> lvProyectos;
    @FXML
    private JFXComboBox<String> cbEstado;
    private ObservableList<String> listaEstados = FXCollections.observableArrayList();
    private ObservableList<ProyectoDto> proyectos;
    @FXML
    private JFXTextField txtID;
    //private ObservableList<ProyectoDto> proyectos = FXCollections.observableArrayList();
    @Override
    public void initialize() {
        listaEstados.addAll("Planificado", "En Curso", "Suspendido", "Finalizado");
        //proyectos = FXCollections.observableArrayList(((AdministradorDto) AppContext.getInstance().get("AdministradorDto")).getProyectos());

        cbEstado.setItems(listaEstados);

        //lvProyectos.setItems(proyectos);
        /*lvProyectos.setCellFactory(param -> {
            return new ListCel();
        });*/
        proyecto = new ProyectoDto();
        nuevoProyecto();
        indicarRequeridos();
        cbEstado.getSelectionModel().selectFirst();
        
        
    }
    
    private void fillList() { // llenar la lista campos con los text field   
        ProyetoList.add(txtCorreoLiderTecnico);
        ProyetoList.add(txtCorreoLiderUsuario);
        ProyetoList.add(txtCorreoPatrocinador);
        ProyetoList.add(txtLiderTecnico);
        ProyetoList.add(txtLiderUsuario);
        ProyetoList.add(txtNombreProyecto);
        ProyetoList.add(txtPatrocinador);
    }
    
    
     private void clearAll() { // Limpiar todos los textfields   
        txtCorreoLiderTecnico.clear();
        txtCorreoLiderUsuario.clear();
        txtCorreoPatrocinador.clear();
        txtLiderTecnico.clear();
        txtLiderUsuario.clear();
        txtNombreProyecto.clear();
        txtPatrocinador.clear();
    }
     
    
    public void Formato(){
        txtCorreoLiderTecnico.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtCorreoLiderUsuario.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtCorreoPatrocinador.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtLiderTecnico.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtLiderUsuario.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtNombreProyecto.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtPatrocinador.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        //txtUserName.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
        //txtPass.setTextFormatter(Formato.getInstance().maxLengthFormat(15));
    }
    
    @FXML
    private void editar(ActionEvent event) {
        
        
        
    }

    @FXML
    private void eliminar(ActionEvent event) {
        
        
        
    }

    @FXML
    private void limpiarRegistro(ActionEvent event) {
        System.out.println(estadoString);
        
    }

    @FXML
    private void agregar(ActionEvent event) {/*
        proyecto.setProCorreopatrocinador("juan@gmail.com");
        proyecto.setProCorreotecnico("jose@gmail.com");
        proyecto.setProCorreousuario("pedro@gmail.com");
        proyecto.setProFechafinal(FechaFinalEsperada.getValue());
        proyecto.setProFechafinreal(FechaInicialEsperada.getValue());
        proyecto.setProFechainicio(FechaInicialReal.getValue());
        proyecto.setProFechainireal(fechaFinalReal.getValue());
        proyecto.setProId(null);
        proyecto.setProLidertecnico("jose");
        proyecto.setProLiderusuario("pedro");
        proyecto.setProNombre("proyecto");
        proyecto.setProPatrocinador("juan");
        proyecto.setProVersion(new Long(1));
        proyecto.setProEstado("C");
        AdministradorDto proAdministrador = new AdministradorDto();
        proyecto.setProAdministrador(proAdministrador);
        Respuesta respuesta = new ProyectoService().guardarProyecto(proyecto);*/
         // VAlido los campos requeridos
        String req = validarRequeridos();
        //Si los requeridos están completos... Continuo
        //if (req.isEmpty()) {
            if (new Mensaje().showConfirmation("Guardar Proyecto", this.getStage(), "¿Deseas guardar el proyecto?")) {
                Respuesta respuesta = new ProyectoService().guardarProyecto(proyecto);
                if (respuesta.getEstado()) {

                    lvProyectos.getItems().clear();
                    AdministradorDto admin = (AdministradorDto) AppContext.getInstance().get("AdministradorDto");
                    proyectos = FXCollections.observableArrayList(admin.getProyectos());
                    lvProyectos.setItems(proyectos);
                    nuevoProyecto();
                    new Mensaje().showModal(Alert.AlertType.INFORMATION, "Información de Registro", this.getStage(), respuesta.getMensaje());
                } else {
                    new Mensaje().showModal(Alert.AlertType.ERROR, "Información de Registro", this.getStage(), "Error de guardado: " + respuesta.getMensaje());
                }
            }
        //} else {
        //    new Mensaje().showModal(Alert.AlertType.WARNING, "Registrar Administrador", this.getStage(), req);
        //}
    }

    private void bindProyecto(Boolean nuevo) {
        if (!nuevo) {
            txtID.textProperty().bind(proyecto.proId);
        }
        txtCorreoLiderTecnico.textProperty().bindBidirectional(proyecto.proCorreotecnico);
        txtCorreoLiderUsuario.textProperty().bindBidirectional(proyecto.proCorreousuario);
        txtCorreoPatrocinador.textProperty().bindBidirectional(proyecto.proCorreopatrocinador);
        txtLiderTecnico.textProperty().bindBidirectional(proyecto.proLidertecnico);
        txtLiderUsuario.textProperty().bindBidirectional(proyecto.proLiderusuario);
        txtNombreProyecto.textProperty().bindBidirectional(proyecto.proNombre);
        txtPatrocinador.textProperty().bindBidirectional(proyecto.proPatrocinador);
        fechaFinalReal.valueProperty().bindBidirectional(proyecto.proFechafinreal);
        FechaInicialReal.valueProperty().bindBidirectional(proyecto.proFechainireal);
        FechaInicialEsperada.valueProperty().bindBidirectional(proyecto.proFechainicio);
        FechaFinalEsperada.valueProperty().bindBidirectional(proyecto.proFechafinal);
        cbEstado.valueProperty().bindBidirectional(proyecto.proEstado);
    }

    private void unbindProyecto(){
        txtCorreoLiderTecnico.textProperty().unbindBidirectional(proyecto.proCorreotecnico);
        txtCorreoLiderUsuario.textProperty().unbindBidirectional(proyecto.proCorreousuario);
        txtCorreoPatrocinador.textProperty().unbindBidirectional(proyecto.proCorreopatrocinador);
        txtLiderTecnico.textProperty().unbindBidirectional(proyecto.proLidertecnico);
        txtLiderUsuario.textProperty().unbindBidirectional(proyecto.proLiderusuario);
        txtNombreProyecto.textProperty().unbindBidirectional(proyecto.proNombre);
        txtPatrocinador.textProperty().unbindBidirectional(proyecto.proPatrocinador);
        FechaFinalEsperada.valueProperty().unbind();
        FechaInicialEsperada.valueProperty().unbind();
        FechaInicialReal.valueProperty().unbind();
        fechaFinalReal.valueProperty().unbind();
        cbEstado.promptTextProperty().unbindBidirectional(proyecto.proEstado);
    }
    
    public void indicarRequeridos() {
        requeridos.clear();
        requeridos.addAll(Arrays.asList(txtCorreoLiderTecnico, txtCorreoLiderUsuario, txtCorreoPatrocinador, txtLiderTecnico, 
                txtLiderUsuario, txtNombreProyecto, txtPatrocinador, FechaFinalEsperada, FechaInicialEsperada, FechaInicialReal, 
                fechaFinalReal, cbEstado));
    }

    @FXML
    private void Filtrar(ActionEvent event) {
    }

    public String validarRequeridos() {
        Boolean validos = true;
        String invalidos = "";
        for (Node node : requeridos) {
            if (node instanceof JFXTextField) {
                if(((JFXTextField) node).getText() == null || ((JFXTextField) node).getText().isEmpty())
                    if (validos) {
                        invalidos += ((JFXTextField) node).getPromptText();
                    } else {
                        invalidos += ", " + ((JFXTextField) node).getPromptText();
                    }
                validos = false;
            } else if (node instanceof JFXDatePicker && ((JFXDatePicker) node).getValue() == null) {
                if (validos) {
                    invalidos += ((JFXDatePicker) node).getPromptText();
                } else {
                    invalidos += ", " + ((JFXDatePicker) node).getPromptText();
                }
                validos = false;
            } else if (node instanceof JFXComboBox && ((JFXComboBox) node).getSelectionModel().getSelectedIndex() < 0) {
                if (validos) {
                    invalidos += ((JFXComboBox) node).getPromptText();
                } else {
                    invalidos += ", " + ((JFXComboBox) node).getPromptText();
                }
                validos = false;
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
        txtID.clear();
        cbEstado.getSelectionModel().clearSelection();
    }
    
   /* public class ListCel extends ListCell<ProyectoDto> {

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
    
    
}*/
}
