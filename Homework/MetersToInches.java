/**************
*Ernesto Macin Morales
*
*MetersToInches
*This ptogram is for converter
**********////////

import java.util.Scanner;

public class MetersToInches{
  public static void main(String[]args){
    int metros;
    final double PG=(0.0254 );
    final double result;
  System.out.println("Cantidad de metros que requiera :v");
  Scanner CM= new Scanner (System.in);
  metros = CM.nextInt();
  System.out.println("Pulgadas que debe pedir son: ");
  result=(metros*PG);
  System.out.println(result);

  }//end main
 }//end MetrosToPulgada
