/******************************
BMIOOP.JAVA

Ernesto Macin Morales
This class calculates the Body Mass Index
*******************************/

public class BMIOOP{
  //Properties - attributes
  private String name;
  private int age;
  private double weigth;//in punds
  private double heigth;//in inches
  private final double KILOGRAMS_PER_POUND = 0.45359237;
  private final double METERS_PER_INCH = 0.0254;

  //methods - Actions
  public void setName(String name ){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public void setAge(int age){
    this.age= age;
  }
  public int getAge(){
    return age;
  }
  public void setWeigth(double weigth){
    this.weigth= weigth;
  }
  public double getWeigth(){
    return weigth;
  }
  public void setHeigth(double heigth){
    this.heigth = heigth;
  }
  public double getHeigth(){
    return this.heigth;
  }

  public double getBMI(){
    double bmi = this.weigth * KILOGRAMS_PER_POUND/(this.heigth * METERS_PER_INCH)*(this.heigth * METERS_PER_INCH);
    return Math.round(bmi * 100)/100;
  }
  //method to evaluate BMI and return a message
  public String getStatus(){
    double bmi = getBMI();
    if (bmi < 16) {
      return "seriously underweigth";
    }else if (bmi < 18) {
      return "underweight";
    }else if (bmi < 24) {
      return "normal weigth";
    }else if (bmi < 29 ) {
      return "Overweight";
    }else if (bmi < 35) {
      return "seriously Overweight";
    }else{
      return "gravely Overweight";
  }
 }

}//end the program
