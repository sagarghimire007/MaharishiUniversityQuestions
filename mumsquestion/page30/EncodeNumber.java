package com.mumsquestion.page30;

/*

The fundamental theorem of arithmetic states that every natural number greater than 1 can be written as a unique product of prime numbers. 
So, for instance, 6936=2*2*2*3*17*17. Write a method named encodeNumber what will encode a number n as an array that contains the prime numbers 
that, when multiplied together, will equal n. So encodeNumber(6936) would return the array {2, 2, 2, 3, 17, 17}. If the number is <= 1 the function 
should return null; 

If you are programming in Java or C#, the function signature is
int[ ] encodeNumber(int n)

If you are programming in C or C++, the function signature is
int *encodeNumber(int n) and the last element of the returned array is 0. 

Note that if you are programming in Java or C#, the returned array should be big enough to contain the prime factors and no bigger. 
If you are programming in C or C++ you will need one additional element to contain the terminating zero.

Hint: proceed as follows:

1. Compute the total number of prime factors including duplicates. 
2. Allocate an array to hold the prime factors. Do not hard-code the size of the returned array!!
3. Populate the allocated array with the prime factors. The elements of the array when multiplied together should equal the number. 

 */

import java.util.Arrays;

public class EncodeNumber {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(encodeNumber(6936)));
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));

    }

    public static int[] encodeNumber(int n) {

        if (n <= 1) {
            return (new int[]{});
        }

        int size = returnedSizeArray(n);
        int[] resultArray = new int[size];
        int k = 0;
        int number = n;

        for (int i = 2; i <= n / 2; i++) {
            if (checkIsPrimeNumber(i)) {
                while (number % i == 0) {
                    number = number / i;
                    resultArray[k] = i;
                    k++;
                }
            }
        }

        if (!areArrayElementsMultipleEqualsNumber(resultArray , n)) {
            return (new int[]{});
        }
        return resultArray;
    }

    public static boolean checkIsPrimeNumber(int i) {

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    // finding size of an array that might contain the returned array
    private static int returnedSizeArray(int n) {

        int size = 0;
        int number = n;
        for (int i = 2; i <= n / 2; i++) {
            if (checkIsPrimeNumber(i)) {
                while (number % i == 0) {
                    number = number / i;
                    size++;
                }
            }
        }
        return size;
    }

    // The elements of the array when multiplied together should equal the number
    public static boolean areArrayElementsMultipleEqualsNumber(int[] array , int number) {

        int multipleValue = 1;
        for (int i = 0; i < array.length; i++) {
            multipleValue *= array[i];
        }
        if (multipleValue == number) {
            return true;
        }
        return false;
    }
}
