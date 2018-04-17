import javax.swing.*;
public class Course{
  private  String courseName;
  private String[] students = new String [100];
  private int numberOfStudents = 0;

  //Constructor 2
  public Course(String courseName);
    this.courseName = courseName;


    //Method to get the name of the course
    public String getCourseName(){
      return this.courseName;
    }
    //Adds a new studet to the course
    public void addStudent(String students){
        students[numberOfStudents] = students;
        numberOfStudents++;
    }
    //returns the students for the course
    public String[] getStudents(){
      return this.students;
    }
    //retturns the number of students for the course
    public int getNumbersOfCourse(){
      return this.numberOfStudents;
    }
    //drops a student from the course
    public void dropStudent(String student ){
      for (int i = 0;i < this.getNumberOfStudents ; i++ ) {
        if (this.students[i].equalsIgnoreCase(student)) {
          this.students[i] = null;
        }
      }
    }

    public static void main(String[] args){
      Course coursito = new Course("course");
      int opc=0;//Variable del menu
      do {
        opc = integer.parseInt(JOptionPane.showInputDialog("...MENU.....\n 1.-Create course\n 2.-Add Student\n 3.-Show student \n4.-Drop student\n 5.-Exit"));

        switch(opc){
          case 1:
          String course = JOptionPane.showInputDialog("course name??");
          break;

          case 2:
            String name;
          do {

            name = JOptionPane.showInputDialog("Student name?? or q to exit");
            if (name.charAt(0) != 'q') {
              coursito.addStudent(name);
            }

          } while ('q'!= name );

          break;

          case 3:
          String[] students = coursito.getStudents();
          for (int i = 0; i < coursito.getNumbersOfStudents();i++ ) {
            String output = "";
            for (int i = 0;i < this.getNumberOfStudents() ;i++ ) {
              output += "Student"+ (i + 1)+ " "+ students[i]+"\n";
            }
         JOptionPane.showMessageDialog(null, output);
          break;
         case 4:
          name = JOptionPane.showInputDialog("Student's name??");
          coursito.dropStudent(name);
          JOptionPane.showMessageDialog(null,"The student was deleted");
          break;
          case 5:
          JOptionPane.showMessageDialog(null, "Bye see you take care have a nice day");
          break;
        default: JOptionPane.showMessageDialog(null,"Option doesn't exist");

        }
      }//End switch
    } while (opc !=5);
   }
  }
