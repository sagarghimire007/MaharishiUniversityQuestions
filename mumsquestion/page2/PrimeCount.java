package com.mumsquestion.page2;
/*
Write a function named primeCount with signature int primeCount(int start, int end);
Function returns the number of primes between start and end inclusive. Recall that a prime is a positive integer greater than 1 whose only integer
factors  are 1 and itself.
 */

public class PrimeCount {
    public static void main(String[] args) {

        System.out.println("Result 1 : " + primeCount(10 , 30));
        System.out.println("Result 2 : " + primeCount(11 , 29));
        System.out.println("Result 3 : " + primeCount(20 , 22));
        System.out.println("Result 4 : " + primeCount(1 , 1));
        System.out.println("Result 5 : " + primeCount(5 , 5));
        System.out.println("Result 6 : " + primeCount(6 , 2));
        System.out.println("Result 7 : " + primeCount(-10 , 6));
        System.out.println("Result 8 : " + primeCount(-2 , 1));
        System.out.println("Result 9 : " + primeCount(2 , 2));
    }

    public static int primeCount(int start , int end) {

        int countPrime = 0;
        if (start == 1 || end == 1) {
            return 0;
        } else if (start > end) {
            return 0;
        } else {
            if (start < 0) {
                countPrime = countPrimeNumber(2 , end);
            } else {
                countPrime = countPrimeNumber(start , end);
            }
        }
        return countPrime;
    }

    // for counting prime number
    public static int countPrimeNumber(int start , int end) {

        int primeCount = 0;
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {

                // if the number is not a prime number found first than break the loop... no need to iterate further
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeCount++;
            }
        }
        return primeCount;
    }
}
