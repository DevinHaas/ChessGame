package net.ictcampus.projekt.figure;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ChessPiece extends ImageView {
  int xCor;
  int yCor;
  String pictureName;
  double size;
  String color;
  boolean isKing = false;
  ArrayList<int[]> allPossibility;
  ArrayList<int[]> allCaptures;
  ArrayList<int[]> realPossibleMoves;



  protected ChessPiece(int xCor, int yCor, String pictureName, double size, String color) {
    this.xCor = xCor;
    this.yCor = yCor;
    this.pictureName = pictureName;
    this.size = size;
    this.color = color;

    Image piece = new Image(pictureName);

    setImage(piece);
    setScaleX(size);
    setScaleY(size);

    setOnMousePressed(this::move);
  }

  public int getxCor() {
    return xCor;
  }

  public void setxCor(int xCor) {
    this.xCor = xCor;
  }

  public int getyCor() {
    return yCor;
  }

  public void setyCor(int yCor) {
    this.yCor = yCor;
  }

  public boolean isKing(){return isKing;}

  public String getColor(){
    return color;
  }

  public abstract void move(MouseEvent mouseEvent);


  public abstract void calculatePossibleMoves();


  public List<int[]> getPossibleMoves() {
    return allPossibility;
  }

  public List<int[]> getPossibleCaptures(){return  allCaptures;}

  public List<int[]> getRealPossibleMoves(){return realPossibleMoves;}

  public void setRealPossibleMoves(ArrayList<int[]> list){
    realPossibleMoves = list;
  }

  public void showAllPossibilitys(){
    for (int[] pairs : allPossibility) {
      System.out.println(Arrays.toString(pairs));
    }
  }

}


