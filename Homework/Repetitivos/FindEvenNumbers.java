/***************
Ernesto Macin Morales

FindEvenNumbers.java
***************/
import javax.swing.JOptionPane;
public class FindEvenNumbers{
  public static void main(String[]args){
    int generar=100, i ;

    i=2;
    while ( i <= generar){
      JOptionPane.showMessageDialog(null," The even numbers of 100 are "+i);
      i = i + 2;
    }//end while
  }//end main
}//end the program
