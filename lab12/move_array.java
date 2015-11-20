////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Average move_array Program
//
//  first compile the program 
//      javac move_array.java
//  run the program
//      java move_array//

import java.util.Scanner;
public class move_array{
    public static void main(String[] args){
    Scanner myScanner =new Scanner(System.in);

System.out.println("Enter the size of the array ");
  int size = myScanner.nextInt();
    
    int[]array;
    
    try{
        
     array = new int [size];
        
    } catch (Exception e) {
    
       System.out.println("Warning: value entered should be greater than zero! "); 
        
    }
    
     array = new int [size];
    for(int i=0; i<array.length-1; i++){
         array[i] = (int)(Math.random()*100);
     }
    
       for(int m=0; m<array.length; m++){
        System.out.print(array[m]+ " ");
    }
    System.out.println();
     System.out.println("Enter the value of the index to be moved ");
     
    int index = myScanner.nextInt();
    
    int array2 [] = new int [size];
    
    try{
        for(int i = 0; i<index; i++){
            array2[i] = array[i];
        
        for(int j = index; j<array2.length-1; j++){
            array2[j] = array[j+1];
        }
        
        array2[array2.length-1] = array[index];
        
        }
    }
    catch(Exception e){
        System.out.println("The index shoud be between 0 and the size of the array！ ");
        
    }
    
 
    
    for(int n=0; n<array2.length; n++){
        System.out.print(array2[n]+ " ");
    }
    


}
}