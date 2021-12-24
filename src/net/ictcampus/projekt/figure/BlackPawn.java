package net.ictcampus.projekt.figure;

import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class BlackPawn extends ChessPiece {

  public BlackPawn(int xCor, int yCor) {
    super(xCor, yCor, "PawnBlack.png", 1.4, "black");
  }

  @Override
  public void move(MouseEvent mouseEvent) {
    // yCor += 1;
    calculatePossibleMoves();
  }

  @Override
  public void calculatePossibleMoves() {

    allPossibility = new ArrayList<>();
    allCaptures = new ArrayList<>();

    int[] possiblePair;

    xCor = getxCor();
    yCor = getyCor();
    System.out.println("xCor: " + xCor);
    System.out.println("yCor: " + yCor);

    if (yCor == 1) {
      possiblePair = new int[] {xCor, (yCor + 2)};
      allPossibility.add(possiblePair);
    }
    if (xCor >= 1 && xCor <= 6) {
      possiblePair = new int[] {xCor + 1, (yCor + 1)};
      //allPossibility.add(possiblePair);
      allCaptures.add(possiblePair);
      possiblePair = new int[] {xCor - 1, (yCor + 1)};
      //allPossibility.add(possiblePair);
      allCaptures.add(possiblePair);

    }
    if (xCor == 0) {
      possiblePair = new int[] {xCor + 1, (yCor + 1)};
      //allPossibility.add(possiblePair);
      allCaptures.add(possiblePair);
    }
    if (xCor == 7) {
      possiblePair = new int[] {xCor - 1, (yCor + 1)};
      //allPossibility.add(possiblePair);
      allCaptures.add(possiblePair);
    }

    possiblePair = new int[] {xCor, (yCor + 1)};
    allPossibility.add(possiblePair);
  }

}
