import javax.swing.*;
public abstract class Employee {
  private String name;

  public Employee(String name){
    this.name = name;
  }
  public abstract double getPay();

  public void printPAy(int date){
    JOptionPane.showMessageDialog(null, "Hard codeo");
  }
}
