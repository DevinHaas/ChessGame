package net.ictcampus.syntax1;

public class Datentypen {
  public static void main(String[] args) {
    int iResultat, num1 = 17, num2 = 5;
    double dResultat, val1 = 12.0, val2 = 2.34;

    System.out.println(iResultat = num1 / num2);
    System.out.println(dResultat = num1 /num2);
    System.out.println(dResultat = val1 /num2);
    System.out.println(dResultat = (double) num1 / num2);
    System.out.println(iResultat = (int) val1 / num2);
  }
}
