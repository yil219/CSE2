////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Timer Java Program
//
//  first compile the program 
//      javac Timer.java
//  run the program
//      java Timer//


import java.util.Scanner;
//add mian method

public class Timer{
    //delcare a class name
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        //declare an instance of the Scanner object
    System.out.println("Enter the current time:");   //the first input
    int currentTime=myScanner.nextInt();   //declare the variable currentTime
    System.out.println("Enter the time that you will be eating dinner:");   //the second input
    int dinnerTime=myScanner.nextInt();   //declare the variable dinnerTime
    int restTime;    //declare the variable restTime 
    restTime=dinnerTime-currentTime;
    int hours,minutes;
    
    
    
    hours=(int)restTime/100;
    
    int restMinutes;
    restMinutes=hours*60%60;
    
    minutes=(int)(restTime%100);
     System.out.println("You have " + hours + " hours and " + minutes + " minutes " + " until dinner. " ); // output of the program
        
        
        
}
}