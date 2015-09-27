////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//CalculatorSpecial Java Program
//
//  first compile the program 
//      javac CalculatorSpecial.java
//  run the program
//      java CalculatorSpecial//


import java.util.Scanner;
//add mian method
public class CalculatorSpecial{   //create a class Calculator

     public static void main(String[] args){
      //declare an instance of the Scanner object
      
      Scanner myScanner =new Scanner(System.in);
        //declare an instance of the Scanner object
        
    
    boolean Y = true;
    
    while(Y==true){        //if Y is true, it will run the following part
    System.out.println("Enter the first number: ");
    double a = myScanner.nextDouble();   //declare the variable a as the first input

    System.out.println("Enter the second number: ");
    double b =myScanner.nextDouble();   //declare the second variable as the second input

    System.out.println("Enter the operater: ");
    String operater = myScanner.next();  //declare the operater
  
    
    switch (operater){
        
        case "+":                              //if the operater is +
        System.out.println(a+b);
        break;
        
        case "-" :                                //if the operator is -
        System.out.println(a-b);
        break;
        
        case "*" : //if the operator is *
        System.out.println(a*b);
        break;
        
        case "/" :  //if the operater is /
             {if (b==0)       
        System.out.println("invalid");
        
            else
        System.out.println(a/b);
             }
        break;
        default:
        System.out.println("illegal operater");
        
    }
    System.out.println("Enter n to stop ");       
    String var = myScanner.next();     //declare a variable
    if (var.equals("n")) {      //when enter n Y is false
        Y = false;
    }
    }
    
    
    
    
        
        
    
    
    
    
     }
}