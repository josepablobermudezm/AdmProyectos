/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.controller;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import proyectos.model.AdministradorDto;
import proyectos.util.AppContext;

/**
 *
 * @author Jose Pablo Bermudez
 */
public class InicioController extends Controller {
    
    private Label label;
    @FXML
    private BorderPane borderPane;
    @FXML
    private AnchorPane anchorp;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private StackPane st;
    @FXML
    private ImageView omg;
    @FXML
    private Label Titulo;
    @FXML
    private JFXHamburger hamburger;
    private BorderPane Panel = new BorderPane();
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize() {

        Image omg1;
        try {
            omg1 = new Image("/proyectos/resources/background (1).jpg");
            omg.setImage(omg1);
        } catch (Exception e) {
        }
        AdministradorDto adm = (AdministradorDto) AppContext.getInstance().get("AdministradorDto");
        try {
        VBox box = FXMLLoader.load(getClass().getResource("/proyectos/view/drawerContent.fxml"));
        drawer.setSidePane(box);
            HamburgerBackArrowBasicTransition burgerTask2 = new HamburgerBackArrowBasicTransition(hamburger);
            burgerTask2.setRate(-1);
            drawer.open();
            hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
                burgerTask2.setRate(burgerTask2.getRate() * -1);
                burgerTask2.play();

                if (drawer.isShown()) {
                    drawer.close();
                } else {
                    drawer.open();
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public void SetBorderPane(BorderPane pane) {
        this.Panel = pane;
        Listener();
    }

    public void Listener() {
        Panel.widthProperty().addListener(x -> {
            this.drawer.setPrefWidth(Panel.getWidth() - 200);
        });

        Panel.heightProperty().addListener(v -> {

        });
    }
    
}
