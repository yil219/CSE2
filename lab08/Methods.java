////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Methods Java Program
//
//  first compile the program 
//      javac Methods.java
//  run the program
//      java Methods//

import java.util.Scanner;

public class Methods{


public static double findMean(double firstNum, double secondNum, double thirdNum,double forthNum, double fifthNum, double sixthNum, double seventhNum, double eighthNum, double ninthNum, double tenthNum){


return ((firstNum+secondNum+thirdNum+forthNum+fifthNum+sixthNum+secondNum+eighthNum+ninthNum+tenthNum)/10);
}

public static double findMedian(double firstNum, double secondNum, double thirdNum,double forthNum, double fifthNum, double sixthNum, double seventhNum, double eighthNum, double ninthNum, double tenthNum){
    
return((fifthNum+sixthNum)/2);
}


    public static void main(String[] args){
        Scanner myScanner =new Scanner(System.in);
        
    System.out.println("Enter the first number");
        double firstNum = myScanner.nextDouble();
    System.out.println("Enter the second number");
        double secondNum = myScanner.nextDouble();
    System.out.println("Enter the third number");
        double thirdNum = myScanner.nextDouble();
    System.out.println("Enter the forth number");
        double forthNum = myScanner.nextDouble();
    System.out.println("Enter the fifth number");
        double fifthNum = myScanner.nextDouble();
    System.out.println("Enter the sixth number");
        double sixthNum = myScanner.nextDouble();
    System.out.println("Enter the seventh number");
        double seventhNum = myScanner.nextDouble();
    System.out.println("Enter the eighth number");
        double eighthNum = myScanner.nextDouble();
    System.out.println("Enter the ninth number");
        double ninthNum = myScanner.nextDouble();
    System.out.println("Enter the tenth number");
        double tenthNum = myScanner.nextDouble();
System.out.println("The mean of these ten numbers is: " + findMean(firstNum,secondNum,thirdNum,forthNum,fifthNum,sixthNum,seventhNum,eighthNum,ninthNum,tenthNum));
System.out.println("The median of these ten numbers is: " + findMedian(firstNum,secondNum,thirdNum,forthNum,fifthNum,sixthNum,seventhNum,eighthNum,ninthNum,tenthNum));


    
}
}