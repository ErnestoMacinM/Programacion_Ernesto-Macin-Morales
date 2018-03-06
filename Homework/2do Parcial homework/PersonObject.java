import javax.swing.*;

public class PersonObject{
  public static void main(String[] args) {
    //Person One
   Person person=new Person();
   String name=JOptionPane.showInputDialog("enter your name");
   person.setName(name);
   double age=Double.parseDouble(JOptionPane.showInputDialog("enter your age"));
   person.setAge(age);
   String gender=JOptionPane.showInputDialog("enter your gender");
   person.setGender(gender);
   double height=Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
   person.setHeight(height);
   double weigth=Double.parseDouble(JOptionPane.showInputDialog("enter your weight"));
   person.setWeigth(weigth);
   JOptionPane.showMessageDialog(null,"the name is "+person.getName()+"\n the age is "+person.getAge()+"\n the gender is "+person.getGender()+"\n "+person.getDNI()+"\n the BMI is:"+person.getStatusBMI()+"\n"+person.getGen());
   //Person Two
   Person person2=new Person();
   String name2=JOptionPane.showInputDialog("enter your name");
   person2.setName(name2);
   Double age2=Double.parseDouble(JOptionPane.showInputDialog("enter your age"));
   person2.setAge(age2);
   String gender2=JOptionPane.showInputDialog("enter your gender");
   person2.setGender(gender2);
   double height2=Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
   person2.setHeight(height2);
   double weigth2=Double.parseDouble(JOptionPane.showInputDialog("enter your weight"));
   person2.setWeigth(weigth2);
   JOptionPane.showMessageDialog(null,"the name is "+person2.getName()+"\n the age is "+person2.getAge()+"\n the gender is "+person2.getGender()+"\n "+person2.getDNI()+"\n"+person2.getGen());
   //Person Three
   Person person3=new Person();
   String name3=JOptionPane.showInputDialog("enter your name");
   person3.setName(name3);
   double age3=Double.parseDouble(JOptionPane.showInputDialog("enter your age"));
   person3.setAge(age3);
   String gender3=JOptionPane.showInputDialog("enter your gender");
   person3.setGender(gender3);
   double height3=Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
   person3.setHeight(height3);
   double weigth3=Double.parseDouble(JOptionPane.showInputDialog("enter your weight"));
   person3.setWeigth(weigth3);
   JOptionPane.showMessageDialog(null,"the name is "+person3.getName()+"\n the age is "+person3.getAge()+"\n the gender is "+person3.getGender()+"\n "+person3.getDNI()+"\n the BMI is:"+person3.getStatusBMI()+"\n"+person3.getGen());
  }
}
