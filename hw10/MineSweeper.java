////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//MineSweeper Java Program
//
//  first compile the program 
//      javac MineSweeper.java
//  run the program
//      java MineSweeper//

import java.util.Scanner;
public class MineSweeper{
     public static void main(String[] args){
    Scanner myScanner =new Scanner(System.in);
    
    System.out.println("Enter the size of the board ");
    int N = myScanner.nextInt();
    
    if(N<2 || N>30){
        System.out.println("Invalid Number! ");
    }
    int[][]board = new int [N][N];
    
    System.out.println("Enter the number of mines to be placed on the board ");
    int M = myScanner.nextInt();
    
    if(M<1 || M>N*N){
    System.out.println("Invalid Number! ");
    }
    for(int i=0; i<M; i++)
    {
    int X = (int)(Math.random()*N);
    int Y = (int)(Math.random()*N);
    board[X][Y]=10;
    }
    
for(int i=0;i<N;i++){  
    for(int j=0;j<board[i].length;j++){  
        if(board[i][j]>8){  
        if(j>0){            
        board[i][j-1]++;  
                    }  
        if(j<board[i].length-1){  
        board[i][j+1]++; 
                    }  
        if(i>0){            
            board[i-1][j]++;  
        if(j>0){  
        board[i-1][j-1]++;  
                        }  
        if(j<board[i].length-1){  
        board[i-1][j+1]++;  
                        }  
                    } 
        if(i<N-1){               
            board[i+1][j]++;  
        if(j>0){  
        board[i+1][j-1]++;  
                        }  
        if(j<board[i].length-1){  
         board[i+1][j+1]++;  
                        }  
                    }  
                }  
            }  
        }  
        
         for(int i=0;i<N;i++){  
            for(int j=0;j<N;j++){  
            if(board[i][j]>=10)  
            System.out.print(" M ");  
            else  
            System.out.print(" "+board[i][j]+" " );  
            }  
            System.out.println( );  
        }  
     }
}