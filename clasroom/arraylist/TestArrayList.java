import java.util.ArrayList;
import javax.swing.*;
public class TestArrayList{
  public static void main(String[]args){
    ArrayList <String> cityList = new ArrayList <String>();
    cityList.add("London");
    cityList.add("New york");
    cityList.add("Paris");
    cityList.add("Tokio");
    cityList.add("Miami");
    JOptionPane.showMessageDialog(null," List size: "+ cityList.size());

    JOptionPane.showMessageDialog(null, " Is Miami in this list? "+ cityList.contains("Miami"));//BOLEAN
    JOptionPane.showMessageDialog(null," The location of paris is "+ cityList.indexOf("Paris"));//Posicion del elemento
    JOptionPane.showMessageDialog(null," Is this list empty? "+ cityList.isEmpty());//Detectar si esta vacia
    cityList.remove("Londo");
  }
}
