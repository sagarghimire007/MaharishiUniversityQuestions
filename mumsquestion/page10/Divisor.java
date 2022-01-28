package com.mumsquestion.page10;

/*
Write a method named isDivisible that takes an integer array and a divisor and returns 1 if all its elements are divided by the divisor with no
remainder. Other-wise it returns 0.

If you are programming in Java or C#, the function signature is
    int isDivisible(int [  ] a, int divisor)

If you are programming in C or C++, the function signature is
    int isDivisible(int a[ ], int len, int divisor) where len is the number of elements in the array.

 */

public class Divisor {
    public static void main(String[] args) {

        System.out.println("Result 1 : " + isDivisible(new int[]{ 3 , 3 , 6 , 36 } , 3));
        System.out.println("Result 2 : " + isDivisible(new int[]{ 4 } , 2));
        System.out.println("Result 3 : " + isDivisible(new int[]{ 3 , 4 , 3 , 6 , 36 } , 3));
        System.out.println("Result 4 : " + isDivisible(new int[]{ 6 , 12 , 24 , 36 } , 12));
        System.out.println("Result 5 : " + isDivisible(new int[]{} , 3));
        System.out.println("Result 6 : " + isDivisible(new int[]{ 0 } , 3)); // if any number divides 0 gives the remainder is 0...
    }

    public static int isDivisible(int[] a , int divisor) {

        if (a.length < 1) {
            return 1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % divisor != 0) {
                return 0;
            }
        }
        return 1;
    }
}
