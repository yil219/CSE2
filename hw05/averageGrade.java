////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//averageGrade Java Program
//
//  first compile the program 
//      javac averageGrade.java
//  run the program
//      java averageGrade//



import java.util.Scanner;       

public class averageGrade{       //create a class
    
    public static void main(String[] args){        //add mian method
        
        Scanner myScanner =new Scanner(System.in);       //declare an instance of the Scanner object
        

     int numOfGrade=0;
     double totalGrade=0;
     
    boolean X = true;       //if X is true, it will run the following part
        
    while(X = true){
       
        System.out.println("Enter a grade: ");
    double grade = myScanner.nextDouble();
    
     {if(grade<=100 && grade>=0)
    totalGrade = totalGrade+grade;
     }
     
    {if(grade<=100 && grade>=0)
    numOfGrade++;
    
     }
  
        
    {if((grade<0 || grade>100) && grade !=999)
        System.out.println("An invalid grade has been entered ");
    
    }
    
        
        
    {if(grade == 999)
        System.out.println("The averageGrade is " + totalGrade/numOfGrade);
    X = false;
        }
        
        
    }
        
        

    }
}


