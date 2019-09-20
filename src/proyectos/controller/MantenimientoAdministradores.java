
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
    private JFXTextField txtCorreo;
    private AdministradorDto administradorDto;
    private AdministradorService administradorService;
    @FXML
    private JFXTextField txtContrasenna;
    private ArrayList<AdministradorDto> administradores;
    @Override
    public void initialize() {
        administradorService = new AdministradorService();
        administradorDto = new AdministradorDto();
        ms = new Mensaje();
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
        /*AdministradorService service = new AdministradorService();
        AdministradorDto admin = new AdministradorDto();
        
        
        Respuesta resp = service.guardarAdministrador(admin);
        if(resp.getEstado()){
            new Mensaje().showModal(Alert.AlertType.INFORMATION,"Informacion de guardado",this.getStage(),resp.getMensaje());
            //admin = (AdministradorDto)resp.getResultado("Administrador");
        }
        else{
            new Mensaje().showModal(Alert.AlertType.ERROR,"Informacion de guardado",this.getStage(),resp.getMensaje());
        }*/
        if (registroCorrecto()) {

            String nombre = txtNombre.getText();
            String papellido = txtPapellido.getText();
            String sapellido = txtSapellido.getText();
            String correo = txtCorreo.getText();
            String cedula = txtCedula.getText();
            String usuario = txtUsuario.getText();
            String clave = txtContrasenna.getText();
            Long version = new Long(1);
            administradorDto = new AdministradorDto(null, nombre, papellido, sapellido, cedula, usuario, correo, clave, version, "A");
            resp = administradorService.guardarAdministrador(administradorDto);
            administradorDto = (AdministradorDto) resp.getResultado("Administrador");
            //resp = AdministradorService.activarAdministrador(AdministradorDto.getContrasennaTemp());
            //Envia correo de activacion
            //Correos.getInstance().linkActivacion(nombreAdministrador, correo, resp1.getMensaje());
            ms.showModal(Alert.AlertType.INFORMATION, "Informacion de guardado", this.getStage(), resp.getMensaje());
            //limpiarRegistro1();
            //administradores = (ArrayList) administradorService.getAdministradors().getResultado("Administradors");
            //table.getItems().clear();
            //items = FXCollections.observableArrayList(Administradors);
            //table.setItems(items);
        }
    }
    
    
    @FXML
    private void editar(ActionEvent event) {

        
    }

    @FXML
    private void eliminar(ActionEvent event) {

        

    }

    private void limpiarRegistro1() {
        txtNombre.clear();
        txtCedula.clear();
        txtCorreo.clear();
        txtPapellido.clear();
        txtSapellido.clear();
        txtUsuario.clear();
        txtContrasenna.clear();
        table.getSelectionModel().clearSelection();
    }
    
    @FXML
    private void limpiarRegistro(ActionEvent event) {
        limpiarRegistro1();
    }

    void limpiarValores() {
        txtCedula.clear();
        txtContrasenna.clear();
        txtCorreo.clear();
        txtFiltroEmpleado.clear();
        txtNombre.clear();
        txtPapellido.clear();
        txtSapellido.clear();
        //txtAdministrador.clear();
    }

    boolean registroCorrecto() {
        return !txtCedula.getText().isEmpty() && !txtContrasenna.getText().isEmpty() && !txtCorreo.getText().isEmpty()
                && !txtNombre.getText().isEmpty() && !txtPapellido.getText().isEmpty()
                && !txtSapellido.getText().isEmpty() && !txtUsuario.getText().isEmpty();
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
        txtContrasenna.setTextFormatter(Formato.getInstance().maxLengthFormat(8));
        txtCorreo.setTextFormatter(Formato.getInstance().maxLengthFormat(20));
        txtPapellido.setTextFormatter(Formato.getInstance().letrasFormat(20));
        txtSapellido.setTextFormatter(Formato.getInstance().letrasFormat(20));
        txtUsuario.setTextFormatter(Formato.getInstance().maxLengthFormat(20));
        txtCedula.setTextFormatter(Formato.getInstance().cedulaFormat(10)); //revisar
    }
}
