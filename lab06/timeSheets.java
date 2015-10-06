//Asks user to enter non-negative integer stating number of timesheets
//to be read. Then asks for 5 integers which gives pay per hour in cents
//Then asks for 5 integers saying the hours they worked on each day of
//the work week. Then print the total payroll of all employees

import java.util.Scanner;

public class timeSheets{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("How many employees (must be positive): ");
        int employees = myScanner.nextInt();
        int loopCount = employees - employees;
        int payAll;
        
        while (employees > loopCount){
            System.out.print("Enter pay per hour in cents: ");
            int pay = myScanner.nextInt();
            System.out.print("Hours for Monday: ");
            int mon = myScanner.nextInt();
            System.out.print("Hours for Tuesday: ");
            int tues = myScanner.nextInt();
            System.out.print("Hours for Wednesday: ");
            int wed = myScanner.nextInt();
            System.out.print("Hours for Thursday: ");
            int thurs = myScanner.nextInt();
            System.out.print("Hours for Friday: ");
            int fri = myScanner.nextInt();
            
            int totalHours = mon + tues + wed + thurs + fri;
            int totalPay = totalHours * pay;
            
            for(employees > loopCount){
            payAll = totalPay;
            //Store the total pay for each employee in a new variable
            //Then add that to payAll
            //This will destroy the old number each time a new one is made and have a counter
            //for all the numbers combined
            }
            
            loopCount += 1;
            
            //System.out.print(totalHours);
            System.out.println("Total for all employees is: $" + payAll);
            
            
        }
    }
}