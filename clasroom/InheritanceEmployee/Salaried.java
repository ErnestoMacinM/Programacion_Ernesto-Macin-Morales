public class salaried extends Employee{
  private double salary;

}

public salaried(String name, double salary){
  super(name);
  this.salary = salary;
}
public double getPay(){
  return 0.0;//Hard codeo para pruebas de funcionamiento
}
