package net.ictcampus.projekt.gui;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import net.ictcampus.projekt.figure.*;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard extends GridPane {

  private static final int GRIT_X = 120;
  private static final int GRIT_Y = 120;
  ArrayList<WhitePawn> whitePawns = new ArrayList<>(8);
  ArrayList<WhiteKnight> whiteKnights = new ArrayList<>(2);
  ArrayList<WhiteBishop> whiteBishops = new ArrayList<>(2);
  ArrayList<WhiteRook> whiteRooks = new ArrayList<>(2);
  ArrayList<BlackPawn> blackPawns = new ArrayList<>(8);
  ArrayList<BlackKnight> blackKnights = new ArrayList<>(2);
  ArrayList<BlackBishop> blackBishops = new ArrayList<>(2);
  ArrayList<BlackRook> blackRooks = new ArrayList<>(2);
  WhiteKing whiteKing;
  BlackKing blackKing;
  WhiteQueen whiteQueen;
  BlackQueen blackQueen;

  public ChessBoard() {

    createChessPattern();

    createPawnsBlack();
    createPawnsWhite();
    createRooksBlack();
    createRooksWhite();
    createBishopsBlack();
    createBishopsWhite();
    createKnightBlack();
    createKnightWhite();
    createBlackQueen();
    createWhiteQueen();
    createBlackKing();
    createWhiteKing();
  }

  public void createChessPattern() {
    boolean isWhite = true;
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {

        if (isWhite) {

          Rectangle rectLightBrown = new Rectangle(GRIT_X, GRIT_Y);
          rectLightBrown.setFill(Color.SANDYBROWN);
          add(rectLightBrown, i, j);

          isWhite = false;
        } else {
          Rectangle rectDarkBrown = new Rectangle(GRIT_X, GRIT_Y);
          rectDarkBrown.setFill(Color.SADDLEBROWN);
          rectDarkBrown.setStroke(Color.WHITE);
          add(rectDarkBrown, i, j);
          isWhite = true;
        }

        Circle fieldOccupiedCircle = new Circle(50);
        add(fieldOccupiedCircle, i, j);
        GridPane.setHalignment(fieldOccupiedCircle, HPos.CENTER);
        GridPane.setValignment(fieldOccupiedCircle, VPos.CENTER);
        fieldOccupiedCircle.setFill(null);
        fieldOccupiedCircle.setStroke(Color.rgb(191, 191, 191));
        fieldOccupiedCircle.setStrokeWidth(5);
        fieldOccupiedCircle.setVisible(false);
      }
      isWhite = !isWhite;
    }
  }

  public void createPawnsWhite() {

    for (int i = 0; i < 8; i++) {

      WhitePawn whitePawn = new WhitePawn(i, 6);
      GridPane.setHalignment(whitePawn, HPos.CENTER);
      GridPane.setValignment(whitePawn, VPos.CENTER);

      whitePawns.add(whitePawn);
      add(whitePawn, whitePawn.getxCor(), whitePawn.getyCor());
    }
  }

  public void createPawnsBlack() {

    for (int i = 0; i < 8; i++) {

      BlackPawn blackPawn = new BlackPawn(i, 1);

      GridPane.setHalignment(blackPawn, HPos.CENTER);
      GridPane.setValignment(blackPawn, VPos.CENTER);

      blackPawns.add(blackPawn);
      add(blackPawn, blackPawn.getxCor(), blackPawn.getyCor());
    }
  }

  public void createRooksBlack() {

    BlackRook blackRook1 = new BlackRook();

    GridPane.setHalignment(blackRook1, HPos.CENTER);
    GridPane.setValignment(blackRook1, VPos.CENTER);
    add(blackRook1, 0, 0);
    blackRooks.add(blackRook1);

    BlackRook blackRook2 = new BlackRook();

    GridPane.setHalignment(blackRook2, HPos.CENTER);
    GridPane.setValignment(blackRook2, VPos.CENTER);
    add(blackRook2, 7, 0);
    blackRooks.add(blackRook2);
  }

  public void createRooksWhite() {

    WhiteRook whiteRook1 = new WhiteRook();

    GridPane.setHalignment(whiteRook1, HPos.CENTER);
    GridPane.setValignment(whiteRook1, VPos.CENTER);
    add(whiteRook1, 0, 7);
    whiteRooks.add(whiteRook1);

    WhiteRook whiteRook2 = new WhiteRook();

    GridPane.setHalignment(whiteRook2, HPos.CENTER);
    GridPane.setValignment(whiteRook2, VPos.CENTER);
    add(whiteRook2, 7, 7);
    whiteRooks.add(whiteRook2);
  }

  public void createBishopsBlack() {
    BlackBishop blackBishop1 = new BlackBishop();

    GridPane.setHalignment(blackBishop1, HPos.CENTER);
    GridPane.setValignment(blackBishop1, VPos.CENTER);
    add(blackBishop1, 2, 0);
    blackBishops.add(blackBishop1);

    BlackBishop blackBishop2 = new BlackBishop();

    GridPane.setHalignment(blackBishop2, HPos.CENTER);
    GridPane.setValignment(blackBishop2, VPos.CENTER);
    add(blackBishop2, 5, 0);
    blackBishops.add(blackBishop2);
  }

  public void createBishopsWhite() {
    WhiteBishop whiteBishop1 = new WhiteBishop();

    GridPane.setHalignment(whiteBishop1, HPos.CENTER);
    GridPane.setValignment(whiteBishop1, VPos.CENTER);
    add(whiteBishop1, 2, 7);
    whiteBishops.add(whiteBishop1);

    WhiteBishop whiteBishop2 = new WhiteBishop();

    GridPane.setHalignment(whiteBishop2, HPos.CENTER);
    GridPane.setValignment(whiteBishop2, VPos.CENTER);
    add(whiteBishop2, 5, 7);
    whiteBishops.add(whiteBishop2);
  }

  public void createKnightBlack() {
    BlackKnight blackKnight1 = new BlackKnight();

    GridPane.setHalignment(blackKnight1, HPos.CENTER);
    GridPane.setValignment(blackKnight1, VPos.CENTER);
    add(blackKnight1, 1, 0);
    blackKnights.add(blackKnight1);

    BlackKnight blackKnight2 = new BlackKnight();

    GridPane.setHalignment(blackKnight2, HPos.CENTER);
    GridPane.setValignment(blackKnight2, VPos.CENTER);
    add(blackKnight2, 6, 0);
    blackKnights.add(blackKnight2);
  }

  public void createKnightWhite() {
    WhiteKnight whiteKnight1 = new WhiteKnight();

    GridPane.setHalignment(whiteKnight1, HPos.CENTER);
    GridPane.setValignment(whiteKnight1, VPos.CENTER);
    add(whiteKnight1, 1, 7);
    whiteKnights.add(whiteKnight1);

    WhiteKnight whiteKnight2 = new WhiteKnight();

    GridPane.setHalignment(whiteKnight2, HPos.CENTER);
    GridPane.setValignment(whiteKnight2, VPos.CENTER);
    add(whiteKnight2, 6, 7);
    whiteKnights.add(whiteKnight2);
  }

  public void createWhiteQueen() {
    whiteQueen = new WhiteQueen();

    GridPane.setHalignment(whiteQueen, HPos.CENTER);
    GridPane.setValignment(whiteQueen, VPos.CENTER);
    add(whiteQueen, 3, 7);
  }

  public void createBlackQueen() {
    blackQueen = new BlackQueen();

    GridPane.setHalignment(blackQueen, HPos.CENTER);
    GridPane.setValignment(blackQueen, VPos.CENTER);
    add(blackQueen, 3, 0);
  }

  public void createBlackKing() {
    blackKing = new BlackKing();

    GridPane.setHalignment(blackKing, HPos.CENTER);
    GridPane.setValignment(blackKing, VPos.CENTER);
    add(blackKing, 4, 0);
  }

  public void createWhiteKing() {
    whiteKing = new WhiteKing();

    GridPane.setHalignment(whiteKing, HPos.CENTER);
    GridPane.setValignment(whiteKing, VPos.CENTER);
    add(whiteKing, 4, 7);
  }

  public int getGritX() {
    return GRIT_X;
  }

  public int getGritY() {
    return GRIT_Y;
  }

  public List<BlackPawn> getBlackPawns() {
    return blackPawns;
  }

  public List<WhitePawn> getWhitePawns() {
    return whitePawns;
  }
}
