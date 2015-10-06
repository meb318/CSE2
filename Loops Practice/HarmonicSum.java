public class HarmonicSum{
    public static void main(String[] args){
        
    double H=0;
    double n=1;
    
    while(n<=50000){    
        H += 1/n;
        n++;
    }
    System.out.println(H);
        
    H=0;
    n=1;
    
    for (n=50000; n>=0; n--){    
        H += 1/n;
    }
    System.out.println(H);
    /**H=0;
    
    for (n=50000; n<=0; n--){    
        H=H + (1/n);
    }
    System.out.println(H);**/
}
}