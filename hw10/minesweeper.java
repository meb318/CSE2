//Max Brungardt
//Minesweeper

import java.util.Scanner; //setup user inputs
import java.util.Random; //setup random

public class minesweeper{ //class
    public static void main(String[] args){ //main method
        
        Scanner myScanner = new Scanner(System.in); //set scanner variable
        System.out.print("Enter board size (between 2 and 30): "); //ask user for board size inpu
        int n = myScanner.nextInt(); //set the horizontal and vertical board size
        int board = n * n; //set board size variable
        System.out.print("Enter number of bombs on board(between 1 and " + board + ": "); //ask user for number of bombs
        int m = myScanner.nextInt(); //set the number of mines
        System.out.println(); //print empty line
        
        int[][] array; //start double array
        array = new int [n][n]; //give array boundaries
        
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                while(m > 0){
                    int x = (int)(Math.random()*n);
                    int y = (int)(Math.random()*n);
                    
                    if (x == i){
                        if (y == j){
                            System.out.print("M ");
                            
                        }
                    }
                    
                    m--;
                
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");

        }

        
        
    }
}