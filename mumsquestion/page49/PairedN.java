package com.mumsquestion.page49;

/*
An array is defined to be paired-N if it contains two distinct elements that sum to N for some specified value of N and the indexes of those elements
also sum to N. Write a function named isPairedN that returns 1 if its array parameter is a paired-N array, otherwise it returns 0. The value of N is
passed as the second parameter.
If you are writing in Java or C#, the function signature is
int isPairedN(int[ ] a, int n)

If you are writing in C or C++, the function signature is
int isPairedN(int a[ ], int n, int len) where len is the length of a

There are two additional requirements.

1. Once you know the array is paired-N, you should return 1. No wasted loop iterations please.

2. Do not enter the loop unless you have to. You should test the length of the array and the value of n to determine whether the array could possibly
be a paired-N array. If the tests indicate no, return 0 before entering the loop.

 */

public class PairedN {
    public static void main(String[] args) {
        System.out.println(isPairedN(new int[]{ 1 , 4 , 1 , 4 , 5 , 6 } , 5));
        System.out.println(isPairedN(new int[]{ 1 , 4 , 1 , 4 , 5 , 6 } , 6));
        System.out.println(isPairedN(new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 } , 6));
        System.out.println(isPairedN(new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 } , 1));
        System.out.println(isPairedN(new int[]{ 0 , 1 } , 1));
        System.out.println(isPairedN(new int[]{ 1 , 4 , 1 } , 5));
        System.out.println(isPairedN(new int[]{ 8 , 8 , 8 , 8 , 7 , 7 , 7 } , 15));
        System.out.println(isPairedN(new int[]{ 8 , -8 , 8 , 8 , 7 , 7 , -7 } , -15));
        System.out.println(isPairedN(new int[]{ 3 } , 3));
        System.out.println(isPairedN(new int[]{} , 0));


    }

    public static int isPairedN(int[] a , int n) {
        //
        int k = a.length;
        if (n < 1 || k < 2 || n > (2 * k - 3)) {
            return 0;
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (i + j == n && a[i] + a[j] == n) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
