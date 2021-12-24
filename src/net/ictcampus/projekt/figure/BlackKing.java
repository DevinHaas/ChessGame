package net.ictcampus.projekt.figure;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BlackKing extends Group {
    public BlackKing() {

        Image pawn = new Image("KingBlack.png");

        ImageView view = new ImageView(pawn);
        view.setScaleX(1.8);
        view.setScaleY(1.8);

        getChildren().add(view);
    }

    public boolean isKing(){
        return true;
    }
}
