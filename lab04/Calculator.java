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
        String operator = myScanner.next();//makes the number entered the operator
      
        switch(operator){//starts switch statement
        case "+": operator = "+";//gives the case if the operator is +
            System.out.println(a + b);//prints the calculation
            break;//gives stopping point
        case "-": operator = "-";//gives the case if the operator is -
            System.out.println(a - b);//prints the calculation
            break;//gives stopping point
        case "*": operator = "*";//gives the case if the operator is *
            System.out.println(a * b);//prints the calculation
            break;//gives stopping point
        case "/": operator = "/";//gives the case if the operator is /
            System.out.println(a / b);//prints the calculation
            break;//gives stopping point
        default : //executes when using an illegal operator
            System.out.println("illegal operator");//prints "illegal operator 
        }
    }
}