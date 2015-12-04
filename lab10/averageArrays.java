//ask user to set the size of an array. the array will be filled with random values between 0 and 100.
//

import java.util.Scanner;
import java.util.Random;

public class averageArrays{
    public static void main(String[] args){
    
        Scanner myScanner = new Scanner(System.in);
        System.out.print("How many values in the array: ");
        int n = myScanner.nextInt();
        int sum = 0;
        int ave = 0;
        int great = 0;
        int less = 0;
        int a = 1;
        int count = n;
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){ //Prints all the values
            arr[i] = (int)(Math.random()*100);
            sum = sum + arr[i];
            System.out.println("arr["+i+"] = " + arr[i]);
        }
        
        ave = sum/n;
        
        for(int i = 0; i < n; i++){
            if(arr[i] >= ave){
                great++;
            }
            else{
                less++;
            }
        }
                
        System.out.println("sum = " + sum);
        System.out.println("average = " + ave);
        System.out.println("Greater than average = " + great);
        System.out.println("Less than average = " + less);
                
    }
}
