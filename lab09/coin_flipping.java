import java.util.Scanner;
import java.util.Random;

public class coin_flipping{
    
    public static void flip(){
        int r = (int)(Math.random()*2);
        if (r == 1){
            System.out.println("Heads: 0");
            System.out.println("Tails: " + r);
        }
        else {
            System.out.println("Heads: 1");
            System.out.println("Tails: 0");
        }
    }
    
    public static void flip(int x){
        flip();
    }
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.print("Enter a number between 0 and 100:  ");
        a = myScanner.nextInt();//user inputs number
        while (a <= 100 && a >= 0){
        if (a == 0){
            flip();
        }
        a--;
        if (a > 0){
            flip(a);
        }
        
        }
    }
}