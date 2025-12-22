package app;
// 7 Wonders Stats
// Player.java
// Aldo Saenz
// Created: Dedember 13, 2025
// Updated: Dedember 21, 2025
// Description: This is the main class for the 7 Wonders Stats application. It sets up the JavaFX application and initializes the user interface.
// --------------------------------------------------------------------------------------------------------------------------------------------------

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SevenWondersStats extends Application {

    @Override
    public void start(Stage stage) {
        // Build UI Here
        Label label = new Label("Seven Wonders Stats");
        Scene scene = new Scene(label, 1920, 1080);

        stage.setScene(scene);
        stage.setTitle("Seven Wonders");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}