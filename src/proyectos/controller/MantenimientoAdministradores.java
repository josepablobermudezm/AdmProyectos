
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
public class MantenimientoAdministradores extends Controller  {

    @FXML
    private ImageView omg;
    @FXML
    private Label Titulo;
    @FXML
    private JFXTextField txtFiltroEmpleado;
    @FXML
    private JFXButton btnBuscar;
    @FXML
    private JFXTextField txtNombre;
    @FXML
    private JFXTextField txtPapellido;
    @FXML
    private JFXTextField txtSapellido;
    @FXML
    private JFXTextField txtCedula;
    @FXML
    private JFXTextField txtUsuario;
    @FXML
    private JFXTextField txtContrasenna;
    @FXML
    private JFXTextField txtCorreo;
    @FXML
    private JFXButton btnEditar1;
    @FXML
    private JFXButton btnEliminar1;

    
    @Override
    public void initialize() {
        
        
    }

    @FXML
    private void Filtrar(ActionEvent event) {
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

}
