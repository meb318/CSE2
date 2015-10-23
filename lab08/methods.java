//Program asks the user for ten numbers. Program displays the mean and the median
//using methods.

import java.util.Scanner;//sets up the ability for the user to input value

public class methods{ //class
    
    public static double mean(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j){ //starting the mean method
        double tot = a + b + c + d + e + f + g + h + i + j;//calculates the addition of the mean
        double y = tot / 10;//calculates the division of the mean
        return (y); //returns the mean value
        
    }
    
    public static double median(double e, double f){ //starting the median method
        double x = (e + f) / 2;//calculates the median value
        return (x); //returns the median value
    }
    
    public static void print(double x, double y){ //start of print method
        System.out.println("The mean is: " + y); //prints the mean value
        System.out.println("The median is: " + x); //prints the median value
    }
    
    public static void main(String[] args){ //main method
        Scanner myScanner = new Scanner(System.in);//starts the scanner
        System.out.print("Enter number: ");//asks user to input number
        double a = myScanner.nextInt();//user inputs number
        System.out.print("Enter number: ");//asks user to input number
        double b = myScanner.nextInt();//user inputs number
        System.out.print("Enter number: ");//asks user to input number
        double c = myScanner.nextInt();//user inputs number
        System.out.print("Enter number: ");//asks user to input number
        double d = myScanner.nextInt();//user inputs number
        System.out.print("Enter number: ");//asks user to input number
        double e = myScanner.nextInt();//user inputs number
        System.out.print("Enter number: ");//asks user to input number
        double f = myScanner.nextInt();//user inputs number
        System.out.print("Enter number: ");//asks user to input number
        double g = myScanner.nextInt();//user inputs number
        System.out.print("Enter number: ");//asks user to input number
        double h = myScanner.nextInt();//user inputs number
        System.out.print("Enter number: ");//asks user to input number
        double i = myScanner.nextInt();//user inputs number
        System.out.print("Enter last number: ");//asks user to input number
        double j = myScanner.nextInt();//user inputs number
        
        double y = mean(a,b,c,d,e,f,g,h,i,j);//executes the mean method and captures the mean value
        double x = median(e,f);//executes the median method and captures the median value
        
        print(x,y);//executes the print method
    }
}