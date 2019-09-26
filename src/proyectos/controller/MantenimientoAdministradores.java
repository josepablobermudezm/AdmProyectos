
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
import proyectos.util.FlowController;
import proyectos.util.Formato;
import proyectos.util.Mensaje;
import proyectos.util.Respuesta;

/**
 * FXML Controller class
 *
 * @author Jose Pablo Bermudez
 */
public class MantenimientoAdministradores extends Controller{
    
    @FXML
    private ImageView omg;
    @FXML
    private Label Titulo;
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
    private AdministradorDto administrador;
    private List<Node> requeridos = new ArrayList<>();
    @FXML
    private JFXRadioButton btnActivo;
    @FXML
    private ToggleGroup Estado;
    @FXML
    private JFXRadioButton btnInactivo;
    
    @Override
    public void initialize() {
        indicarRequeridos();
        Formato();
        
        administrador = (AdministradorDto) AppContext.getInstance().get("AdministradorDto");
        bindAdmin();
        
    }


    @FXML
    private void editar(ActionEvent event) {
        Respuesta respuesta = new AdministradorService().guardarAdministrador(administrador);
        if(respuesta.getEstado()){
            unbindAdmin();
            administrador = (AdministradorDto)respuesta.getResultado("AdministradorDto");
            bindAdmin();
            new Mensaje().showModal(Alert.AlertType.INFORMATION, "Información de Registro", this.getStage(), "Cuenta Actualizada Exitosamente.");
        }else{
            new Mensaje().showModal(Alert.AlertType.ERROR, "Información de Registro", this.getStage(), "Error de Actualización: "+respuesta.getMensaje());
        }
    }

    @FXML
    private void eliminar(ActionEvent event) {
        if(new Mensaje().showConfirmation("Eliminar Cuenta", this.getStage(), "Se eliminará la cuenta por completo y todo lo relacionado a la misma "
                + "¿En verdad desea Continuar? Los Datos no se podrán recuperar")){
            Respuesta respuesta = new AdministradorService().eliminarAdministrador(administrador.getAdnId());
            if(respuesta.getEstado()){
                new Mensaje().showModal(Alert.AlertType.CONFIRMATION, "Eliminar Cuenta", this.getStage(), "Cuenta Eliminada con éxito. El programa cerrará la sesión");
                FlowController.getInstance().initialize();
                this.getStage().close();
                FlowController.getInstance().goViewInWindowTransparent("Ingresar");
            }else{
                new Mensaje().showModal(Alert.AlertType.ERROR, "Eliminar Cuenta", this.getStage(), respuesta.getMensaje());
            }
        }
    }

    @FXML
    private void limpiarRegistro(ActionEvent event) {
        
    }
    
    public void Formato(){
        txtPapellido.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
        txtSapellido.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
        txtCedula.setTextFormatter(Formato.getInstance().cedulaFormat(15));
        txtContrasenna.setTextFormatter(Formato.getInstance().maxLengthFormat(15));
        txtCorreo.setTextFormatter(Formato.getInstance().maxLengthFormat(50));
        txtNombre.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
        txtUsuario.setTextFormatter(Formato.getInstance().maxLengthFormat(30));
    }
    
    public void indicarRequeridos() {
        requeridos.clear();
        requeridos.addAll(Arrays.asList(txtNombre, txtPapellido, txtSapellido, txtCedula, txtCorreo, txtUsuario, txtContrasenna));
    }
    
    public String validarRequeridos() {
        Boolean validos = true;
        String invalidos = "";
        for (Node node : requeridos) {
            if (((JFXTextField) node).getText() != null || ((JFXTextField) node).getText() != "") {
                if(((JFXTextField) node).getText().isEmpty()){
                    if (validos) {
                        invalidos += ((JFXTextField) node).getPromptText();
                    } else {
                        invalidos += ", " + ((JFXTextField) node).getPromptText();
                    }
                    validos = false;
                }
            }
        }
        if (validos) {
            return "";
        } else {
            return "Campos requeridos o con problemas de formato [" + invalidos + "].";
        }
    }
    

    private void bindAdmin(){
        txtPapellido.textProperty().bindBidirectional(administrador.adnPapellidoP);
        txtSapellido.textProperty().bindBidirectional(administrador.adnSapellidoP);
        txtCedula.textProperty().bindBidirectional(administrador.adnCedulaP);
        txtContrasenna.textProperty().bindBidirectional(administrador.adnContrasenaP);
        txtCorreo.textProperty().bindBidirectional(administrador.adnCorreoP);
        txtNombre.textProperty().bindBidirectional(administrador.adnNombreP);
        txtUsuario.textProperty().bindBidirectional(administrador.adnUsuarioP);
        btnActivo.selectedProperty().bindBidirectional(administrador.adnEstadoP);
    }
    
    
    
    private void unbindAdmin(){
        txtPapellido.textProperty().unbindBidirectional(administrador.adnPapellidoP);
        txtSapellido.textProperty().unbindBidirectional(administrador.adnSapellidoP);
        txtCedula.textProperty().unbindBidirectional(administrador.adnCedulaP);
        txtContrasenna.textProperty().unbindBidirectional(administrador.adnContrasenaP);
        txtCorreo.textProperty().unbindBidirectional(administrador.adnCorreoP);
        txtNombre.textProperty().unbindBidirectional(administrador.adnNombreP);
        txtUsuario.textProperty().unbindBidirectional(administrador.adnUsuarioP);
        btnActivo.selectedProperty().unbindBidirectional(administrador.adnEstadoP);
    }
    
    private void nuevoAdministrador(){
        unbindAdmin();
        administrador = new AdministradorDto();
        bindAdmin();
        txtNombre.requestFocus();
    }


    @FXML
    private void agregar(ActionEvent event) {
        
    }


}
