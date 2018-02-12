/***********************
Ernesto Macin Morales

TenQuantity.java
***********************/
import javax.swing.JOptionPane;
public class TenQuantity{
  public static void main (String[]args){
    int cantidad=0 ;
    int contador= 0 ;


    while(contador < 10){
      contador = contador + 1;
      cantidad = cantidad + Integer.parseInt(JOptionPane.showInputDialog("Enter the "+ contador + "° number"));
    }//end while
      JOptionPane.showMessageDialog(null, "the total sum is "+ cantidad);
  }//end main
}//end the program
