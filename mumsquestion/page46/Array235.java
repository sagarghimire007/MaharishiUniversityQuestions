package com.mumsquestion.page46;

/*
An array is defined to be a 235 array if the number of elements divisible by 2 plus the number of elements divisible by 3 plus the number of
elements divisible by 5 plus the number of elements not divisible by 2, 3, or 5 is equal to the number of elements of the array. Write a method
named is123Array that returns 1 if its array argument is a 235 array, otherwise it returns 0.

If you are writing in Java or C#, the function signature is
int is235Array(int[ ] a)

If you are writing in C or C++, the function signature is
int is235Array(int a[ ], int len) where len is the length of a

Hint: remember that a number can be divisible by more than one number

Examples

In the following: <a, b, c, d> means that the array has a elements that are divisible by 2, b elements that are divisible by 3, c elements that
are divisible by 5 and d elements that are not divisible by 2, 3, or 5.

 */

public class Array235 {
    public static void main(String[] args) {

        System.out.println(is123Array(new int[]{ 2 , 3 , 5 , 7 , 11 }));
        System.out.println(is123Array(new int[]{ 2 , 3 , 6 , 7 , 11 }));
        System.out.println(is123Array(new int[]{ 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 }));
        System.out.println(is123Array(new int[]{ 2 , 4 , 8 , 16 , 32 }));
        System.out.println(is123Array(new int[]{ 3 , 9 , 27 , 7 , 1 , 1 , 1 , 1 , 1 }));
        System.out.println(is123Array(new int[]{ 7 , 11 , 77 , 49 }));
        System.out.println(is123Array(new int[]{ 2 }));
        System.out.println(is123Array(new int[]{}));
        System.out.println(is123Array(new int[]{ 7 , 2 , 7 , 2 , 7 , 2 , 7 , 2 , 3 , 7 , 7 }));
    }

    public static int is123Array(int[] a) {
        int twoCount = 0;
        int threeCount = 0;
        int fiveCount = 0;
        int noCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                twoCount++;
            }
            if (a[i] % 3 == 0) {
                threeCount++;
            }
            if (a[i] % 5 == 0) {
                fiveCount++;
            }
            if ((a[i] % 2 != 0) && (a[i] % 3 != 0) && (a[i] % 5 != 0)) {
                noCount++;
            }
        }

        if (twoCount + threeCount + fiveCount + noCount == a.length) {
            return 1;
        }
        return 0;
    }
}
