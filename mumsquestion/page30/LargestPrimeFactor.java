package com.mumsquestion.page30;

/*

Write a function named largestPrimeFactor that will return the largest prime factor of a number. If the number is <=1 it should return 0.
Recall that a prime number is a number > 1 that is divisible only by 1 and itself, e.g., 13 is prime but 14 is not.

 */

public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
        System.out.println(largestPrimeFactor(3));
        System.out.println(largestPrimeFactor(13));
        System.out.println(largestPrimeFactor(29));

    }

    public static int largestPrimeFactor(int n) {

        if (n <= 1) {
            return 0;
        }
        int largestPrimeNumber = 2;
        for (int i = 2; i <= n / 2; i++) {
            if (checkIsPrimeNumber(i) && (n % i == 0)) {
                if (i >= largestPrimeNumber) {
                    largestPrimeNumber = i;
                }
            } else {
                return n;
            }
        }
        return largestPrimeNumber;
    }

    public static boolean checkIsPrimeNumber(int i) {

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
