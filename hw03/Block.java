////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Block Java Program
//
//  first compile the program 
//      javac Block.java
//  run the program
//      java Block//


import java.util.Scanner;
//add mian method

public class Block{
 //delcare a class name
    public static void main(String[] args){
        
        Scanner myScanner=new Scanner(System.in);
          //declare an instance of the Scanner object
      System.out.println("Enter the length of the block: ");  //the first input length
      double length=myScanner.nextDouble();   //declare the variable length
      
      System.out.println("Enter the width of the block: ");   //the second input width
      double width=myScanner.nextDouble();    //declare the variable width
      
      System.out.println("Enter the height of the block: ");  //the third input height
      double height=myScanner.nextDouble();   //declare the variable height
      
      double volume=length*width*height;   //declare the volume of the block
      double surface=(length*width*2)+(length*height*2)+(width*height);  //declare the surface of the block
      
      System.out.println("The volume of the block of dimensions " + length + "*" + width + "*" + height + " is " + volume);
      //output of the volume
      System.out.println("The surface area of the block is " + surface);
      //output of the surface
    }
    }