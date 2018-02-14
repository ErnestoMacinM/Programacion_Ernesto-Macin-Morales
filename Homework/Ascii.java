/******************************
Ernesto Macin Morales
Ascii.java
This program shows the character of a number of the ascii table
******************************/
import javax.swing.JOptionPane;// import JOptionPane

public class Ascii{// Name the program

  public static void main(String[] args){

      String num;// type string variable
       num = JOptionPane.showInputDialog("Enter the number");// show on screen

      int d;// integer variable
       d = Integer.parseInt(num);

      char c;// character variable
       c = (char)(d);//type character for to converter

      System.out.println("El codigo Ascii del numero "+ num +" es "+ c);// print on console screen

  }//end main
}//end the program
