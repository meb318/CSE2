//Max Brungardt
//Program uses a while statment that requests a grade.  Anything less than 0 and greater
//than 100 will result in a message saying the grade is invalid.  Valid grades are added
//to a variable of the total number of grades.  Entering 999 ends the loop and displays
//the average grade
import java.util.Scanner;//starts the ability to input data

public class averageGrade{//Class
    //Main Method
    public static void main(String[] args){
        
        double grade = 0;
        double totalGrade = 0;
        int counter = 0;
        
        while((grade >= 0) && (grade <= 100) && (grade != 999)){
            Scanner myScanner = new Scanner(System.in );//allows user to input data
            System.out.print("Enter test grade (999 to show average): ");
            double Grade = myScanner.nextDouble();
            grade = Grade;
            
        if (grade < 0 || grade > 100){
            System.out.println("Invalid Grade Entered");
        }
            
        if (grade == 999){
            double averageGrade;
            averageGrade = totalGrade/counter;
            System.out.println("The average grade is: " + averageGrade);
            break;
        }
        
            totalGrade = totalGrade + grade;
            int Counter = counter;
            counter = Counter + 1;
            //System.out.println(totalGrade);
            //System.out.println(counter);
        
        }
        
    }
}
