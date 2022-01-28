package com.mumsquestion.page44;

/*

The Fibonacci sequence of numbers is 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The first and second numbers are 1 and after
that ni = ni-2 + ni-1, e.g., 34 = 13 + 21. Write a method with signature int isFibonacci(int n) which returns 1 if its argument is a number in
the Fibonacci sequence, otherwise it returns 0. For example, isFibonacci(13) returns a 1 and isFibonacci(27) returns a 0. Your solution must not use
recursion because unless you cache the Fibonacci numbers as you find them, the recursive solution recomputes the same Fibonacci number many times.
The Fibonacci sequence of numbers is 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The first and second numbers are 1 and after that
ni = ni-2 + ni-1, e.g., 34 = 13 + 21. Write a method with signature int isFibonacci(int n) which returns 1 if its argument is a number in the
Fibonacci sequence, otherwise it returns 0. For example, isFibonacci(13) returns a 1 and isFibonacci(27) returns a 0. Your solution must not use
recursion because unless you cache the Fibonacci numbers as you find them, the recursive solution recomputes the same Fibonacci number many times.

 */

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println(isFibonacci(22));
    }

    public static int isFibonacci(int n) {
        
        int fib1 = 1, fib2 = 1, fib3 = 1;
        while (fib3 <= n) {
            fib2 = fib1;
            fib1 = fib3;
            fib3 = fib1 + fib2;
            if (fib3 == n) {
                return 1;
            }
        }
        return 0;
    }
}
