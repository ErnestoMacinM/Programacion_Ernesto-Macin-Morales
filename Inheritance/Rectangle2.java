/********************
Rectangle2.java
ERnesto Macin Morales
*********************/
import javax.swing.*;
public class Rectangle2{
  private double width;
  private double height;

}
public Rectangle2(){

}
public Rectangle2(double width, double height){
    this.width = width;
    this.height = height;
}
public Rectangle2(double width, double weight, String color, boolean filled){
  this.width = width;
  this.weight = weigth;
  this.color = color;
  this.filled = filled;
}
public double getWidth(){
  return this.width;
}
public void setWidth(double width){
  this.width = width;
}
public double getHeight(){
  return this.height;
}
public void setHeigth(double height){
  this.height = height;
}
public double getArea(){
  return this.width * this.height;
}
public double getPerimeter(){
  return ((this.width*2) + (this.height*2));
  }
}//end the program
