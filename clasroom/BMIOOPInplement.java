/********************
BMIOOPInplement.java

Ernesto Macin Morales
********************/
import javax.swing.*;
public class BMIOOPInplement{
  public static void main(String[] args){
    BMIOOP person;
    person=new BMIOOP();
    int opc;
    int i=0;

    do{
      menu=Integer.parseInt(JOptionPane.showInputDialog(null, "*******Menu****** \n1.-Set name \n2.-Set Age \n3.- Set weight \n4.-Set height \n5.-Calculate BMI \n6.-Evaluate BMI \n7.-Exit" , "Option"));
  switch(menu){
        case 1:
        person.setName(JOptionPane.showInputDialog("Enter your name"));
        break;
        case 2:
        person.setAge(Integer.parseInt(JOptionPane.showInputDialog("How old are you?")));
        break;
        case 3:
        person.setWeigth(Double.parseDouble(JOptionPane.showInputDialog("Enter your WEIGHT in pounds")));
        break;
        case 4:
        person.setHeigth(Double.parseDouble(JOptionPane.showInputDialog("Enter your HEIGHT in inches")));
        break;
        case 5:
        person.getBMI();
        break;
        case 6:
        person.getStatus();
        break;
        case 7:
        i=i+1;
        JOptionPane.showMessageDialog(null, "Thank you for using application, shutting down", "Exit", JOptionPane.ERROR_MESSAGE);
        break;
        default:
        JOptionPane.showMessageDialog(null, "Error, option invalid" , "Error" , JOptionPane.ERROR);
        break;
      }//end switch case
    }
    while(i!=1);
  }
}//end the program
