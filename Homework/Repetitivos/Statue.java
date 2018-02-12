/*****************
Ernesto Macin Morales

Statue.java
*****************/
import javax.swing.JOptionPane;

public class Statue{
  public static void main(String[]args){
    int accountant=0, members=0;
    double statue=0, sumaDeEstaturas=0, promedioDeEstaturas=0;

    members = Integer.parseInt(JOptionPane.showInputDialog("enter the number of members"));

    while (accountant < miembros){
      accountant = accountant + 1;
      statue = statue + Double.parseDouble(JOptionPane.showInputDialog("Enter the member's height "+accountant));

      promedioDeEstaturas = (statue / members);
    }//end while
    JOptionPane.showMessageDialog(null,"The total sum of the statures is "+statue);
    JOptionPane.showMessageDialog(null,"The total average of the heights are: "+promedioDeEstaturas);
  }//end main
}//end the program
