//The program will take the inputed check and divide it equally throughout the group.
//The program needs the cost, tip, and number of ways to split the check to be input.

import java.util.Scanner;//setting up the ability for the user to enter data
//Class
public class Check{ 
    //Main method
    public static void main(String[] args){
    
        Scanner myScanner = new Scanner (System.in );//allows the user to input data
        System.out.print("Enter the original cost of the check in the form xx.xx: ");//the line to enter the cost
        double checkCost = myScanner.nextDouble();//making the checkCost the number entered
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx) : ");//the line to enter the percentage
        double tipPercent = myScanner.nextDouble();//making the tipPercent the number started
        tipPercent /= 100; //converting the percentage into a decimal
        System.out.print("Enter the number of people who went out to dinner: ");//the line to enter the number of people at dinner
        int numPeople = myScanner.nextInt();//making the numPeople the number entered
        
        double totalCost;//setting up total cost variable
        double costPerPerson;//setting up the cost per person for the check
        int dollars;//starting variable for dollars
        int dimes;//starting variable for dimes
        int pennies;//starting variable for pennies
        totalCost = checkCost * (1 + tipPercent);//calculating the total cost with tip
        costPerPerson = totalCost / numPeople;//finding the cost for each person by dividing 
                                              //the total cost over the number of people
        dollars=(int)costPerPerson;//finding the whole amount, dropping decimal fraction
        dimes=(int)(costPerPerson * 10) % 10;//getting the dimes amount where the %
                                             //operator returns the remainder
        pennies=(int)(costPerPerson * 100) % 10;//getting the dimes amount where the %
                                                //operator returns the remainder
        System.out.println("Eacher person in the group owes $" + dollars + '.' + dimes + pennies);
        // printing the final amount each person owes
    }//end of main method
}//end of class