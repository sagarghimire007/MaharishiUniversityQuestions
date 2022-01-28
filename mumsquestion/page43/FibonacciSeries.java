package com.mumsquestion.page43;

/*

The Fibonacci sequence of numbers is 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The first and second numbers are 1 and after that
ni = ni-2 + ni-1, e.g., 34 = 13 + 21. A number in the sequence is called a Fibonacci number. Write a method with signature int
closestFibonacci(int n) which returns the largest Fibonacci number that is less than or equal to its argument. For example,
closestFibonacci(13) returns 8 because 8 is the largest Fibonacci number less than 13 and closestFibonacci(33) returns 21 because 21 is the
largest Fibonacci number that is <= 33. closestFibonacci(34) should return 34. If the argument is less than 1 return 0. Your solution must
not use recursion because unless you cache the Fibonacci numbers as you find them, the recursive solution recomputes the same Fibonacci
number many times.

 */

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(closestFibonacci(1));
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
    }

    public static int closestFibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        int fib1 = 1, fib2 = 1;
        int fib3 = 1;
        while (fib3 < n) {
            fib2 = fib1;
            fib1 = fib3;
            if (fib1 + fib2 > n) {
                break;
            }
            fib3 = fib1 + fib2;
        }
        return fib3;
    }
}
