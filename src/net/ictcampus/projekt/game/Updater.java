package net.ictcampus.projekt.game;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.GridPane;
import net.ictcampus.projekt.figure.BlackPawn;
import net.ictcampus.projekt.figure.WhitePawn;
import net.ictcampus.projekt.gui.ChessBoard;

import java.util.List;

public class Updater {
  ChessBoard board;
  List<BlackPawn> blackPawns;
  List<WhitePawn> whitePawns;

  public Updater(ChessBoard board, List<BlackPawn> blackPawns, List<WhitePawn> whitePawns) {
    this.board = board;
    this.blackPawns = blackPawns;
    this.whitePawns = whitePawns;
  }

  public void updateBoard() {

    updateBlackPawns();
    updateWhitePawns();
  }

  public void updateBlackPawns() {

    for (BlackPawn pawn : blackPawns) {
      board.getChildren().remove(pawn);
      GridPane.setHalignment(pawn, HPos.CENTER);
      GridPane.setValignment(pawn, VPos.CENTER);
      board.add(pawn, pawn.getxCor(), pawn.getyCor());
    }
  }

  public void updateWhitePawns() {
    for (WhitePawn pawn : whitePawns) {
      board.getChildren().remove(pawn);
      GridPane.setHalignment(pawn, HPos.CENTER);
      GridPane.setValignment(pawn, VPos.CENTER);
      board.add(pawn, pawn.getxCor(), pawn.getyCor());
    }
  }
}
