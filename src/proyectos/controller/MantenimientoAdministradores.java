/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import proyectos.Proyectos;
import proyectos.util.Mensaje;
import proyectos.util.Respuesta;

/**
 * FXML Controller class
 *
 * @author Jose Pablo Bermudez
 */
public class MantenimientoAdministradores extends Controller {

    @FXML
    private ImageView omg;
    @FXML
    private Label Titulo;
    @FXML
    private TableView<?> table;
    @FXML
    private JFXButton btnEditar1;
    @FXML
    private JFXButton btnEliminar1;
    @FXML
    private JFXTextField txtFiltroEmpleado;
    @FXML
    private JFXButton btnBuscar;
    @FXML
    private TableColumn<?, String> COL_CODIGO_MEDICOS;
    @FXML
    private TableColumn<?, String> COL_FOLIO_MEDICOS;
    @FXML
    private TableColumn<?, String> COL_CARNE_MEDICOS;
    @FXML
    private TableColumn<?, String> COL_ESTADO_MEDICOS;
    @FXML
    private TableColumn<?, String> COL_INICIO_MEDICOS;
    @FXML
    private TableColumn<?, String> COL_FINAL_MEDICOS;
    @FXML
    private TableColumn<?, Number> COL_ESPACIOS_MEDICOS;
    @FXML
    private JFXTextField txtCodigo;
    @FXML
    private JFXTextField txtFolio;
    @FXML
    private JFXTextField txtCarne;
    @FXML
    private JFXTimePicker timePickerfinal;
    @FXML
    private JFXTimePicker timePickerInicio;
    private Respuesta resp;
    private Mensaje ms;
    //private MedicoService medicoService;
    //private ArrayList<MedicoDto> medicos;
    private ObservableList items;
    @FXML
    private JFXTextField txtEspacio;
    //private MedicoDto medicoDto;
    @FXML
    private JFXTextField txtNombreUsuario;
    //private Idioma idioma;
    @Override
    public void initialize() {
        /*idioma = (Idioma) AppContext.getInstance().get("idioma");
        btnEditar1.setText(idioma.getProperty("Editar"));
        btnBuscar.setText(idioma.getProperty("Buscar"));
        COL_CODIGO_MEDICOS.setText(idioma.getProperty("Código"));
        COL_CARNE_MEDICOS.setText(idioma.getProperty("Carné"));
        COL_ESTADO_MEDICOS.setText("Estado");
        COL_INICIO_MEDICOS.setText(idioma.getProperty("Inicio")+" "+idioma.getProperty("Jornada"));
        COL_FINAL_MEDICOS.setText(idioma.getProperty("Final")+" "+idioma.getProperty("Jornada"));
        COL_ESPACIOS_MEDICOS.setText(idioma.getProperty("Espacio")+" "+idioma.getProperty("por")+" "+idioma.getProperty("Hora"));
        txtFiltroEmpleado.setPromptText(idioma.getProperty("Filtro")+" "+idioma.getProperty("porBy")+" "+"ID");
        */
  
        //medicoService = new MedicoService();
        /*ms = new Mensaje();
        resp = medicoService.getMedicos();
        medicos = ((ArrayList<MedicoDto>) resp.getResultado("Medicos"));

        COL_CODIGO_MEDICOS.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getCodigo() != null) ? value.getValue().getFolio() : "Sin Asignar"));
        COL_FOLIO_MEDICOS.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getFolio() != null) ? value.getValue().getFolio() : "Sin Asignar"));
        COL_CARNE_MEDICOS.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getCarne() != null) ? value.getValue().getCarne() : "Sin Asignar"));
        COL_ESTADO_MEDICOS.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getEstado()));
        COL_INICIO_MEDICOS.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getInicioJornada()!=null)?value.getValue().getInicioJornada():"NULO"));
        COL_FINAL_MEDICOS.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getFinJornada()!=null)?value.getValue().getFinJornada():"NULO"));
        COL_ESPACIOS_MEDICOS.setCellValueFactory(value -> new SimpleIntegerProperty((value.getValue().getEspacios()!=null)?value.getValue().getEspacios():0));
        items = FXCollections.observableArrayList(medicos);
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

    void limpiarValores() {
        txtNombreUsuario.clear();
        txtCarne.clear();
        txtCodigo.clear();
        txtEspacio.clear();
        txtFolio.clear();
        timePickerInicio.setValue(null);
        timePickerfinal.setValue(null);
        //table.getSelectionModel().clearSelection();
    }

    boolean registroCorrecto() {
        return !txtNombreUsuario.getText().isEmpty() && !txtCarne.getText().isEmpty() && !txtCodigo.getText().isEmpty()
                && !txtFolio.getText().isEmpty() && !txtEspacio.getText().isEmpty()
                && !timePickerInicio.getValue().toString().isEmpty() && !timePickerfinal.getValue().toString().isEmpty();
    }

    @FXML
    private void Filtrar(ActionEvent event) {
    }

    private void typeKeys() { 
        txtEspacio.setOnKeyTyped(Proyectos.aceptaNumeros);
    }

    @FXML
    private void DatosMedico(MouseEvent event) {

    }

    @FXML
    private void agregar(ActionEvent event) {
    }
}
