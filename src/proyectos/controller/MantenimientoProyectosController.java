/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private JFXTextField txtNombre;
    @FXML
    private JFXTextField txtCedula;
    @FXML
    private JFXTextField txtCorreo;
    @FXML
    private JFXButton btnEditar1;
    @FXML
    private JFXButton btnEliminar1;
    @FXML
    private JFXButton btnAgregar1;
    @FXML
    private ToggleGroup genero;
    @FXML
    private JFXTextField txtFiltroEmpleado;
    @FXML
    private JFXButton btnBuscar;
    private JFXTextField txtApellido;
    @FXML
    private JFXDatePicker FechaDeNacimiento;
    private Respuesta resp;
    //private PacienteService pacienteService;
    //private PacienteDto pacienteDto;
    private Mensaje ms;
    //private ArrayList<PacienteDto> pacientes;
    private ObservableList items;
    @FXML
    private TableColumn<?, String> COL_NOMBRE_PAC;
    @FXML
    private TableColumn<?, String> COL_PAPELLIDO_PAC;
    @FXML
    private TableColumn<?, String> COL_SAPELLIDO_PAC;
    @FXML
    private TableColumn<?, String> COL_CEDULA_PAC;
    @FXML
    private TableColumn<?, String> COL_CORREO_PAC;
    @FXML
    private TableColumn<?, String> COL_GENERO_PAC;
    @FXML
    private TableColumn<?, String> COL_FECHANACIMIENTO_PAC;
    @FXML
    private JFXTextField txtPApellido;
    @FXML
    private JFXTextField txtSApellido;
    @FXML
    private JFXRadioButton btnMujer;
    @FXML
    private JFXRadioButton btnHombre;
    
    
    @Override
    public void initialize() {
        /*btnAgregar1.setCursor(Cursor.HAND);
        btnBuscar.setCursor(Cursor.HAND);
        btnEditar1.setCursor(Cursor.HAND);
        btnEliminar1.setCursor(Cursor.HAND);
        /*
        /*typeKeys();
        pacienteService = new PacienteService();
        ms = new Mensaje();
        resp = pacienteService.getPacientes();
        pacientes = ((ArrayList<PacienteDto>) resp.getResultado("Pacientes"));
        
        COL_NOMBRE_PAC.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getNombre()));
        COL_PAPELLIDO_PAC.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getpApellido()));
        COL_SAPELLIDO_PAC.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getsApellido()));
        COL_CEDULA_PAC.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getCedula()));
        COL_CORREO_PAC.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getCorreo()));
        COL_GENERO_PAC.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getGenero()));
        COL_FECHANACIMIENTO_PAC.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getFechaNacimiento()!=null)?value.getValue().getFechaNacimiento().toString():"NULO"));
        
        items = FXCollections.observableArrayList(pacientes);
        table.setItems(items);*/
        //FechaDeNacimiento.getValue().
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
        return !txtNombre.getText().isEmpty() && !txtCedula.getText().isEmpty()
               && !txtPApellido.getText().isEmpty() && !txtSApellido.getText().isEmpty()
               && !FechaDeNacimiento.getValue().toString().isEmpty()
               && !txtCorreo.getText().isEmpty() && (btnHombre.isSelected() || btnMujer.isSelected());
    }
    
    void limpiarValores() {
        txtNombre.clear();
        txtPApellido.clear();
        txtSApellido.clear();
        txtCorreo.clear();
        txtCedula.clear();
        btnMujer.setSelected(false);
        btnHombre.setSelected(false);
        FechaDeNacimiento.setValue(null);
        table.getSelectionModel().clearSelection();
    }
    
    private void typeKeys() {
        txtNombre.setOnKeyTyped(Proyectos.aceptaCaracteres);
        txtSApellido.setOnKeyTyped(Proyectos.aceptaCaracteres);
        txtPApellido.setOnKeyTyped(Proyectos.aceptaCaracteres);
    }

    @FXML
    private void DatosPaciente(MouseEvent event) {
        
        
    
    }

}
