
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import proyectos.Proyectos;
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
    private TableView<?> table;
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
    private ToggleGroup estado;
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
    private TableColumn<?, String> COL_NOMBRE_PRO;
    @FXML
    private TableColumn<?, String> COL_LIDER_TECNICO_PRO;
    @FXML
    private TableColumn<?, String> COL_CORREO_LIDERTECNICO_PRO;
    @FXML
    private TableColumn<?, String> COL_PATROCINADOR_PRO;
    @FXML
    private TableColumn<?, String> COL_CORREO_PATROCINADOR_PRO;
    @FXML
    private TableColumn<?, String> COL_LIDERUSUARIO_PRO;
    @FXML
    private TableColumn<?, String> COL_CORREO_LIDERUSUARIO_PRO;
    
    
    @Override
    public void initialize() {
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
    }
    

    
    @FXML
    private void editar(ActionEvent event) {
        
        
        
    }

    @FXML
    private void eliminar(ActionEvent event) {
        
        
        
    }

    @FXML
    private void limpiarRegistro(ActionEvent event) {
        
    }

    @FXML
    private void agregar(ActionEvent event) {
        
        
        
        
    }

    @FXML
    private void Filtrar(ActionEvent event) {
    }

    boolean registroCorrecto() {
        return !txtCorreoLiderTecnico.getText().isEmpty() && !txtCorreoLiderUsuario.getText().isEmpty()
               && !txtCorreoPatrocinador.getText().isEmpty() && !txtLiderTecnico.getText().isEmpty()
               && !txtLiderUsuario.getText().isEmpty() && !txtPatrocinador.getText().isEmpty()
               && !txtNombreProyecto.getText().isEmpty() 
               && (btnEnCurso.isSelected() || btnFinalizado.isSelected() || btnSuspendido.isSelected());
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
