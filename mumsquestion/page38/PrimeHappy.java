package com.mumsquestion.page38;

/*

A number n is called prime happy if there is at least one prime less than n and the sum of all primes less than n is evenly divisible by n.

Recall that a prime number is an integer > 1 which has only two integer factors, 1 and itself

 */

public class PrimeHappy {

    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));
        System.out.println(isPrimeHappy(3));

    }

    public static int isPrimeHappy(int n) {

        if (n <= 3) {
            return 0;
        }
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        if (sum % n == 0) {
            return 1;
        }
        return 0;
    }

    public static boolean isPrime(int i) {

        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
