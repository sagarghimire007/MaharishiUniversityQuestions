package com.mumsquestion.page8;

/*
An array can hold the digits of a number. For example the digits of the number 32053 are stored in the array {3, 2, 0, 5, 3}. Write a method call
repsEqual that takes an array and an integer and returns 1 if the array contains only the digits of the number in the same order that they appear
in the number. Other-wise it returns 0.

If you are programming in Java or C#, the function prototype is
   int repsEqual(int[ ] a, int n)

If you are programming in C++ or C, the function prototype is
   int repsEqual(int a[ ], int len, int n) where len is the number of elements in the array.

 */

public class RepsEqual {
    public static void main(String[] args) {

        System.out.println("Result 1 : " + repsEqual(new int[]{ 3 , 2 , 0 , 5 , 3 } , 32053));
        System.out.println("Result 2 : " + repsEqual(new int[]{ 3 , 2 , 0 , 5 } , 32053));
        System.out.println("Result 3 : " + repsEqual(new int[]{ 3 , 2 , 0 , 5 , 3 , 4 } , 32053));
        System.out.println("Result 4 : " + repsEqual(new int[]{ 2 , 3 , 0 , 5 , 3 } , 32053));
        System.out.println("Result 5 : " + repsEqual(new int[]{ 9 , 3 , 1 , 1 , 2 } , 32053));
        System.out.println("Result 6 : " + repsEqual(new int[]{ 0 , 3 , 2 , 0 , 5 , 3 } , 32053));
        System.out.println("Result 7 : " + repsEqual(new int[]{ 2 , 3 , 4 , 5 } , 345));
        System.out.println("Result 8 : " + repsEqual(new int[]{} , 32053));
        System.out.println("Result 9 : " + repsEqual(new int[]{ 0 , 2 , 3 , 2 , 0 , 5 , 3 } , 32053)); // ignore leading zeroes
    }

    public static int repsEqual(int[] a , int n) {

        if (a.length < 1) {
            return 0;
        }
        int isRepsEqual = 0, checkNumber = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            checkNumber = n % 10;
            n = n / 10;
            if (a[i] != checkNumber) {
                return 0;
            }
        }
        return 1;
    }
}
