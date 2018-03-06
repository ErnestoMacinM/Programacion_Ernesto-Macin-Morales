import javax.swing.*;
public class ImplementGeometricObject{
  public static void main(String[] args) {
    GeometricObject circlelito=new Circle(3.5,"blue",true);
/*
    JOptionPane.showMessageDialog(null,"the area is "+circlelito.getArea());
    JOptionPane.showMessageDialog(null,"the circle was created on "+circlelito.getDateCreate());

    Rectangle rectanglelito = new Rectangle(10,20,"red",true);
    JOptionPane.showMessageDialog(null, "the area is "+rectanglelito.getArea());
    JOptionPane.showMessageDialog(null, "the perimeter is "+rectanglelito.getPerimeter());
      JOptionPane.showMessageDialog(null,"the rectangle was created on "+circlelito.getDateCreate());
*/
//polimorfismo
JOptionPane.showMessageDialog(null,circlelito.toString());

  }
}
