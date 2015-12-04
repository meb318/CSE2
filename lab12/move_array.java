//Max Brungardt
//Move_array.java

import java.util.Scanner; //setup ability to input
import java.util.Random; //setup random numbers

public class move_array{ //class
    public static void main(String[] args){ //main method
        
        Scanner myScanner = new Scanner(System.in); //setup scanner
        System.out.print("Input size of array: "); //ask for input size of array
        int s = myScanner.nextInt(); //set s equal to number entered
        
        try{
            int[] arr2;
            int[] arr;
            
            
            //arr = new int [s - 1];
            arr = new int [s];
            
            for(int i = 0; i < s; i++){
                arr[i] = (int)(Math.random()*100);
                System.out.print(arr [i] + " ");
            }
            
            System.out.println();
            
            System.out.print("Insert value of the index to be moved: ");
            int v = myScanner.nextInt();
            
            /**for(int j = (arr - 1); j >= 0; i--){
                arr[i+1] = arr[i];
            }**/
            
            //if(v == i){
            //    z = v;
            //    System.out.print(z);
            //}
            
        }
        catch(Exception e){
            System.out.print("You entered an invalid number.");
        }
        
    }
}