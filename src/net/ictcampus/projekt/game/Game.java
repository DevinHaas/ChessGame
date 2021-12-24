package net.ictcampus.projekt.game;


import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import net.ictcampus.projekt.figure.ChessPiece;
import net.ictcampus.projekt.gui.ChessBoard;

public class Game extends Application {

  public void start(Stage primaryStage) {

    ChessBoard board = new ChessBoard();
    Updater updater = new Updater(board, board.getBlackPawns(), board.getWhitePawns());
    Controller controller = new Controller(board);

    Group root = new Group(board);
    root.setTranslateX(30);
    Scene scene = new Scene(root, 1200, 1000, Color.GRAY);

    scene.setOnMouseReleased(
            d -> {
                updater.updateBoard();
            });

    scene.setOnMouseReleased(
        e -> {
          int corX = (int) ((e.getX()) / board.getGritX());
          int corY = (int) ((e.getY()) / board.getGritY());
          System.out.println("xCor" + corX);
          System.out.println("yCor" + corY);

          //controller.hidePossibleMoves();

          Object target = e.getTarget();

          if (target instanceof ChessPiece chessPiece){
              controller.logics(corX, corY, chessPiece);

          }
        });

    primaryStage.setTitle("Chess Board");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

}
