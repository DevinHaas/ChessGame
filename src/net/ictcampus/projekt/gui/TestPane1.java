package net.ictcampus.projekt.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TestPane1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Test test = new Test();
        Group root = new Group(test);
        root.setTranslateX(30);
        Scene scene = new Scene(root, 1200, 1000, Color.GRAY);

        scene.setOnMouseReleased(
                e -> {
                    int corX = (int) ((e.getX()) / test.getGritX());
                    int corY = (int) ((e.getY()) / test.getGritY());

                    Object target = e.getTarget();

                    if (target instanceof ImageView) {
                        test.showPossibleMoves(corX, corY);
                        System.out.println("I'm a image view");
                    }
                });

        primaryStage.setTitle("Chess Board");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
