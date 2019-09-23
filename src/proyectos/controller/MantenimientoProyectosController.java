
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import static javafx.scene.control.Alert.AlertType.CONFIRMATION;
import static javafx.scene.control.Alert.AlertType.ERROR;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import proyectos.Proyectos;
import proyectos.model.AdministradorDto;
import proyectos.model.ProyectoDto;
import proyectos.service.AdministradorService;
import proyectos.service.ProyectoService;
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
    @FXML
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
    @FXML
    private JFXRadioButton btnSuspendido;
    @FXML
    private JFXRadioButton btnEnCurso;
    @FXML
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
    @FXML
    private TableColumn<ProyectoDto, String> COL_NOMBRE_PRO;
    @FXML
    private TableColumn<ProyectoDto, String> COL_LIDER_TECNICO_PRO;
    @FXML
    private TableColumn<ProyectoDto, String> COL_CORREO_LIDERTECNICO_PRO;
    @FXML
    private TableColumn<ProyectoDto, String> COL_PATROCINADOR_PRO;
    @FXML
    private TableColumn<ProyectoDto, String> COL_CORREO_PATROCINADOR_PRO;
    @FXML
    private TableColumn<ProyectoDto, String> COL_LIDERUSUARIO_PRO;
    @FXML
    private TableColumn<ProyectoDto, String> COL_CORREO_LIDERUSUARIO_PRO;
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
    @FXML
    private ToggleGroup estado1;
    List<Node> requeridos = new ArrayList<>();
    @Override
    public void initialize() {
        txtLiderTecnico.requestFocus();
        proyecto = new ProyectoDto();
/*
        COL_NOMBRE_PRO.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getNombre()));
        COL_LIDER_TECNICO_PRO.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getpApellido()));
        COL_CORREO_LIDERTECNICO_PRO.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getsApellido()));
        COL_PATROCINADOR_PRO.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getCedula()));
        COL_CORREO_PATROCINADOR_PRO.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getCorreo()));
        COL_LIDERUSUARIO_PRO.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getGenero()));
        COL_CORREO_LIDERUSUARIO_PRO.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getFechaNacimiento()!=null)?value.getValue().getFechaNacimiento().toString():"NULO"));
        
        items = FXCollections.observableArrayList(pacientes);
        table.setItems(items);*/
        fillList();
        Formato();
        btnEnCurso.setOnMouseClicked((MouseEvent event) -> {
            estadoString = "C";
        });
        btnFinalizado.setOnMouseClicked((MouseEvent event) -> {
            estadoString = "F";
        });
        btnSuspendido.setOnMouseClicked((MouseEvent event) -> {
            estadoString = "S";
        });
        btnEnCurso.setSelected(true);
        
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
    private void agregar(ActionEvent event) {
        
        if(registroCorrecto()){     
            /*proyecto.setProCorreopatrocinador(txtCorreoPatrocinador.getText());
            proyecto.setProCorreotecnico(txtCorreoLiderTecnico.getText());
            proyecto.setProCorreousuario(txtCorreoLiderUsuario.getText());
            */
            proyecto.setProFechafinal(FechaFinalEsperada.getValue().toString());
            proyecto.setProFechafinreal(fechaFinalReal.getValue().toString());
            proyecto.setProFechainicio(FechaInicialReal.getValue().toString());
            proyecto.setProEstado(estadoString);
            proyecto.setProFechainireal(FechaInicialReal.getValue().toString());
            /*proyecto.setProLidertecnico(txtLiderTecnico.getText());
            proyecto.setProLiderusuario(txtLiderUsuario.getText());
            proyecto.setProPatrocinador(txtPatrocinador.getText());
            proyecto.setProNombre(txtNombreProyecto.getText());*/
            proyecto.setProVersion(new Long(1));
            if(new Mensaje().showConfirmation("Información de Registro", this.getStage(), "¿Deseas registrar el Proyecto?")){
                Respuesta respuesta = new ProyectoService().guardarProyecto(proyecto);
                 if(respuesta.getEstado()){
                    nuevoProyecto();
                    new Mensaje().showModal(Alert.AlertType.INFORMATION, "Información de Registro", this.getStage(), "Proyecto registrado exitosamente.");
                }else{
                    new Mensaje().showModal(Alert.AlertType.ERROR, "Información de Registro", this.getStage(), "Error de Registro: "+respuesta.getMensaje());
                }
            }
        }
    }

    private void bindAdmin(){
        txtCorreoLiderTecnico.textProperty().bindBidirectional(proyecto.proCorreotecnico);
        txtCorreoLiderUsuario.textProperty().bindBidirectional(proyecto.proCorreousuario);
        txtCorreoPatrocinador.textProperty().bindBidirectional(proyecto.proCorreopatrocinador);
        txtLiderTecnico.textProperty().bindBidirectional(proyecto.proLidertecnico);
        txtLiderUsuario.textProperty().bindBidirectional(proyecto.proLiderusuario);
        txtNombreProyecto.textProperty().bindBidirectional(proyecto.proNombre);
        txtPatrocinador.textProperty().bindBidirectional(proyecto.proPatrocinador);
    }

    private void unbindAdmin(){
        txtCorreoLiderTecnico.textProperty().unbindBidirectional(proyecto.proCorreotecnico);
        txtCorreoLiderUsuario.textProperty().unbindBidirectional(proyecto.proCorreousuario);
        txtCorreoPatrocinador.textProperty().unbindBidirectional(proyecto.proCorreopatrocinador);
        txtLiderTecnico.textProperty().unbindBidirectional(proyecto.proLidertecnico);
        txtLiderUsuario.textProperty().unbindBidirectional(proyecto.proLiderusuario);
        txtNombreProyecto.textProperty().unbindBidirectional(proyecto.proNombre);
        txtPatrocinador.textProperty().unbindBidirectional(proyecto.proPatrocinador);
    }
    
    private void nuevoProyecto(){
        unbindAdmin();
        proyecto = new ProyectoDto();
        bindAdmin();
        txtLiderTecnico.requestFocus();
    }
    
    @FXML
    private void Filtrar(ActionEvent event) {
    }

    boolean registroCorrecto() {
        return !txtCorreoLiderTecnico.getText().isEmpty() && !txtCorreoLiderUsuario.getText().isEmpty()
               && !txtCorreoPatrocinador.getText().isEmpty() && !txtLiderTecnico.getText().isEmpty()
               && !txtLiderUsuario.getText().isEmpty() && !txtPatrocinador.getText().isEmpty()
               && !txtNombreProyecto.getText().isEmpty() 
               && !FechaFinalEsperada.getValue().toString().isEmpty() && !FechaInicialEsperada.getValue().toString().isEmpty()
               && !FechaInicialReal.getValue().toString().isEmpty() && !fechaFinalReal.getValue().toString().isEmpty();
    }
    
    void limpiarValores() {
        txtCorreoLiderTecnico.clear();
        txtCorreoLiderUsuario.clear();
        txtCorreoPatrocinador.clear();
        txtLiderTecnico.clear();
        txtLiderUsuario.clear();
        txtPatrocinador.clear();
        txtNombreProyecto.clear();
        btnEnCurso.setSelected(false);
        btnFinalizado.setSelected(false);
        btnSuspendido.setSelected(false);
        table.getSelectionModel().clearSelection();
    }


    @FXML
    private void DatosProyecto(MouseEvent event) {
        
        
    
    }
    //metodos extra
    //metodo para dar formato a los distintos elementos
    public void iniciarObjetos(){
        txtCorreoLiderTecnico.setTextFormatter(Formato.getInstance().maxLengthFormat(20));
        txtCorreoLiderUsuario.setTextFormatter(Formato.getInstance().maxLengthFormat(20));
        txtCorreoPatrocinador.setTextFormatter(Formato.getInstance().maxLengthFormat(20));
   
        txtLiderTecnico.setTextFormatter(Formato.getInstance().letrasFormat(20));
        txtLiderUsuario.setTextFormatter(Formato.getInstance().letrasFormat(20));
        txtNombreProyecto.setTextFormatter(Formato.getInstance().maxLengthFormat(20));
        txtPatrocinador.setTextFormatter(Formato.getInstance().letrasFormat(20));
    }

}
