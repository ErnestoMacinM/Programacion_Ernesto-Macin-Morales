/************************
DialList2.java
Ernesto Macin Morales
This program creats a dial phone number list and prints the creates.
list. IT uses a partially filled array
***********************/
import javax.swing.*;
public class DialList2{
  public static void main(String[]args){
    String[] phoneList = new String[100];//declaracion e inicializacion

    int filledNumbers = 0;// number of phones
    String phoneNum;// an entered phone number
    phoneNum = JOptionPane.showInputDialog("Enter a phone number ( or press q to QUIT)");
    while (!phoneNum.equalsIgnoreCase("q") && filledNumbers < phoneList.length){
      if (phoneNum.length() < 1 || phoneNum.leng() > 10 ) {
        JOptionPane.showMessageDialog(null,"Must enter a valid number (10 characteres)");
      }else
    }
  }
}
