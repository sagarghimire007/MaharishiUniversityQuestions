package com.mumsquestion.page40;

/*
A positive, non-zero number n is a factorial prime if it is equal to factorial(n) + 1 for some n and it is prime. Recall that factorial(n)
is equal to 1 * 2 * ... * n-1 * n. If you understand recursion, the recursive definition is
factorial(1) = 1;

factorial(n) = n*factorial(n-1).
For example, factorial(5) = 1*2*3*4*5 = 120.

Recall that a prime number is a natural number which has exactly two distinct natural number divisors: 1 and itself.

Write a method named isFactorialPrime which returns 1 if its argument is a factorial prime number, otherwise it returns 0.

 */

public class FactorialPrime {
    public static void main(String[] args) {
        System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
        System.out.println(isFactorialPrime(721));
    }

    public static int isFactorialPrime(int n) {

        if (n < 2) {
            return 0;
        }

        if (isPrime(n)) {
            int factorial = 1;

            for (int i = 1; i < n; i++) {
                factorial = factorial * i;
                if (factorial + 1 == n) {
                    return 1;
                }
            }
        }
        return 0;
    }

    private static boolean isPrime(int n) {

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
