//this program will calculate two inputs from the user displaying addition, subtraction,
//multiplication, and division using a switch case.
import java.util.Scanner;//starts the ability to input data

public class Calculator{//Class
    //Main Method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in );//allows user to input data
        System.out.print("a =  ");//user enters value a
        double a = myScanner.nextDouble();//makes a the number entered
        System.out.print("b =  ");//user enters value b
        double b = myScanner.nextDouble();//makes b the number entered
        System.out.print("operator = ");//user enter operator
        String operator = myScanner.next();
      
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
}