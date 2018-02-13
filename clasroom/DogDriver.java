/*******************************
DogDriver.java

Ernesto Macin Morales
This program creates dog and objects and uses Dog class
*******************************/
import javax.swing.*;
public class DogDriver{
  public static void main(String[]args){
    Dog fido;

    fido = new Dog();
    fido.setColor("Black");
    fido.setEyeColor("gray");

    JOptionPane.showMessageDialog(null, fido.getColor());
    JOptionPane.showMessageDialog(null, fido.getEyeColor());

    fido.eat();
    fido.bark();
    fido.sleep();

    //---------------------------------

    Dog fufi = new Dog();

    fufi.setColor("black and blue");
    fufi.setEyeColor("purple");

    JOptionPane.showMessageDialog(null,"fufi's eyes color is "+ fufi.getEyeColor());
    fufi.sleep();

  }//end main
}//end the program
