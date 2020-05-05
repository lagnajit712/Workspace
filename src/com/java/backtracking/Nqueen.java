package com.java.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class Nqueen {
  public static void main(String ...args){
    System.out.println("Enter size of N X N chess board ");
    Scanner in= new Scanner(System.in);
    int n = in.nextInt();
    int[][] board=new int[n][n];
    System.out.println("Current Chess board ");
    printSolution(board);
    if (solveNQueen(board, 0,n) == false) {
      System.out.print("Solution does not exist");
    }
    System.out.print("Possible Solutions exist \n");
    printSolution(board);
  }

  public static boolean solveNQueen(int board[][], int col,int N)
  {
        /* base case: If all queens are placed
           then return true */
    if (col >= N)
      return true;

        /* Consider this column and try placing
           this queen in all rows one by one */
    for (int i = 0; i < N; i++) {
            /* Check if the queen can be placed on
               board[i][col] */
      if (isSafe(board, i, col,N)) {
        /* Place this queen in board[i][col] */
        board[i][col] = 1;
        System.out.println("After row "+i+" and column "+col);
        printSolution(board);
        /* recur to place rest of the queens */
        if (solveNQueen(board, col + 1,N) == true)
          return true;

                /* If placing queen in board[i][col]
                   doesn't lead to a solution then
                   remove queen from board[i][col] */
        board[i][col] = 0; // BACKTRACK
      }
      System.out.println("After row "+i+" and column "+col +" after is Safe");
      printSolution(board);
    }

        /* If the queen can not be placed in any row in
           this colum col, then return false */
    return false;
  }

  /* This function solves the N Queen problem using
     Backtracking.  It mainly uses solveNQUtil () to
     solve the problem. It returns false if queens
     cannot be placed, otherwise, return true and
     prints placement of queens in the form of 1s.
     Please note that there may be more than one
     solutions, this function prints one of the
     feasible solutions.*/
  /* A utility function to print solution */
  public static void printSolution(int board[][])
  {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++)
        System.out.print(" " + board[i][j]
            + " ");
      System.out.println();
    }
  }
  public static boolean isSafe(int board[][], int row, int col, int N)
  {
    int i, j;

    /* Check this row on left side */
    for (i = 0; i < col; i++)
      if (board[row][i] == 1)
        return false;

    /* Check upper diagonal on left side */
    for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
      if (board[i][j] == 1)
        return false;

    /* Check lower diagonal on left side */
    for (i = row, j = col; j >= 0 && i < N; i++, j--)
      if (board[i][j] == 1)
        return false;

    return true;
  }

  private static void displayBoard(int[][] board) {
    for(int[] row:board){
      System.out.println(Arrays.toString(row));
    }
  }
}
