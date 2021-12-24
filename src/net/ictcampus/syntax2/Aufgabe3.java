package net.ictcampus.syntax2;

import javax.swing.*;

public class Aufgabe3 {

    public String eingabeString() {
        return JOptionPane.showInputDialog(null, "Bitte Text eingeben ");  	} //end eingabeString


    public int eingabeInt () {
        return Integer.parseInt
                (JOptionPane.showInputDialog(null, "Bitte Zahl  eingeben"));  	} //end eingabeInt

    public static void main(String[] args) {
        //Dein Code
        Aufgabe3 a3 = new Aufgabe3();
        int zahl = a3.eingabeInt();
        if (zahl > 0){
            System.out.println("Ihre Zahl ist grösser");
        } else if (zahl < 0){
            System.out.println("Ihre Zahl ist kleiner");
        } else {
            System.out.println("Ihre Zahl ist die 0");
        }

    }//end main
}
