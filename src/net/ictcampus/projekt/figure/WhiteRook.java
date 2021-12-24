package net.ictcampus.projekt.figure;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WhiteRook extends Group {
    public WhiteRook(){

        Image pawn = new Image("RookWhite.png");

        ImageView view = new ImageView(pawn);
        view.setScaleX(1.8);
        view.setScaleY(1.8);

        getChildren().add(view);

    }
}
