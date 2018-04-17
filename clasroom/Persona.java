import javax.swing.*;
import java.util.Calendar;
public class Persona{
  //atributos
  private String nombre;
  private int annioNacimiento;
  private char genero;
  private double estatura;
  private double peso;
  private char estadoCivil;

  //metodo constructor
  public Persona(String nombre, int annioNacimiento, char genero, double estatura, double peso, char estadoCivil){
    this.nombre = nombre;
    this.annioNacimiento = annioNacimiento;
    this.genero = genero;
    this.estatura = estatura;
    this.peso = peso;
    this.estadoCivil = estadoCivil;
  }
  public void caminar(){
    JOptionPane.showMessageDialog(null,"Caminando");
  }
  public void hablar(){
    JOptionPane.showMessageDialog(null, this.nombre + " says: Hello world");
  }
  public int getEdad(){
    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);
    return year-this.annioNacimiento;
  }
  public static void main(String[]args){
    Persona persona1 = new Persona("Ernesto",1999, 'H', 1.73, 60,'S');
    Persona persona2 = new Persona("Woman", 1998, 'F',1.68, 63,'S');

    persona1.caminar();
    persona1.hablar();
    persona1.getEdad();
    int aux = persona1.getEdad();
    JOptionPane.showMessageDialog(null,aux);
  }

}
