import javax.swing.*;
import java.util.Random;
public class Person{
  private String name;
  private double age;
  private String gender;
  private double height,weigth;
public Person(){
  this.name="";
  this.age=0;
  this.gender="hombre";
  this.height=0;
  this.weigth=0;
}
public Person(String name,int age,String gender){
  this.name=name;
  this.age=age;
  this.gender=gender;
}
public Person(String name,int age,String gender,double height,double weigth){
  this.name=name;
  this.age=age;
  this.gender=gender;
  this.height=height;
  this.weigth=weigth;
}
  //methods
  public void setAge(double age){
      this.age=age;
    }
    public double getAge(){
      return this.age;
    }
    public void setName(String name){
      this.name=name;
    }
    public String getName(){
      return this.name;
    }
    public void setGender(String gender){
      this.gender=gender;
    }
    public String getGender(){
      return this.gender;
    }
    public void setWeigth(double weigth){
      this.weigth=weigth;
    }
    public double getWeigth(){
      return this.weigth;
    }
    public void setHeight(double height){
      this.height=height;
    }
    public double getHeight(){
      return this.height;
    }
public double getBMI(){
  double meters=this.height/100;
  double  BMI=this.weigth/(meters*meters);
  return BMI;
}

public String getGen(){
  if(this.age>=18){
    return "Higher of age";
  }else {
    return "Less of ager";
  }
}
public String getDNI(){
  char [] chars = "0123456789".toCharArray();
  int charsLength = chars.length;
  Random random = new Random();
  StringBuffer buffer = new StringBuffer();
  for (int i=0;i<8;i++){
     buffer.append(chars[random.nextInt(charsLength)]);
  }
  return "DNI is: " + buffer.toString();
}

public String getStatusBMI(){
  double BM=getBMI();
  if(BM<20){
    return "-1 underweight";
  }else if(BM>20 && BM<25){
    return "0 normal";
  }else
return "normal weight";


}
public static void main(String[] args) {
Person persona = new Person();
JOptionPane.showMessageDialog(null,"the name is "+persona.getName()+"\n the age is "+persona.getAge()+"\n the gender is "+persona.getGender());
Person persona2 = new Person("Ernesto", 18, "Hombre", 175, 85);
JOptionPane.showMessageDialog(null,"the name is "+persona2.getName()+"\n the age is "+persona2.getAge()+"\n the gender is "+persona2.getGender()+"\n "+persona2.getDNI()+"\n the BMI is: "+persona2.getStatusBMI()+"\n"+persona2.getGen());
}
}
