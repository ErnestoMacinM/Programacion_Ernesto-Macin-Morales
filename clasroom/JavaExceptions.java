/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexceptions;
import javax.swing.*;
import java.lang.NumberFormatException;
/**
 *
 * @author Ernest
 */
public class JavaExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException {
        // TODO code application logic here
//        int value = 0;
//        try{
//            value = Integer.parseInt(JOptionPane.showInputDialog("Enter a value"));
//        }
//        catch(NumberFormatException e ){
//            JOptionPane.showMessageDialog(null,"incorrect Format"+ e.getMessage());
//        }
//          int a = 0;
//          int b = 0;
//          a = Integer.parseInt(JOptionPane.showInputDialog("Enter a Integer"));
//          b = Integer.parseInt(JOptionPane.showInputDialog("Enter a Integer"));
//          
//          try{
//              JOptionPane.showMessageDialog(null, a + "/" + b+"=" + (a/b));
//          }
//          catch(ArithmeticException e ){
//              JOptionPane.showMessageDialog(null,"Enter a valid integer" + e);
//          }
          int a = 0;
          int b = 0;
          
          a = Integer.parseInt(JOptionPane.showInputDialog("Enter a Integer"));
          b = Integer.parseInt(JOptionPane.showInputDialog("Enter a Integer"));
          
          JOptionPane.showMessageDialog(null, a + "/" + b+"=" + (a/b));
    }
    
}
