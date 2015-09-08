public class Arithmetic{

    public static void main(String [] args){
        
        //Number of pairs of socks
        int nSocks=3;
        //cost per pair of socks
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEvenvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        double taxPercent=0.06;
        
        double socksTax = sockCost$*taxPercent*nSocks;
        double glassTax = glassCost$*taxPercent*nGlasses;
        double envelopeTax = envelopeCost$*taxPercent*nEvenvelopes;
        
        double sockTotal = nSocks*sockCost$+socksTax;
        double glassTotal = nGlasses*glassCost$+glassTax;
        double envelopeTotal = nEvenvelopes*envelopeCost$+envelopeTax;
        
        System.out.println("Socks cost = $" + sockCost$);
        System.out.println("Glasses cost = $" + glassCost$);
        System.out.println("Envelopes cost = $" + envelopeCost$);
        
        System.out.println("The total cost for socks is = $" + (sockCost$*nSocks));
        System.out.println("The total cost for glasses is = $" + (glassCost$*nGlasses));
        System.out.println("The total cost for envelopes is = $" + (envelopeCost$*nEvenvelopes));
        
        System.out.println("The tax for socks is = $" + socksTax);
        System.out.println("The tax for glasses is = $" + glassTax);
        System.out.println("The tax for envelopes is = $" + envelopeTax);
        
        System.out.println("The total cost for socks plus tax is = $" + sockTotal);
        System.out.println("The total cost for glasses plus tax is = $" + glassTotal);
        System.out.println("The total cost for envelopes plus tax is = $" + envelopeTotal);
        
    }
    
}