/*
 * This program prints information about the lab schedule and grading policy.
 * It has certain syntax errors that are to be fixed by the student.
 * 
 * @author Ugur Dogrusoz
 */
public class Lab01_Q1
{      
   public static void main(String[] args) {                                                           //forgot to close the paranthesis
      // Constants
      final double LABS_GRADE_PERCENT = 25;  // grading policy                                        //can't use percent symbol in value(double or int)
      final int LABS_COUNT = 9;                                                                       //can't assign double to integer
      final double GRADE_PERCENT_PER_LAB = LABS_GRADE_PERCENT / LABS_COUNT;                           //mispelled keyword final
      
      // Variables
      String courseAndSemester;     
      
      /* This program prints information about the labs
         and grading policy */
           
      // First initialize the course & semester information
      courseAndSemester = "CS101 Fall 2022";                                                          //forgot the semicolon at the end of the line             
      
      // Then print out welcome message for this course, semester and lab
      System.out.println( "Hi everyone, below are details about lab grades" );                        //forgot quotation marks at the end of the string
      System.out.println( "Welcome to " + courseAndSemester + " Lab 01" );
      System.out.println();
      
      // Now print out the grading policy
      System.out.println( "There will be "+ LABS_COUNT + " lab sessions in this course." );           //three semicolons at the end of the line
      System.out.println( "Labs contribute to " + LABS_GRADE_PERCENT + "% of your total grade." );    //mispelled System class name
      System.out.println( "This lab:\t" + GRADE_PERCENT_PER_LAB + "\tpoints" );
      System.out.println( "All labs:\t" + LABS_GRADE_PERCENT + "\tpoints" );
      System.out.println( "You should come prepared..." );
      
      // Finally wish them luck and finish                                                            //forgot a slash in double slash
      System.out.println();
      System.out.println( "Best of luck!" );      
   }
}                                                                                                     //forgot } for classbody

