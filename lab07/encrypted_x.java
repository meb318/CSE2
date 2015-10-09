import java.util.Scanner;//allows input from user
 
public class encrypted_x{//class
    public static void main(String[] args){//main method
        
        Scanner myScanner = new Scanner(System.in);//sets up myScanner
        System.out.print("How many lines?: ");//ask for number of rows
        int rows = myScanner.nextInt();//set entered number as the number of rows
        int rowCount = 1;//starts the row counter
        if(rows >= 0 && rows <=100){//check to make sure number entered is within bounds
        for (int i = 0; i < rows + 1; i++){//loop that starts counting i
            for (int j = 0; j < rows + 1; j++){//loop for each row
                if(j == i  || j == rows - i){//recognize where to print the space in the loop
                    System.out.print(" ");//print space
                }
                else{//command for when not in the if statement
                    System.out.print("*");//print the stars
                }
            }
            
            for (int j = 1; j <= rowCount; j++){//loop for printing the * at the end of the row
            }
 
            System.out.println();//moves the line down
            rowCount++;//increments the row counter
        }
    }
} 
}