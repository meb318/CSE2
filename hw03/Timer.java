import java.util.Scanner;//setting up the ability for the user to enter data

public class Timer{ //Class
    //Main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner (System.in );//allows the user to input data
        System.out.print("Enter current time ");//user enters the time
        int currentTime = myScanner.nextInt();//makes the currentTime the number entered
        System.out.print("Enter the time you will be eating dinner ");//user enters time of dinner
        int dinnerTime = myScanner.nextInt();//makes the dinnerTime the number entered
        
        int timeUntil = dinnerTime - currentTime;//calculating the military time left
        int finalHour = timeUntil / 100;//finding the hours
        int finalMin = timeUntil % 100;//finding the minutes
        System.out.println("You have " +  finalHour + " hours and " + finalMin + " minutes until dinner");//displaying the time in hours and minutes
        
    }
    
}