package com.mumsquestion.page13;

/*
Write a function that will return 1 if all its elements are non-zeros. Other-wise it returns 0.

If you are programming in Java or C# the function signature is :
    int arrayHasNoZeros(int[] a).
 */

public class ArraysWithNoZeros {
    public static void main(String[] args) {
        System.out.println("Result 1 : " + arrayHasNoZeroes(new int[]{ 1 , 2 , 3 }));
        System.out.println("Result 2 : " + arrayHasNoZeroes(new int[]{ 1 , 0 , 4 , 0 }));
        System.out.println("Result 3 : " + arrayHasNoZeroes(new int[]{ 1 , 2 , 3 , 0 }));
        System.out.println("Result 4 : " + arrayHasNoZeroes(new int[]{ 0 , 0 , 0 , 0 }));
        System.out.println("Result 5 : " + arrayHasNoZeroes(new int[]{ -5 }));
        System.out.println("Result 6 : " + arrayHasNoZeroes(new int[]{}));
    }

    public static int arrayHasNoZeroes(int[] a) {
        if (a.length < 1) {
            return 1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                return 0;
            }
        }
        return 1;
    }
}
