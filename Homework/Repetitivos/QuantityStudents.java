/***********************
Ernesto Macin Morales

NAlumnos.java
************************/
import javax.swing.JOptionPane;
public class QuantityStudents{
  public static void main(String[]args){
    int alumnos=0, contador=0, edad=0, promedio=0;

    alumnos = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity students "));

    while (contador < alumnos){
      contador = contador + 1;
      edad = edad + Integer.parseInt(JOptionPane.showInputDialog("Enter the years of "+contador+"° student "));
      promedio = (edad / alumnos);
    }//end while
    JOptionPane.showMessageDialog(null,"The total sum of the students' age is "+ edad);
    JOptionPane.showMessageDialog(null,"The total average of the age of the "+alumnos+" student "+" is: "+ promedio);
  }//end main
}//end the program
