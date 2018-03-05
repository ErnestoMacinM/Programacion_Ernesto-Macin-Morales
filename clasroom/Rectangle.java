/**********************
Ernesto Macin Morales
Rectangle.java
Tgis class implements a rectangle with constructors
**********************/
import javax.swing.*;
public class Rectangle{
  //attibutes o preperties
  private double height;
  private double width;

  public Rectangle(){
    this.height = 10;
    this.width = 20;
  }

    public Rectangle(double height, double width){
      this.height = height;
      this.width = width;
    }

   public double getArea(){
     return this.width * this.height;
   }

   public static void main(String[]args){
     Rectangle rectangle = new Rectangle();
     JOptionPane.showMessageDialog(null,"The area is"+ rectangle.getArea());

     Rectangle rectangle2 = new Rectangle(5, 10);
     JOptionPane.showMessageDialog(null, "The rectangle's area is "+ rectangle2.getArea());
   }



}//end the program
