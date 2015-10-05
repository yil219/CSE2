////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Pyramid Java Program
//
//  first compile the program 
//      javac Pyramid.java
//  run the program
//      java Pyramid//



import java.util.Scanner;       

public class Pyramid{       //create a class
    
    public static void main(String[] args){        //add mian method
        
        Scanner myScanner =new Scanner(System.in);       //declare an instance of the Scanner object
        
    System.out.println("What size pyramid? ");
    
        int size = myScanner.nextInt();
    
    for(int i=0;i<size;i++){
    for(int j=0;j<(size-i);j++){
        System.out.print(" ");
    }
    for(int k=0;k<=i;k++){
        System.out.print("* ");
    }
    System.out.println();
    }
        
        
        
        
        
        
        
        
        
        
    }
}
        
