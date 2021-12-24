package net.ictcampus.projekt.figure;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WhiteQueen extends Group {
    public WhiteQueen(){

        Image pawn = new Image("QueenWhite.png");

        ImageView view = new ImageView(pawn);
        view.setScaleX(1.8);
        view.setScaleY(1.8);

        getChildren().add(view);

    }
}
