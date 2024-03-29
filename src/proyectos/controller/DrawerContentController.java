/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.controller;

import com.jfoenix.controls.JFXButton;
import proyectos.util.AppContext;
import proyectos.Proyectos;
import proyectos.controller.Controller;
import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import proyectos.model.AdministradorDto;
import proyectos.util.FlowController;

/**
 * FXML Controller class
 *
 * @author Jose Pablo Bermudez
 */
public class DrawerContentController extends Controller {

    @FXML
    private ImageView image;
    static public File filePath2;
    @FXML
    private JFXButton btnExit;
    @FXML
    private JFXButton btnAdministradores;
    @FXML
    private JFXButton btnProyectos;
    @FXML
    private JFXButton btnResumen;

    @FXML
    private void exit(ActionEvent event) {
        FlowController.getMainStage().close();
        FlowController.getInstance().initialize();
        AppContext.getInstance().initialize();
        FlowController.getInstance().goViewInWindowTransparent("LogIn");
    }

   
    @Override
    public void initialize() { 
        
        Image img;
        try {
            img = new Image("/proyectos/resources/user (4).jpg");
            image.setImage(img);
        } catch (Exception e) {
        }
        
        
        AdministradorDto adm = (AdministradorDto) AppContext.getInstance().get("AdministradorDto");
/*
        Image img7;
        try {
            img7 = new Image("/horarios/resources/user2.png");
            img1.setImage(img7);
        } catch (Exception e) {

        }
        Image img8;
        try {
            img8 = new Image("/horarios/resources/resume.png");
            img2.setImage(img8);
        } catch (Exception e) {
        }
        Image img9;
        try {
            img9 = new Image("/horarios/resources/portfolio.png");
            img3.setImage(img9);
        } catch (Exception e) {
        }
        Image img10;
        try {
            img10 = new Image("/horarios/resources/hiring.png");
            img4.setImage(img10);
        } catch (Exception e) {
        }
        Image img11;
        try {
            img11 = new Image("/horarios/resources/calendar.png");
            img5.setImage(img11);
        } catch (Exception e) {
        }
        Image img12;
        try {
            img12 = new Image("/horarios/resources/logout.png");
            img6.setImage(img12);
        } catch (Exception e) {
        }*/
    }  
    @FXML
    private void Administradores(ActionEvent event) {
        //FlowController.getInstance().goView("MantenimientoAdministradores");
        FlowController.getInstance().initialize();
        FlowController.getInstance().goView("MantenimientoAdministradores", "Center", "");
    }

    @FXML
    private void btnProyectos(ActionEvent event) {
        //FlowController.getInstance().goView("MantenimientoProyectos");
        FlowController.getInstance().initialize();
        FlowController.getInstance().goView("MantenimientosProyectos", "Center", "");
    }

    @FXML
    private void btnResumen(ActionEvent event) {
        
        FlowController.getInstance().initialize();
        FlowController.getInstance().goView("ResumenSeguimiento", "Center", "");
    }

}
