import java.util.Scanner;//setting up the ability for the user to enter data

public class Block{ //Class
    //Main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner (System.in );//allows the user to input data
        System.out.print("Enter the length ");//user enters the length
        double length = myScanner.nextDouble();//makes the length the number entered
        System.out.print("Enter the height ");//user enters the height
        double height = myScanner.nextDouble();//makes the height the number entered
        System.out.print("Enter the width ");//user enters the width
        double width = myScanner.nextDouble();//makes the width the number entered
        
        double volume = length * height * width;//calculating the volume
        System.out.println("The volume of the block is " + volume);//displaying the volume
        double surfaceArea = 2 * length * height + 2 * height * width + 2 * width * length;//calculating the surface area
        System.out.println("The surface area of the block is " + surfaceArea);//displaying the surface area
        
    }
    
}