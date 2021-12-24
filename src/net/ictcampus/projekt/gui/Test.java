package net.ictcampus.projekt.gui;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import net.ictcampus.projekt.figure.BlackPawn;
import net.ictcampus.projekt.figure.WhitePawn;

import java.util.ArrayList;

public class Test extends GridPane {
    int GRIT_X = 120;
    int GRIT_Y = 120;

    public Test(){

        for (int i = 0; i < 8; i++) {


            BlackPawn blackPawn = new BlackPawn(i, 1);

            GridPane.setHalignment(blackPawn, HPos.CENTER);
            GridPane.setValignment(blackPawn, VPos.CENTER);

            add(blackPawn, blackPawn.getxCor(), blackPawn.getyCor());
        }
    }

    public void showPossibleMoves(int xCor, int yCor){

        ArrayList<Node> childrens = new ArrayList<>(getManagedChildren());

        for (Node node : childrens){
            if(getRowIndex(node) == xCor && getColumnIndex(node) == yCor) {
                System.out.println(node);
                break;
            }

        }



    }

    public int getGritX() {
        return GRIT_X;
    }

    public int getGritY() {
        return GRIT_Y;
    }
}
