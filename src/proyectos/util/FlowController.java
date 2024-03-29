/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import javafx.animation.FadeTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import proyectos.Proyectos;
import proyectos.controller.Controller;
import javafx.scene.image.Image;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author esanchez
 */
public class FlowController {

   private static FlowController INSTANCE = null;
    private static Stage mainStage;
    private static ResourceBundle idioma;
    private static HashMap<String, FXMLLoader> loaders = new HashMap<>();

    private Stage stage;

    private FlowController() {
    }

    private static void createInstance() {
        if (INSTANCE == null) {
            synchronized (FlowController.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FlowController();
                }
            }
        }
    }

    public static FlowController getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static Stage getMainStage() {
        return mainStage;
    }

    public static void setMainStage(Stage mainStage) {
        FlowController.mainStage = mainStage;
    }

    public void InitializeFlow(Stage stage, ResourceBundle idioma) {
        getInstance();
        this.mainStage = stage;
        this.idioma = idioma;
    }

    private FXMLLoader getLoader(String name) {
        FXMLLoader loader = loaders.get(name);
        if (loader == null) {
            synchronized (FlowController.class) {
                if (loader == null) {
                    try {
                        loader = new FXMLLoader(Proyectos.class.getResource("view/" + name + ".fxml"), this.idioma);
                        loader.load();
                        loaders.put(name, loader);
                    } catch (Exception ex) {
                        loader = null;
                        java.util.logging.Logger.getLogger(FlowController.class.getName()).log(Level.SEVERE, "Creando loader [" + name + "].", ex);
                    }
                }
            }
        }
        return loader;
    }

    public void goMain() {
        try {
            this.mainStage.setScene(new Scene(FXMLLoader.load(Proyectos.class.getResource("view/Inicio.fxml"), this.idioma)));
            this.mainStage.setTitle("Administrador de Proyectos");
            this.mainStage.getIcons().add(new Image(Proyectos.class.getResourceAsStream("resources/icon.png")));
            this.mainStage.show();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FlowController.class.getName()).log(Level.SEVERE, "Error inicializando la vista de inicio.", ex);
        }
    }

    public void goView(String viewName) {
        goView(viewName, "Center", null);
    }

    public void goView(String viewName, String accion) {
        goView(viewName, "Center", accion);
    }

    public void goView(String viewName, String location, String accion) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.setAccion(accion);
        controller.initialize();
        this.stage = controller.getStage();
        if (stage == null) {
            stage = this.mainStage;
            controller.setStage(stage);
        }
        switch (location) {
            case "Center":
                FadeTransition t1 = new FadeTransition(Duration.seconds(0.5), ((VBox) ((BorderPane) stage.getScene().getRoot()).getCenter()));
                t1.setByValue(-1);
                t1.setOnFinished(f -> {
                    ((VBox) ((BorderPane) stage.getScene().getRoot()).getCenter()).getChildren().clear();
                    ((VBox) ((BorderPane) stage.getScene().getRoot()).getCenter()).getChildren().add(loader.getRoot());
                    FadeTransition t2 = new FadeTransition(Duration.seconds(0.5), ((VBox) ((BorderPane) stage.getScene().getRoot()).getCenter()));
                    t2.setByValue(1);
                    t2.play();
                });
                t1.play();

                break;
            case "Top":
                break;
            case "Bottom":
                break;
            case "Right":
                break;
            case "Left":
                break;
            default:
                break;
        }
    }

    public void goViewInStage(String viewName, Stage stage) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.setStage(stage);
        stage.getScene().setRoot(loader.getRoot());
    }

    public void goViewInWindow(String viewName) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        
        Stage stageV = new Stage();
//        stage.getIcons().add(new Image(Tarea1.class.getResourceAsStream("resources/Preguntados.png")));
        stageV.setMinWidth(630);
        stageV.setMinHeight(420);
        stageV.setOnHidden((WindowEvent event) -> {
        });
        controller.setStage(stageV);
        controller.initialize();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        stageV.setScene(scene);
        stageV.centerOnScreen();
        stageV.show();

    }

    public void goViewInWindowTransparent(String viewName) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        Stage stage = new Stage();
        controller.setStage(stage);
        controller.initialize();
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.getIcons().add(new Image(Proyectos.class.getResourceAsStream("resources/icon.png")));
        stage.setTitle("Administrador de Proyectos");
//        stage.setMinWidth(630);
//        stage.setMinHeight(420);
        stage.setOnHidden((WindowEvent event) -> {
        });
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    public void goViewInWindowModal(String viewName, Stage parentStage, Boolean resizable) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.initialize();
        Stage stage = new Stage();
        stage.getIcons().addAll(parentStage.getIcons());
        stage.setTitle("Proyect Manager");
        stage.setResizable(resizable);
        stage.setOnHidden((WindowEvent event) -> {
            controller.getStage().getScene().setRoot(new Pane());
            controller.setStage(null);
        });
        controller.setStage(stage);
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(parentStage);
        stage.centerOnScreen();
        stage.show();

    }

    public void goViewInWindowModalUndecorated(String viewName, Stage parentStage, Boolean resizable) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.initialize();
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
//        stage.getIcons().addAll(parentStage.getIcons());
//        stage.setTitle("UNA PLANILLA");
        stage.setResizable(resizable);
        stage.setOnHidden((WindowEvent event) -> {
            controller.getStage().getScene().setRoot(new Pane());
            controller.setStage(null);
        });
        controller.setStage(stage);
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(parentStage);
        stage.centerOnScreen();
        stage.showAndWait();

    }

    public Controller getController(String viewName) {
        return getLoader(viewName).getController();
    }

    public boolean removeView(String viewName) {
        return loaders.remove(viewName) == null ? false : true;

    }

    public static void setIdioma(ResourceBundle idioma) {
        FlowController.idioma = idioma;
    }

    public void initialize() {
        this.loaders.clear();
    }

    public void salir() {
        this.mainStage.close();
    }

    public void cerrar(Stage stage) {
        stage.close();
    }

    public void desvincular(String viewName) {
        loaders.remove(viewName);
    }

}