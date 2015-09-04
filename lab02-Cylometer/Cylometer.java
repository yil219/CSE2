//////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Cylometer Java Program
//
//  first compile the program 
//      javac Cylometer.java
//  run the program
//      java Cylometer//

//define a class

public class Cylometer{
    //main methof required for every Java program
    public static void main(String [] args){
        int secsTrip1=480; //the total time for the first rotation is 480 seconds
        int secsTrip2=3220; // the total time for the second rotation is 3220 
        int countsTrip1=1561; //the total circles for the first rotation is 1561
        int countsTrip2=9037; //the tatal circles for the second rotation is 9037
        double wheelDiameter=27.0; // the diameter of the wheel is 27.0
        double PI=3.14159; // constant PI
        int feetPerMile=5280; //one mile is 5280 feet
        int inchesPerFoot=12; //one foot is 12 inches
        int secondsPerMinute=60;//one minute is 60 seconds
        double distanceTrip1=countsTrip1*wheelDiameter*PI;//distance in inches
        double distanceTrip2=countsTrip2*wheelDiameter*PI;//distance in inches
        double totalDistance=distanceTrip1+distanceTrip2;//distance in inches
        System.out.println("Trip 1 took"+(secsTrip1/secondsPerMinute)+"minutes and had "+countsTrip1+"counts.");
        System.out.println("Trip 2 took"+(secsTrip2/secondsPerMinute)+"minutes and had "+countsTrip2+"counts.");
    
        
        
        //print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+"miles");
        System.out.println("Trip 2 was "+distanceTrip2+"miles");
        System.out.println("The total distance was" +totalDistance+"miles");
        
    }
}