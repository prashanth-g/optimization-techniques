package com.prashanth.os.optimization;

public class DynamicProgramming {

  public static void main(String[] args) {
    int n = 5;

    System.out.println(fibonacciWithOutMemoization(n));

    System.out.println(fibonacciWithMemoization(n, new int[n+1]));
  }

  private static int fibonacciWithOutMemoization(int n) {
    int result = 0;
    if(n == 1 || n == 2) {
      result = 1;
    } else {
      result = fibonacciWithOutMemoization(n-1) + fibonacciWithOutMemoization(n - 2);
    }
    System.out.println("called...");
    return result;
  }

  private static int fibonacciWithMemoization(int n, int[] memo) {
    if(memo[n] != 0) {
      return memo[n];
    }

    int result = 0;
    if(n == 1 || n == 2) {
      result = 1;
    } else {
      result = fibonacciWithMemoization(n-1, memo) + fibonacciWithMemoization(n - 2, memo);
    }

    memo[n] = result;
    System.out.println("called...");
    return result;
  }
}
