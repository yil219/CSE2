////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Encrypted_x Java Program
//
//  first compile the program 
//      javac encrypted_x.java
//  run the program
//      java encrypted//



import java.util.Scanner;       

public class Encrypted_x{       //create a class
    
    public static void main(String[] args){        //add mian method
        
Scanner myScanner =new Scanner(System.in);   //declare an instance of the Scanner object

System.out.println("Enter an integer in between 0 and 100");

int input = myScanner.nextInt();
if (input<0 || input>100) {
 System.out.println("invalid number! ");

System.exit(-1);
 
 
}

    for(int i = 0; i<input;i++) {


        for(int j = 0 ;j<input;j++) {
    
            if (input-i-1 == j) {
                System.out.print(" ");
            }
            else if (i==j){
                System.out.print(" ");
                
            }
          
            
            else {
                System.out.print("*");
                

            }
            
            
        }
        System.out.println("");
    }
    System.out.println();



}

}