package net.ictcampus.projekt.game;

import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import net.ictcampus.projekt.figure.ChessPiece;
import net.ictcampus.projekt.gui.ChessBoard;
import java.util.ArrayList;
import java.util.Arrays;

import static javafx.scene.layout.GridPane.getColumnIndex;
import static javafx.scene.layout.GridPane.getRowIndex;

public class Controller {
    ChessBoard board;

    public Controller(ChessBoard board){
        this.board = board;

    }

    public void logics(int xCor, int yCor, ChessPiece piece) {

        System.out.println("color " + piece.getColor());
        checkPossibleMoves(piece);
        showPossibleMoves(piece);


    }


    public void checkPossibleMoves(ChessPiece piece){
        ArrayList<int[]> realPossibleMoves = new ArrayList<>() ;

        for (int[] number : piece.getPossibleMoves()) {
            System.out.println(Arrays.toString(number));
            if (checkIfEmpty(number[0], number[1]) ){
                realPossibleMoves.add(number);
            }
        }

        System.out.println("Captures");
        for (int[] number : piece.getPossibleCaptures()){
            System.out.println(Arrays.toString(number));
            ChessPiece figure = getNodeByIndex(number[0], number[1]);
            if (!checkIfEmpty(number[0],number[1] )){
                if (!(figure.getColor().equals(piece.getColor())) && !figure.isKing()){
                    realPossibleMoves.add(number);
                }
            }

        }

        piece.setRealPossibleMoves(realPossibleMoves);
    }

    public ChessPiece getNodeByIndex (int row, int colum) {
         ChessPiece result = null;
        ObservableList<Node> childrens = board.getChildren();

        for (Node node : childrens) {
            if((getRowIndex(node) == colum) && (getColumnIndex(node) == row)&& (node instanceof  ChessPiece chessPiece)) {
                result = chessPiece;
                break;
            }
        }
        return result;
    }


    public boolean checkIfEmpty (int row, int colum){
        ObservableList<Node> childrens = board.getChildren();

        for (Node node : childrens) {
            if((getRowIndex(node) == colum) && (getColumnIndex(node) == row)&& (node instanceof  ChessPiece)) {
                return false;
            }
        }
        return true;
    }

    public void showPossibleMoves(ChessPiece chesspiece){
        for (int[] number : chesspiece.getRealPossibleMoves()) {

            System.out.println(getNodeByIndex(number[0], number[1]));

            Circle fieldEmptyCircle = new Circle(20, Color.GRAY);
            board.add(fieldEmptyCircle, number[0], number[1]);
            GridPane.setHalignment(fieldEmptyCircle, HPos.CENTER);
            GridPane.setValignment(fieldEmptyCircle, VPos.CENTER);
        }
    }

    public void hidePossibleMoves(){
        Node aim = null;
        ObservableList<Node> children = board.getChildren();

        for(Node node : children){
            if (node instanceof Circle){
                board.getChildren().remove(node);
            }
        }
    }
}
