package net.ictcampus.projekt.figure;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class BlackBishop extends Group {

  public BlackBishop() {

    Image bishop = new Image("BishopBlack.png");

    ImageView view = new ImageView(bishop);
    view.setScaleX(1.8);
    view.setScaleY(1.8);


    view.setOnMouseClicked(this::processMousClicke);

    getChildren().add(view);
  }

  private void processMousClicke(MouseEvent mouseEvent) {

  }
}
