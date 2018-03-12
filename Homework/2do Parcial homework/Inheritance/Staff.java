import javax.Swing.*;
public class Staff{
  private String school;
  private double pay;

  public Staff(String name, String address, String school, double pay){
    this.name = name;
    this.address = address;
    this.school = school;
    this.pay = pay;
  }
  public String getSchool(){
    return this.school;
  }
  public void getSchool(String school){
    this.school = school;
  }
  public double getPay(){
    return this.pay;
  }
  public void setPay(double pay ){
    this.pay = pay;
  }
}
