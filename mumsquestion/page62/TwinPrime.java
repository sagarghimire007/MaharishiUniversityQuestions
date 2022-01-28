package com.mumsquestion.page62;

/*

A twin prime is a prime number that differs from another prime number by 2. Write a function named isTwinPrime with an integer parameter that returns
1 if the parameter is a twin prime, otherwise it returns 0. Recall that a prime number is a number with no factors other than 1 and itself.

 */

public class TwinPrime {
    public static void main(String[] args) {
        System.out.println(isTwinPrime(5));
        System.out.println(isTwinPrime(7));
        System.out.println(isTwinPrime(53));
        System.out.println(isTwinPrime(9));
    }

    public static int isTwinPrime(int n) {

        if (n < 2) {
            return 0;
        }
        if (isPrime(n)) {
            if (isPrime(n + 2) || isPrime(n - 2)) {
                return 1;
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

