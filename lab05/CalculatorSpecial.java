//this program will calculate two inputs from the user displaying addition, subtraction,
//multiplication, and division using a switch case.  It will then wait for the user to 
//input N or n to stop the program
import java.util.Scanner;//starts the ability to input data

public class CalculatorSpecial{//Class
    //Main Method
    public static void main(String[] args){
        
        String stop = "";
        
        do {
        Scanner myScanner = new Scanner(System.in );//allows user to input data
        System.out.print("a =  ");//user enters value a
        double a = myScanner.nextDouble();//makes a the number entered
        System.out.print("b =  ");//user enters value b
        double b = myScanner.nextDouble();//makes b the number entered
        System.out.print("operator = ");//user enter operator
        String operator = myScanner.next();//makes the operator the character entered
        System.out.print("Type n or N to stop ");//user enters n or N
        stop = myScanner.next();//makes the letter entered the stop variable
      
            switch(operator){
        case "+": operator = "+";
            System.out.println(a + b);
            break;
        case "-": operator = "-";
            System.out.println(a - b);
            break;
        case "*": operator = "*";
            System.out.println(a * b);
            break;
        case "/": operator = "/";
            System.out.println(a / b);
            break;
        default : 
            System.out.println("illegal operator");
            }
        }
        while (!stop.equals("n") && !stop.equals("N"));
        
        //if (stop.equals("n") || stop.equals("N")){
        //  System.out.print("The program is stopped");
        
        }
    }
