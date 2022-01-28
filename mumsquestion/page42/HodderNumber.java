package com.mumsquestion.page42;

/*

A hodder number is one that is prime and is equal to 2j-1 for some j. For example, 31 is a hodder number because 31 is prime and is equal to 25-1 (in this case j = 5). The first 4 hodder numbers are 3, 7, 31, 127
Write a function with signature int isHodder(int n) that returns 1 if n is a hodder number, otherwise it returns 0.
Recall that a prime number is a whole number greater than 1 that has only two whole number factors, itself and 1.

 */

public class HodderNumber {

    public static void main(String[] args) {
        System.out.println(isHodderNumber(3));
        System.out.println(isHodderNumber(7));
        System.out.println(isHodderNumber(31));
        System.out.println(isHodderNumber(127));
    }

    public static int isHodderNumber(int n) {

        if (n < 3) {
            return 0;
        }
        if (checkPrimeNumber(n)) {
            int j = 2;
            boolean isHodderNumber = false;
            while (!isHodderNumber) {
                int hodderNumber = (int) Math.pow(2 , j) - 1;
                if (hodderNumber > n) {
                    isHodderNumber = false;
                    break;
                }
                if (hodderNumber == n) {
                    isHodderNumber = true;
                    break;
                }
                j++;
            }
            if (isHodderNumber) {
                return 1;
            }
        }
        return 0;
    }

    // checking whether a number is prime or not
    private static boolean checkPrimeNumber(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
