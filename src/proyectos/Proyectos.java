/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import proyectos.util.FlowController;

/**
 *
 * @author Jose Pablo Bermudez
 */
public class Proyectos extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FlowController.getInstance().InitializeFlow(stage, null);
        FlowController.getInstance().goMain();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public final static EventHandler<KeyEvent> aceptaCaracteres = (KeyEvent event) -> {
        if (Character.isDigit(event.getCharacter().charAt(0))) {
            event.consume();
        }
    };

    public final static EventHandler<KeyEvent> aceptaNumeros = (KeyEvent event) -> {
        if (!Character.isDigit(event.getCharacter().charAt(0))) {
            event.consume();
        }
    };

    public final static EventHandler<KeyEvent> noEscribir = (KeyEvent event) -> {
        event.consume();
    };
    
    public final static EventHandler<KeyEvent> sinEspacios = (KeyEvent event) -> {
        if(event.getCode() == event.getCode().SPACE){
            event.consume();
        }
        
    };
    
}
