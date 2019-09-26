/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.controller;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import proyectos.Proyectos;
import proyectos.util.Mensaje;
import proyectos.util.Respuesta;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;

/**
 * FXML Controller class
 *
 * @author Jose Pablo Bermudez
 */
public class ResumenSeguimientoController extends Controller  {

    @FXML
    private Label Titulo;
    @FXML
    private JFXSlider slider;
    @FXML
    private TableView<?> table;

    
    
    @Override
    public void initialize() {
        /*webservice.WS_Service service = new webservice.WS_Service();
        
        QName portQName = new QName("http://webService/" , "WSPort");
        String req = "<guardar  xmlns=\"http://webService/\"><usuario>ENTER VALUE</usuario></guardar>";
        
        try { // Call Web Service Operation
            
            Dispatch<Source> sourceDispatch = null;
            sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);
            Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }*/
        

    }
    

    

  
}
