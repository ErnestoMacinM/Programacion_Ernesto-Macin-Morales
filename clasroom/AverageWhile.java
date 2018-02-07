/********************
Ernesto Macin Morales

AverageWhile.java
This program
********************/
import javax.swing.JOptionPane;

public class AverageWhile{
  public static void main(String[]args){
    int counter=1, totalStudents;
    double score, totalScore, averageScore;

    totalStudents = Integer.parseInt(JOptionPane.showInputDialog("Enter number of students"));

    while (counter <= totalStudents){
      score = Double.parseDouble(JOptionPane.showInputDialog("Enter the score "+ counter));
      totalScore += score;
      counter ++;
    }//end while|
    averageScore = totalScore / totalStudents;
    JOptionPane.showMessageDialog(null,"The average is "+ averageScore);
  }//end main
}//end the program
