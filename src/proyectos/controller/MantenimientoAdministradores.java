
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.mail.MessagingException;
import proyectos.util.Formato;
import proyectos.util.Mensaje;
import proyectos.util.Respuesta;
import proyectos.model.AdministradorDto;
import proyectos.service.AdministradorService;

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
    private TableColumn<AdministradorDto, String> COL_NOMBRE_ADM;
    @FXML
    private TableColumn<AdministradorDto, String> COL_PAPELLIDO_ADM;
    @FXML
    private TableColumn<AdministradorDto, String> COL_SAPELLIDO_ADM;
    @FXML
    private TableColumn<AdministradorDto, String> COL_CEDULA_ADM;
    @FXML
    private TableColumn<AdministradorDto, String> COL_USUARIO_ADM;
    @FXML
    private TableColumn<AdministradorDto, String> COL_CONTRASENA_ADM;
    @FXML
    private TableColumn<AdministradorDto, String> COL_CORREO_ADM;
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
    private AdministradorDto administradorDto;
    private AdministradorService administradorService;
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
    private void agregar(ActionEvent event) {
        
        //if (registroCorrecto()) {

            String nombre = txtNombre.getText();
            String papellido = txtPapellido.getText();
            String sapellido = txtSapellido.getText();
            String correo = txtCorreo.getText();
            String cedula = txtCedula.getText();
            String usuario = txtUsuario.getText();
            String clave = txtContraseña.getText();
            Long version = new Long(1);
            administradorDto = new AdministradorDto(null, nombre, papellido, sapellido, cedula, usuario, correo, clave, version, "A");
            /*try {
                resp = administradorService.guardarAdministrador(administradorDto);
                AdministradorDto = (AdministradorDto) resp.getResultado("Administrador");
                resp1 = AdministradorService.activarAdministrador(AdministradorDto.getContrasennaTemp());
                //Envia correo de activacion
                Correos.getInstance().linkActivacion(nombreAdministrador, correo, resp1.getMensaje());

                if (tipoAdministrador.equals("M")) {
                    medicoDto = new MedicoDto(null, null, null, null, "I", null,
                            null, null, AdministradorDto, new Long(1));
                    resp1 = medicoService.guardarMedico(medicoDto);
                    medicoDto = (MedicoDto) resp1.getResultado("Medico");
                }

                ms.showModal(Alert.AlertType.INFORMATION, "Informacion de guardado", this.getStage(), resp.getMensaje());
                limpiarRegistro();
                Administradors = (ArrayList) AdministradorService.getAdministradors().getResultado("Administradors");

                table.getItems().clear();
                items = FXCollections.observableArrayList(Administradors);
                table.setItems(items);

            } catch (IOException | MessagingException e) {
                ms.showModal(Alert.AlertType.ERROR, "Informacion de guardado", this.getStage(), e.getMessage());
            }
        }*/
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
        //txtAdministrador.clear();
    }

    boolean registroCorrecto() {
        return !txtCedula.getText().isEmpty() && !txtContraseña.getText().isEmpty() && !txtCorreo.getText().isEmpty()
                && !txtNombre.getText().isEmpty() && !txtPapellido.getText().isEmpty()
                && !txtSapellido.getText().isEmpty()  
                //!txtAdministrador.getText().isEmpty()
                ;
    }

    @FXML
    private void Filtrar(ActionEvent event) {
    }


    @FXML
    private void DatosAdministradores(MouseEvent event) {

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
