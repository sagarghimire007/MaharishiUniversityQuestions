package com.mumsquestion.page51;

/*
Define an array to be n-primeable if for a given n, all elements of the array when incremented by n are prime.
Recall that a prime number is a number that has no factors except 1 and itself. Write a method named isNPrimeable that has an array parameter
and an integer parameter that defines n; the method returns 1 if its array parameter is n-primeable; otherwise it returns 0.
 */

public class NPrimeable {
    public static void main(String[] args) {

        System.out.println(isNPrimeable(new int[]{ 2 , 4 , 27 } , 2));
        System.out.println(isNPrimeable(new int[]{ 5 , 15 , 27 } , 2));
        System.out.println(isNPrimeable(new int[]{ 13 , 15 , 27 } , 2));
        System.out.println(isNPrimeable(new int[]{ 5 , 15 , 27 } , 3));
        System.out.println(isNPrimeable(new int[]{ 5 , 15 , 26 } , 2));
        System.out.println(isNPrimeable(new int[]{ 1 } , 4));
        System.out.println(isNPrimeable(new int[]{} , 2));

    }

    public static int isNPrimeable(int[] a , int n) {

        if (n < 1) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {

            if (isNotPrime(a[i] + n)) {
                return 0;
            }
        }
        return 1;
    }

    private static boolean isNotPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}
