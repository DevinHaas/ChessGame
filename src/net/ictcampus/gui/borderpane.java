package net.ictcampus.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.awt.*;

public class borderpane extends Application {

    TextField textField;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        button1 = new Button("Top");
        button1.setPrefWidth(500);
        button1.setPrefHeight(50);
        root.setTop(button1);
        button1.setOnMouseClicked(this::topClicked);

        HBox box = new HBox();
        box.setPrefHeight(400);
        button3 = new Button("Left");
        button3.setOnMouseClicked(this::leftClicked);
        button3.setPrefWidth(125);
        button3.setPrefHeight(400);
        button4 = new Button("Center");
        button4.setOnMouseClicked(this::centerClicked);
        button4.setPrefWidth(250);
        button4.setPrefHeight(400);
        button5 = new Button("Right");
        button5.setOnMouseClicked(this::rigthClicked);
        button5.setPrefWidth(125);
        button5.setPrefHeight(400);

        box.getChildren().addAll(button3, button4, button5);
        root.setCenter(box);


        VBox vBox = new VBox();
        vBox.setPrefHeight(100);
        button2 = new Button("Bottom");
        button2.setOnMouseClicked(this::buttomClicked);
        button2.setPrefWidth(500);
        button2.setPrefHeight(50);
        textField = new TextField("Textfield");
        textField.setPrefWidth(500);
        vBox.getChildren().addAll(button2, textField);


        root.setBottom(vBox);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Vorgegebenes Gui");
        primaryStage.show();

    }

    private void centerClicked(MouseEvent mouseEvent) {
        String paint = button4.getBackground().getFills().get(0).getFill().toString();
        Color color = Color.web(paint);

        textField.setText("R: " + color.getRed()* 255 + ", G: " + color.getGreen()*255 +  ", B: " +color.getBlue()*255);
    }

    private void leftClicked(MouseEvent mouseEvent) {
        button4.setStyle("-fx-background-color: green");
    }

    private void rigthClicked(MouseEvent mouseEvent) {
        button4.setStyle("-fx-background-color: red");
    }

    private void buttomClicked(MouseEvent mouseEvent) {
    button4.setStyle("-fx-background-color: yellow");
    }

    private void topClicked(MouseEvent mouseEvent) {
        textField.setText("Mein kleiner Automat\n");
    }
}
