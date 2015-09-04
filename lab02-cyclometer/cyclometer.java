//printing the number of minutes of each trip
//                       counts for each trip
//                       distance of each trip in miles
//                       distance for the two trips combined



public class cyclometer {
//meain method
    public static void main(String[] args) {
        
        int secondsTrip1= 480;//first trip time
        int countsTrip1= 1561;//first trip counts
        int secondsTrip2= 3220;//second trip time
        int countsTrip2= 9037;//second trip counts
        
        double wheelDiameter= 27.0, // naming wheel diameter
        PI=3.14159,//stating pi
        feetPerMile= 5280,//setting amount of feet in a mile
        inchesPerFoot= 12,//setting amount inches in a foot
        secondsPerMinute= 60;//setting amount of seconds in a minute
        double distanceTrip1, distanceTrip2;
        double totalDistance;//setting up the distances for all the trips
        
        System.out.println("Trip 1 took "+ (secondsTrip1/secondsPerMinute)+
         " minutes and had "+countsTrip1+" counts.");//calculating minutes and counts trip1
        System.out.println("Trip 2 took "+ (secondsTrip2/secondsPerMinute)+
         " minutes and had "+countsTrip2+" counts.");//calculating minutes and counts trip2
        
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;//gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //gives distance in miles
        totalDistance=distanceTrip2+distanceTrip1;//gives distance in miles
        
        //Print data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");//printing total distance trip1
        System.out.println("Trip 2 was "+distanceTrip2+" miles");//printing total distance trip2
        System.out.println("The total distance was "+totalDistance+" miles");//printing total distance for everything
        
        
    }//end of main method
}//end of class