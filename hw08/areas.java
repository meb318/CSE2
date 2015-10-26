import java.util.Scanner; //sets up ability for user to enter data

public class areas{
    
    public static void area(double a){ //start of the circle method
        double area = 3.14 * a * a; //perform the equation for circles
        System.out.println("The area of the circle is: " + area); //print the circle area
        return; //return back to the main method
    }
    
    public static void area(double a, double b){ //start of the rectangle method
        double area = a * b; //perform the equation for rectangles
        System.out.println("The area of the rectangle is: " + area); //print the rectangle area
        return; //return back to the main method
    }
    
    public static void area(double a, double b, double c){ //start of the trapezoid method
        double area = (b + c) / 2 * a; //perform the equation for trapezoids
        System.out.println("The area of the trapezoid is: " + area); //print the trapezoid area
        return; //return back to the main method
    }
    
    public static void main(String[] args){ //main method
        Scanner myScanner = new Scanner(System.in); //sets the scanner variable

        System.out.print("Choose Shape (1 = Circle, 2 = Rectangle, 3 = Trapezoid): "); //ask user what shape they want
        int shape = myScanner.nextInt(); //makes shape variable equal to entered number
        
        if (shape == 1){ //run if the user pick circle
            System.out.print("Pick Circle Radius: "); //ask user to enter radius
            double a = myScanner.nextInt(); //sets a variable as radius
            area(a); //executes the area method for circle
        }
        
        if (shape == 2){ //run if the user picks rectangle
            System.out.print("Pick Rectangle Width: "); //ask user to enter width
            double a = myScanner.nextInt(); //sets a variable as width
            System.out.print("Pick Rectnagle Length: "); //ask user to enter length
            double b = myScanner.nextInt(); //sets b variable as length
            area(a,b); //executes the area method for rectangle
        }
        
        if (shape == 3){ //run if the user pick trapezoid
            System.out.print("Pick Trapezoid Height: "); //ask user to enter height
            double a = myScanner.nextInt(); //sets a variable as height
            System.out.print("Pick Trapezoid Base 1: "); //ask user to enter base 1
            double b = myScanner.nextInt(); //sets b variable as base 1
            System.out.print("Pick Trapezoid Base 2: "); //ask user to enter base 2
            double c = myScanner.nextInt(); //sets c variable as base 2
            area(a,b,c); //executes the area method for trapezoid
        }

    }
}