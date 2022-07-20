package com.elijahpiper;

import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;

public class Map {

    public final int GRID_SIZE = 10;
    public final int CELL_SIZE = 100; // Pixels
    public final int CELL_PADDING = 1; // Pixels
    private TilePane layout;
    private Image stoneImage = new Image("C:\\GenSpark\\Projects\\Humans-vs-Goblins\\src\\main\\resources\\stone.png", CELL_SIZE, CELL_SIZE, false, false);

    public Map() {
        layout = new TilePane(CELL_PADDING, CELL_PADDING);
        //layout.setPrefColumns(GRID_SIZE);
        //layout.setPrefRows(GRID_SIZE);

        for (int i = 1; i <= GRID_SIZE * GRID_SIZE; i++) {
            ImageView tileBackground = new ImageView(stoneImage);
            tileBackground.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
                System.out.println("Tile clicked");
                e.consume();
            });
            tileBackground.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET, e -> {
                System.out.println("Tile entered");
                e.consume();
            });
            layout.getChildren().add(new ImageView(stoneImage));

            }
        }

    public TilePane getLayout() {
        return layout;
    }
}
