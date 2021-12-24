package net.ictcampus.syntax2;

import java.util.Scanner;

public class KleinerRechner {
  public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    System.out.println("Gib mir eine Zahl a: ");
    double a = scan.nextDouble();

    System.out.println("Gib mir die Zahl b: ");
    double b = scan.nextDouble();

    System.out.println("Welche Operation willst du ? (+,-,/,*)");
    String symbol = scan.next();
    /*
    System.out.println(
        "Zahl1 = "
            + a
            + "\nZahl2 = "
            + b
            + "\nAddition= "
            + (a + b)
            + "\nSubtraktion = "
            + (a - b)
            + "\nMultiplikation = "
            + (a * b)
            + "\nDivision = " + (a/b));


     */

    if (symbol.equals("+")){
      System.out.println("Addition= "
              + (a + b));

    } else if (symbol.equals("-")){
      System.out.println("Subtraktion = "
              + (a - b));
    } else if (symbol.equals("*")){
      System.out.println("Multiplikation = "
              + (a * b));
    } else{
      System.out.println("Division = " + (a/b));
    }
  }
}
