import java.util.Scanner;//allows input from user
 
public class pyramid{//class
    public static void main(String[] args){//main method
        
        Scanner myScanner = new Scanner(System.in);//sets up myScanner
        System.out.print("What size pyramid? ");//ask for number of rows
        int rows = myScanner.nextInt();//set entered number as the number of rows
        int rowCount = 1;//starts the row counter
 
        for (int i = rows; i > 0; i--){//loop that starts counting i
        
            for (int j = 1; j <= i; j++){//loop made to print certain number of spaces
                System.out.print(" ");//prints the " "
            }
            //Printing 'rowCount' value 'rowCount' times at the end of each row
            for (int j = 1; j <= rowCount; j++){//loop for printing the * at the end of the row
                System.out.print("* ");//porints the "*"
            }
 
            System.out.println();//moves the line down
            rowCount++;//increments the row counter
        }
    }
}