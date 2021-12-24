package net.ictcampus.syntax2;

import java.util.Scanner;

public class FigurenA4A5 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Wie viele Reihen willst du ?");
      int max = scan.nextInt();
      int times = 0;
      for (int i = 0; i < max; i++) {
          for (int j = 0; j <= times; j++) {

              System.out.print("*");
          }
          times += 1;
          System.out.println("");
      }
      FigurenA4A5 fig = new FigurenA4A5();
      fig.createTree();
  }


  public void createTree(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Wie viele Reihen willst du ?");
      int max = scan.nextInt();
      int times = 5;
      int stern = 1;
      for (int i = 0; i < max; i++) {
          for (int j = 0; j <= times; j++) {
              System.out.print(" ");
          }
          for (int x = 1; x <= stern; x ++){
              System.out.print("*");
          }
          stern+=2;
          times -= 1;
          System.out.println("");
      }

  }
}
