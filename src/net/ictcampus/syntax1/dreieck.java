package net.ictcampus.syntax1;

public class dreieck {
  public static void main(String[] args) {

    int max = 0;
    for (int i = 0; i <= 10; i++) {
      for (int j = 0; j <= max; j++) {

        System.out.print("*");
      }
      max += 1;
      System.out.println("");
    }
  }
}
