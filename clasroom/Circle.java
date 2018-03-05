/********************
Circle.java
Ernesto Macin Morales
This class calculates the area of a circle
*************************/
import javax.swing.JOptionPane;
public class Circle{
  //properties
  private double radius;

  //constructor
  public Circle(){
  }

  //constructor Circle Overload
  public Circle(double radius){
    this.radius = radius;
  }

  //methods
  public void getRadius(double radius){
    return this.radius;
  }

  public double getArea(){
    return Math.pow(this.radius,2) * Math.PI;
  }

  public static void main(String[] args){

  double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius"));
  Circle circle = new Circle();

  JOptionPane.showMessageDialog(null,"The circle's area with a radius of "+ circle.getRadius() + " is "+ circle.getArea());
  }
}//end the program
