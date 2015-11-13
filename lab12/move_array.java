//Max Brungardt
//Move_array.java
import java.util.Scanner;
import java.util.Random;

public class move_array{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int s = myScanner.nextInt();
        
        try{
            int z;
            int[] arr;
            
            arr = new int [s - 1];
            arr = new int [s];
            
            for(int i = 0; i < s; i++){
                arr[i] = (int)(Math.random()*100);
                System.out.print(arr [i] + " ");
            }
            System.out.println();
            
            System.out.print("Insert value of the index to be moved: ");
            int v = myScanner.nextInt();
            
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