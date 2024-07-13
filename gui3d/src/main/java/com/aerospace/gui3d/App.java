package com.aerospace.gui3d;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The main JavaFX application class.
 * This class initializes and launches the JavaFX application, loading the primary FXML file.
 */
public class App extends Application {

    private static Scene scene;
    /**
     * Starts the JavaFX application.
     *
     * @param stage The primary stage for the application
     * @throws IOException If the primary FXML file cannot be loaded
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 1280, 720);
        stage.setScene(scene);
        stage.show();
    }
    /**
     * Changes the root FXML file of the scene.
     *
     * @param fxml The name of the FXML file to load (without the ".fxml" extension)
     * @throws IOException If the specified FXML file cannot be loaded
     */
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    /**
     * Loads an FXML file and returns its root node.
     *
     * @param fxml The name of the FXML file to load (without the ".fxml" extension)
     * @return The root node of the loaded FXML file
     * @throws IOException If the specified FXML file cannot be loaded
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("fxml/" +  fxml + ".fxml"));
        return fxmlLoader.load();
    }
    /**
     * The main method to launch the JavaFX application.
     *
     * @param args Command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        launch();
    }

}