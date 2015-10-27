////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//areas Java Program
//
//  first compile the program 
//      javac areas.java
//  run the program
//      java areas//



import java.util.Scanner;

public class areas{         //declare the class 
    public static double area(double radius){    //method1 find the area of the circle
        
        double areaCircle = Math.pow(radius, 2)*Math.PI;
        return areaCircle;
    }
    
    public static double area(double length, double width){    //method2 find the area of the rectangle
       
        
        double areaRectangle = length*width;
        return areaRectangle;
    }
    
    public static double area(double height, double base1, double base2){     //method3 find the area of the trapezoid
       
        
        double areaTrapezoid = (base1+base2)*height/2;
        return areaTrapezoid;
    }
    
     public static void main(String[] args){      //declare the main method 
        Scanner myScanner =new Scanner(System.in);
         while(true){                                //while loop 
    System.out.println("Enter the number of the shape circle=1; Rectangle=2; Trapezoid=3; Exit=0");
    int input = myScanner.nextInt();                //input  the number of shape
    
   
   
    if (input == 1){                                  //call the mathod1
        System.out.println("Enter the value of radius ");
        double radius = myScanner.nextDouble();
        System.out.println("The area of the circle is " + area(radius));
    }
    
    if(input == 2){                                      //call the method2
         System.out.println("Enter the value of length ");
        double length = myScanner.nextDouble();
        System.out.println("Enter the value of width ");
        double width = myScanner.nextDouble();
     System.out.println("The area of the rectangle is " + area(length, width));
    }
    
    if(input == 3){                                    //call the method3
         System.out.println("Enter the value of height ");
        double height = myScanner.nextDouble();
        System.out.println("Enter the value of base1 ");
        double base1 = myScanner.nextDouble();
        System.out.println("Enter the value of base2 ");
        double base2 = myScanner.nextDouble();
     System.out.println("The area of the trapezoid is " + area(height, base1,base2));
    }
    
    if (input == 0){                              //exit the program when enter 0 
      break;
    }
    }
    
        
    
    
        
    }
        
    
    
    
    
    
}