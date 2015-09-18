////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Calculator Java Program
//
//  first compile the program 
//      javac Calculator.java
//  run the program
//      java Calculator//

import java.util.Scanner;
//add mian method
public class Calculator{   //create a class Calculator
    
     public static void main(String[] args){
         
     Scanner myScanner =new Scanner(System.in);
        //declare an instance of the Scanner object
        
    double a = myScanner.nextDouble();   //declare the variable a as the first input
    double b =myScanner.nextDouble();   //declare the second variable as the second input
    
    String operater = myScanner.next();  //declare the operater
    switch (operater){
        
        case "+":                              //if the operater is +
        System.out.println(a+b);
        break;
        
        case "-" :                                //if the operator is -
        System.out.println(a-b);
        break;
        
        case "*" : 
        System.out.println(a*b);
        break;
        
        case "/" : 
             {if (b==0)
        System.out.println("invalid");
        
            else
        System.out.println(a/b);
             }
        break;
        default:
        System.out.println("illegal operater");
    }
        
        
        
        
    
    
         
}
}