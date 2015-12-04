////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Sorting Java Program
//
//  first compile the program 
//      javac Sorting.java
//  run the program
//      java Sorting//


import java.util.Scanner;

public class Sorting{

     public static void sort1(double []array1){
   
        for (int i =0; i < 20; i++){
            for(int j=i+1; j < 20; j++){
                if (array1[i] > array1[j]){
                    double n = array1[i]; 
                    array1[i] = array1[j];
                    array1[j]= n;
                    
                }
                
            }
        }
        System.out.println("The ascending order for array1 is: ");
        for(int i = 0; i<19; i++){
            System.out.print(array1[i] + ",");
        }
        System.out.print(array1[19]);
    }
    
    
    public static void sort2(double []array3){
   
        for (int i =0; i < 30; i++){
            for(int j=i+1; j < 30; j++){
                if (array3[i] > array3[j]){
                    double n = array3[i]; 
                    array3[i] = array3[j];
                    array3[j]= n;
                    
                }
                
            }
        }
        System.out.println("The ascending order for array3 is: ");
        for(int i = 0; i<29; i++){
            System.out.print(array3[i] + ",");
        }
        System.out.print(array3[29]);
    }
    
    
    public static void main(String[] args){
    double []array1 = new double [20];
    double []array2 = new double [10];
    double []array3 = new double [30];
System.out.println("The array1 is: ");
    for(int i =0 ; i<array1.length; i++){
        array1[i] = (int)(Math.random()*100);
    }
    for(int i = 0; i<array1.length; i++){
    System.out.print(array1[i] + " ");
    }
    
    System.out.println("");
  sort1(array1);
    System.out.println("");
  System.out.println("The array2 is: ");
  for(int j = 0; j<array2.length; j++){
        array2[j] = (int)(Math.random()*100);
    }
    for(int j = 0; j<array2.length; j++){
        System.out.print(array2[j] + " ");
    }
    
    System.out.println("");
    
    for(int a = 0; a<array1.length; a++){
        array3[a] = array1[a];
    }
    for(int a = array1.length; a<array3.length; a++){
        array3[a] = array2[a-20];
    }
    
    sort2(array3);

}
      
      
    

}