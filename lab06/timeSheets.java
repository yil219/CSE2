////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//timeSheets Java Program
//
//  first compile the program 
//      javac timeSheets.java
//  run the program
//      java timeSheet//


import java.util.Scanner;       

public class timeSheets{       //create a class

 public static void main(String[] args){        //add mian method
        
        Scanner myScanner =new Scanner(System.in);       //declare an instance of the Scanner
        
        
System.out.println("Enter the number of employee timesheets: ");
 int numOfTimeSheets = myScanner.nextInt();            //input the number of empolyees
 
{if (numOfTimeSheets<0)
System.out.println("Invalid number has been entered! ");        //number of empolyee should be positive
}

int a=1;
double totalpay=0;
double totalpayroll=0;
while(a<=numOfTimeSheets){


System.out.println("Enter the pay per hour in cents: ");
double payPerHour = myScanner.nextDouble();

System.out.println("Enter the working hours on Mon: ");
int hourMon = myScanner.nextInt();

System.out.println("Enter the working hours on Tues: ");
int hourTues = myScanner.nextInt();

System.out.println("Enter the working hours on Weds: ");
int hourWeds = myScanner.nextInt();

System.out.println("Enter the working hours on Thurs: ");
int hourThurs = myScanner.nextInt();

System.out.println("Enter the working hours on Fri: ");
int hourFri = myScanner.nextInt();

int totalHour = hourMon+hourTues+hourWeds+hourThurs+hourFri;
totalpayroll = totalpayroll+(totalHour*numOfTimeSheets*payPerHour);

a++;

}
System.out.println("The totalpayroll of all empolyees is : " + totalpayroll);






 
 
 
 
 
 
 }
}
 