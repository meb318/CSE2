//Asks user to enter non-negative integer stating number of timesheets
//to be read. Then asks for 5 integers which gives pay per hour in cents
//Then asks for 5 integers saying the hours they worked on each day of
//the work week. Then print the total payroll of all employees

import java.util.Scanner;//allow user to input data

public class timeSheets{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//set user input variable
        System.out.print("How many employees (must be positive): ");//ask how many employees worked
        int employees = myScanner.nextInt();//set the number entered to be the number of employees
        int loopCount = employees - employees;//start a counter for the number of employees
        int abc;//start the pay all variable
        int everyone = 0;//setting the counter for pay for everyone
        
        while (employees > loopCount){//tell the loop to run until loopcount is larger than employees
            System.out.print("Enter pay per hour in cents: ");//ask how much the pay per hour is
            int pay = myScanner.nextInt();//set the pay per hour variable
            System.out.print("Hours for Monday: ");//ask for hours on monday
            int mon = myScanner.nextInt();//set the hours on monday variable 
            System.out.print("Hours for Tuesday: ");//ask for hours on tuesday
            int tues = myScanner.nextInt();//set the hours on tuesday variable
            System.out.print("Hours for Wednesday: ");//ask for hours on wednesday
            int wed = myScanner.nextInt();//set the hours on wednesday variable
            System.out.print("Hours for Thursday: ");//ask for hours on thursday
            int thurs = myScanner.nextInt();//set the hours on thursdy variable
            System.out.print("Hours for Friday: ");//ask for hours on friday
            int fri = myScanner.nextInt();//set the hours on friday variable
            
            int totalHours = mon + tues + wed + thurs + fri;//add all the hours together under one variable
            int totalPay = totalHours * pay;//find the total pay per worker
            
            everyone = everyone + totalPay;//adding the current persons pay to the counter for everyones pay
            
            loopCount++;//add to the loop counter
        }
            System.out.println("The total payroll in cents is:" + everyone);//print out the total pay for everyone in cents
    }
}
