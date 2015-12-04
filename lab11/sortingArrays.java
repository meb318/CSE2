import java.util.Arrays;

public class sortingArrays{
    
    public static void sort(int[] i){
        Arrays.sort(arr);
        //System.out.print(arr[]);
    }
        
    public static void main(String[] args){
        
        int[] arr = new int[20];
        
        for(int i = 0; i<20; i++){ //Prints all the values
            arr[i] = (int)(Math.random()*100);
            System.out.print(" " + arr[i]);
        }
        //sort(arr);
        Arrays.sort(arr);
        
        System.out.println();
        int[] arr2;
        arr2 = new int[10];
        
        for(int j=0; j<10; j++){
            arr2[j] = (int)(Math.random()*100);
            System.out.print(" " + arr2[j]);
        }
        
        System.out.println();
        int[] arr3;
        arr3 = new int[30];
        
        for(int k=0; k<30; k++){
            arr3[k] = (int)(Math.random()*100);
            System.out.print(" " + arr3[k]);
        }
        System.out.println();

    }
}