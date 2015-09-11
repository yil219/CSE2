////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Check Java Program
//
//  first compile the program 
//      javac Check.java
//  run the program
//      java Check//

import java.util.Scanner;
//add mian method
public class Check{
    
    public static void main(String[] args){
        
    
        Scanner myScanner=new Scanner(System.in);
        //declare an instance of the Scanner object
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost=myScanner.nextDouble();
        System.out.print("Enter the percentage tip that you wish to pay as a whole number(in the form xx):");
        double tipPercent=myScanner.nextDouble();
        tipPercent = tipPercent / 100;   //We want to convert the percentage into a decimal value
        System.out.print("Enter the number of people who went out to dinner:");
        int numPeople=myScanner.nextInt();
        
        double totalCost;
        double costPerPerson;
        int dollars,dimes,pennies;   //whole dollar amount of cost dimes
        //for storing digits 
        //to the right of the decimal point
        //for the cost$
        
        totalCost=checkCost*(1+tipPercent);
        costPerPerson=totalCost/numPeople;
        //get the whole amount, dropping decimal fraction;
        dollars=(int)costPerPerson;
        //get dimes amount
        dimes=(int)(costPerPerson*10)%10;
        pennies=(int)(costPerPerson*100)%10;
        System.out.println("Each person in the group owns $" + dollars + '.' + dimes+pennies);
        
        
    }
    
    
    
    
    
    
}
// end of main method
