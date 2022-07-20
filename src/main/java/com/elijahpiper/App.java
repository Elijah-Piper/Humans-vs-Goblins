package com.elijahpiper;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;


/**
 * JavaFX App
 */
public class App extends Application {

    public Stage window;
    public Map map;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        map = new Map();

        window.setTitle("Humans vs Goblins");

        int mapDim = (map.CELL_SIZE * map.GRID_SIZE) + (map.CELL_PADDING * map.GRID_SIZE - 1);
        Scene gameScene = new Scene(map.getLayout(), mapDim, mapDim);
        gameScene.setFill(Color.DARKOLIVEGREEN);
        window.setScene(gameScene);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }

}