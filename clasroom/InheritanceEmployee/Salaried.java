public class salaried extends Employee{
  private double salary;

}

public salaried(String name, double salary){
  super(name);
  this.salary = salary;
}
public double getPay(){
  return this.salary;//Hard codeo para pruebas de funcionamiento
}
