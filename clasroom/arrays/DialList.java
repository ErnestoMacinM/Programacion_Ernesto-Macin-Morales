/*****************************
DialList.java
Ernesto Macin Morales
This program creates a cell phone dial phone number list and prints the created list
******************************/
import javax.swing.*;
public class DialList{
  public static void main(String[]args){
    long[] phoneList;//List of phone numbers
    int sizeList; //number of phone numbers
    long phoneNum;//an entered phone number


    sizeList = Integer.parseInt(JOptionPane.showInputDialog("How many numbers would you like to enter"));
    phoneList = new long[sizeList];//Inicializando
    for (int i = 0;i < sizeList ; i++) {
    phoneNum = Long.parseLong(JOptionPane.showInputDialog("Enter a phone number"));

      phoneList[i] = phoneNum;
    }//end for
    for (int i = 0; 1 < sizeList ; i++ ) {
      JOptionPane.showMessageDialog(null,"Index  " +i+ " Element number:  "+(i+1)+" Phone number:  "+phoneList[i]);
    }
  }
}
