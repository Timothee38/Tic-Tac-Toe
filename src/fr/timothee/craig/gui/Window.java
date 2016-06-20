package fr.timothee.craig.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Timothee on 06/06/2016.
 */
public class Window extends Application {

    public void open() {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(new Scene(createGrid()));
        primaryStage.show();
    }

    private Group createGrid() {
        Group group = new Group();
        //Todo here: Create the grid
        return group;
    }
}
