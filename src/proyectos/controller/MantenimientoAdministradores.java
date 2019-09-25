
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
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
import proyectos.util.AppContext;
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
    @FXML
    private JFXRadioButton btnPlanificado;
    @FXML
    private JFXListView<ProyectoDto> lvProyectos;
    //private ObservableList<ProyectoDto> proyectos = FXCollections.observableArrayList();
    @Override
    public void initialize() {
        txtLiderTecnico.requestFocus();
        proyecto = new ProyectoDto();
        //proyectos = FXCollections.observableArrayList(((ProyectoDto)AppContext.getInstance().get("ProyectoDto")).getProNombre());
        
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
        proyecto.setProCorreopatrocinador("juan@gmail.com");
        proyecto.setProCorreotecnico("jose@gmail.com");
        proyecto.setProCorreousuario("pedro@gmail.com");
        proyecto.setProFechafinal(LocalDate.now());
        proyecto.setProFechafinreal(LocalDate.now());
        proyecto.setProFechainicio(LocalDate.now());
        proyecto.setProFechainireal(LocalDate.now());
        proyecto.setProId(null);
        proyecto.setProLidertecnico("jose");
        proyecto.setProLiderusuario("pedro");
        proyecto.setProNombre("proyecto");
        proyecto.setProPatrocinador("juan");
        proyecto.setProVersion(new Long(1));
        proyecto.setProEstado("En Curso");
        Respuesta respuesta = new ProyectoService().guardarProyecto(proyecto);
    }

    private void bindProyecto() {
        txtCorreoLiderTecnico.textProperty().bindBidirectional(proyecto.proCorreotecnico);
        txtCorreoLiderUsuario.textProperty().bindBidirectional(proyecto.proCorreousuario);
        txtCorreoPatrocinador.textProperty().bindBidirectional(proyecto.proCorreopatrocinador);
        txtLiderTecnico.textProperty().bindBidirectional(proyecto.proLidertecnico);
        txtLiderUsuario.textProperty().bindBidirectional(proyecto.proLiderusuario);
        txtNombreProyecto.textProperty().bindBidirectional(proyecto.proNombre);
        txtPatrocinador.textProperty().bindBidirectional(proyecto.proPatrocinador);
        fechaFinalReal.valueProperty().bindBidirectional(proyecto.proFechafinal);
        FechaInicialReal.valueProperty().bindBidirectional(proyecto.proFechainireal);
        FechaInicialEsperada.valueProperty().bindBidirectional(proyecto.proFechainicio);
        FechaFinalEsperada.valueProperty().bindBidirectional(proyecto.proFechafinal);
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
    }
    
     private void nuevoProyecto() {
        unbindProyecto();
        proyecto = new ProyectoDto();
        //bindAdmin(true);
        //txt.clear();
        //cbEstado.getSelectionModel().clearSelection();
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
