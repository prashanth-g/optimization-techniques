package com.prashanth.os.optimization;

public class BottomUp {

  public static void main(String[] args) {
    int n = 6;

    System.out.println(fibonacciBottomUp(n));
  }

  private static int fibonacciBottomUp(int n) {
    if(n == 1 || n == 2) {
      return 1;
    }

    int bottomUp[] = new int[n + 1];
    bottomUp[1] = 1;
    bottomUp[2] = 1;
    for (int i = 3; i <= n; i++) {
      bottomUp[i] = bottomUp[i - 1] + bottomUp[i - 2];
    }

    return bottomUp[n];
  }
}
