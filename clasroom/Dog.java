/*************************
Dog.java

Ernesto Macin Morales
This class sets the dog's properties and methods
*************************/
import javax.swing.*;
public class Dog{

  //properties -- Variables
  private String color;
  private String eyeColor;
  private double height;
  private double length;
  private double weight;

  //sets the dog's color
  public void setColor(String dogColor ){
    color = dogColor;
  }
  //get the dog's color
  public String getColor(){
    return color;
  }

  public void setEyeColor(String dogEyeColor ){
    eyeColor = dogEyeColor;
  }
  public String getEyeColor(){
    return eyeColor;
  }


  public void setHeight(Double dogHeight ){
    height = dogHeight;
  }
  public Double getHeight(){
    return height;
  }


  public void setLength(Double dogLength ){
    length = dogLength;
  }
  public Double getLength(){
    return length;
  }


  public void setWeight(Double dogWeight ){
    weight = dogWeight;
  }
  public Double getWeight(){
    return weight;
  }



  //Dog's methods- actions

  //sit method
  public void sit(){
    JOptionPane.showMessageDialog(null, "The dog is sat");
  }

  //bark
  public void bark(){
    JOptionPane.showMessageDialog(null, "The dog is barking");
  }

  //lay down method
  public void layDown(){
    JOptionPane.showMessageDialog(null, "The dog is laid down");
  }

  //Eat method
  public void eat(){
    JOptionPane.showMessageDialog(null,"The dog is eating");
  }

  //sleep method
  public void sleep(){
    JOptionPane.showMessageDialog(null,"The dog is sleeping ");
  }




}
