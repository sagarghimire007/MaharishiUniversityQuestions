package com.mumsquestion.page4;

/*
A prime number is an integer that is divisible only by 1 and itself. A porcupine number is a prime number whose last digit is 9 and the next prime
 number that follows it also ends with the digit 9. For example 139 is a porcupine number because:
    a. it is prime
    b. it ends in a 9
    c. The next prime number after it is 149 which also ends in 9. Note that 140, 141, 142, 143, 144, 145, 146, 147 and 148 are not prime so 149
    is the next prime number after 139.

Write a method named findPorcupineNumber which takes an integer argument n and returns the first porcupine number that is greater than n.
So findPorcupineNumber(0) would return 139 (because 139 happens to be the first porcupine number) and so would findPorcupineNumber(138).
But findPorcupineNumber(139) would return 409 which is the second porcupine number.

The function signature is
	int findPorcupineNumber(int n)

You may assume that a porcupine number greater than n exists.
 */

public class PorcupinePrimeNumber {
    public static void main(String[] args) {

        System.out.println(findPorcupineNumber(139));
        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(138));
    }

    public static int findPorcupineNumber(int number) {

        int porcupineNumber = 0;
        boolean isPorcupineNumber = false;
        number++;
        while (number <= Integer.MAX_VALUE) {
            if (isPorcupineNumber) {
                if (isPrime(number)) {
                    if (number % 10 == 9) {
                        break;
                    } else {
                        isPorcupineNumber = false;
                    }
                }
            } else {
                if (isPrime(number)) {
                    if (number % 10 == 9) {
                        isPorcupineNumber = true;
                        porcupineNumber = number;
                    }
                }
            }
            number++;
        }
        return porcupineNumber;
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
