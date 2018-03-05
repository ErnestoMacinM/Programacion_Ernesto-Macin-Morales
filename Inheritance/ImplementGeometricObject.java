import javax.swing.*;

public class ImplementGeometricObject{
  public static void main(String[]args){
    Circle circlelito = new Circle(3.5, "BLUE", true);

    /*JOptionPane.showMessageDialog(null, "The area is "+circlelito.getArea());
    JOptionPane.showMessageDialog(null, "The circle was created on "+circlelito.getDateCreated());

    Rectangle2 rectanglelito = new Rectangle(10, 20, "Red", true);
    JOptionPane.showMessageDialog(null, "The perimeter is "+ rectanglelito.getPerimeter());*/

    //polimorfismo
    JOptionPane.showMessageDialog(null, circlelito.toString());
  }

}
