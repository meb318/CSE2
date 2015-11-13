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
        
        //int r = (int)(Math.random()*100);
        //System.out.println(r);
        
        int[] arr ;
        arr = new int[n];
        
        for(int i = 0; i < n; i++){ //Prints all the values
            arr[0] = (int)(Math.random()*100);
            System.out.println("arr["+ i +"]= " + arr[0]);
            
                for(int m = 0; m < 1; m++){
                    sum = sum + arr[0];
                    ave = sum / n;
                    //System.out.println(ave);
                    System.out.println("The sum is currently: " + sum);
                }
                
                for(int h = 0; h < 1; h++){
                    if (arr[0] < ave){
                        great++;
                    }
                    else {
                        less++;
                    }
                    System.out.println(great);
                    System.out.println(less);
                }
        }
        
        
        
        
        
    }
}


/**int[] arr;
arr = new int[5];
arr[0]=5;

for(int i = 0; i<5; i++){
    System.out.println("arr["+ i +"]= " + arr[i]);
}**/
