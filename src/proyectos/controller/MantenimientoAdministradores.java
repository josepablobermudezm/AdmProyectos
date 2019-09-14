
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import proyectos.util.Formato;
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
    private Respuesta resp;
    private Mensaje ms;
    private ObservableList items;
    @FXML
    private TableColumn<?, String> COL_NOMBRE_ADM;
    @FXML
    private TableColumn<?, String> COL_PAPELLIDO_ADM;
    @FXML
    private TableColumn<?, String> COL_SAPELLIDO_ADM;
    @FXML
    private TableColumn<?, String> COL_CEDULA_ADM;
    @FXML
    private TableColumn<?, String> COL_USUARIO_ADM;
    @FXML
    private TableColumn<?, String> COL_CONTRASENA_ADM;
    @FXML
    private TableColumn<?, String> COL_CORREO_ADM;
    @FXML
    private JFXTextField txtPapellido;
    @FXML
    private JFXTextField txtSapellido;
    @FXML
    private JFXTextField txtNombre;
    @FXML
    private JFXTextField txtCedula;
    @FXML
    private JFXTextField txtUsuario;
    @FXML
    private JFXTextField txtContraseña;
    @FXML
    private JFXTextField txtCorreo;
    @Override
    public void initialize() {
        /*
        COL_NOMBRE_ADM.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getCodigo() != null) ? value.getValue().getFolio() : "Sin Asignar"));
        COL_PAPELLIDO_ADM.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getFolio() != null) ? value.getValue().getFolio() : "Sin Asignar"));
        COL_SAPELLIDO_ADM.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getCarne() != null) ? value.getValue().getCarne() : "Sin Asignar"));
        COL_CEDULA_ADM.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getEstado()));
        COL_USUARIO_ADM.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getInicioJornada()!=null)?value.getValue().getInicioJornada():"NULO"));
        COL_CONTRASENA_ADM.setCellValueFactory(value -> new SimpleStringProperty((value.getValue().getFinJornada()!=null)?value.getValue().getFinJornada():"NULO"));
        COL_CORREO_ADM.setCellValueFactory(value -> new SimpleIntegerProperty((value.getValue().getEspacios()!=null)?value.getValue().getEspacios():0));
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
        txtCedula.clear();
        txtContraseña.clear();
        txtCorreo.clear();
        txtFiltroEmpleado.clear();
        txtNombre.clear();
        txtPapellido.clear();
        txtSapellido.clear();
        txtUsuario.clear();
    }

    boolean registroCorrecto() {
        return !txtCedula.getText().isEmpty() && !txtContraseña.getText().isEmpty() && !txtCorreo.getText().isEmpty()
                && !txtNombre.getText().isEmpty() && !txtPapellido.getText().isEmpty()
                && !txtSapellido.getText().isEmpty() && !txtUsuario.getText().isEmpty();
    }

    @FXML
    private void Filtrar(ActionEvent event) {
    }


    @FXML
    private void DatosAdministradores(MouseEvent event) {

    }

    @FXML
    private void agregar(ActionEvent event) {
    }
    //metodos extra
    // Da formato a los distintos elementos graficos
    public void iniciarObjetos(){
        txtNombre.setTextFormatter(Formato.getInstance().letrasFormat(20));
        txtContraseña.setTextFormatter(Formato.getInstance().maxLengthFormat(8));
        txtCorreo.setTextFormatter(Formato.getInstance().maxLengthFormat(20));
        txtPapellido.setTextFormatter(Formato.getInstance().letrasFormat(20));
        txtSapellido.setTextFormatter(Formato.getInstance().letrasFormat(20));
        txtUsuario.setTextFormatter(Formato.getInstance().maxLengthFormat(20));
        txtCedula.setTextFormatter(Formato.getInstance().cedulaFormat(10)); //revisar
    }
}
