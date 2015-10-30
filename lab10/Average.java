////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Average Java Program
//
//  first compile the program 
//      javac Average.java
//  run the program
//      java Average//


import java.util.Scanner;

public class Average{
    
    public static void main(String[] args){
    Scanner myScanner =new Scanner(System.in);
    
    System.out.println("What is the number of values that are to be stored in an array? ");
     int n = myScanner.nextInt();
     double[] mylist = new double [n];
     
     for(int i=0; i<mylist.length; i++){
         mylist[i] = (int)(Math.random()*100);
     }
     
     for(int i=0; i<mylist.length; i++){
         System.out.println(mylist[i] + " ");
     }
     
     double total = 0;
     for(int i = 0; i<mylist.length; i++){
         total +=mylist[i];
     }
     double average = total/mylist.length;
     System.out.println("The sum of the values in the array is " + total);
     System.out.println("The average of the values in the array is " + average);
     
     for(int i=0; i<mylist.length; i++){
        if(mylist[i]>=average ){
         System.out.println("Vaules that are greater and equal to the average are " + mylist[i]);
         //Val = mylist[i];
        }
      
     }
    
     
     
     
    }
    
}