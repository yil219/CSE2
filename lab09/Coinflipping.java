////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Coinflipping Java Program
//
//  first compile the program 
//      javac Coinflipping.java
//  run the program
//      java Coinflipping//



import java.util.Scanner;
import java.util.Random;

//define class
public class Coinflipping {
    public static boolean flip() {
    	Random coinflip = new Random();
    	boolean headandtail;
    	int Vari = coinflip.nextInt(2);
    	System.out.println(Vari);
    		if (Vari == 0) {
    			headandtail = true;
    		}
    		else {
    			headandtail = false;
    		}
    	return headandtail;
    }
    
    
    
    public static int flip(int Vari) {          
    	Random coinflip = new Random();
    	int headCount = 0;
    	for (int i = 0; i < Vari; i++) {
    		if (coinflip.nextBoolean() == true) {
    			headCount++;
    		}
    	}
    	return headCount;
    }
    
    
 public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter 0 to flip coin once.");
    System.out.println("Enter an Number between 1 to 100 to flip coin X times.");
    int Num = myScanner.nextInt();
    	while (true) {
    		if (Num == 0) {
    		boolean result = flip();
    			if (result == true) {
    				System.out.println("Head!");
    			}
    			if (result == false) {
    				System.out.println("Tail!");
    			}
    			break;
    		}
    		if (Num >1  && Num <= 100) {
    			int headCount = flip(Num);
    			System.out.println("Head appears " + headCount + " times. Tail appears " + (Num - headCount) + " times.");
    			break;
    		}
    		if (Num>100) {
    		System.out.println("Exits the program");
    		break;
    		}
    	}
    }
}