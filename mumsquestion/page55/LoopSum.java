package com.mumsquestion.page55;

/*
Write a function that takes two arguments, an array of integers and a positive, non-zero number n. It sums n elements of the array starting at the
beginning of the array. If n is greater than the number of elements in the array, the function loops back to the beginning of the array and continues
summing until it has summed n elements. You may assume that the array contains at least one element and that n is greater than 0.

If you are programming in Java or C#, the function signature is
int loopSum(int[ ] a, int n)
If you are programming in C or C++, the function signature is
int loopSum(int a[ ], int len, int n) where len is the number of elements in the array

 */

public class LoopSum {
    public static void main(String[] args) {

        System.out.println(loopSum(new int[]{ 1 , 2 , 3 } , 2));
        System.out.println(loopSum(new int[]{ -1 , 2 , -1 } , 7));
        System.out.println(loopSum(new int[]{ 1 , 4 , 5 , 6 } , 4));
        System.out.println(loopSum(new int[]{ 3 } , 10));
    }

    public static int loopSum(int[] a , int n) {

        if (n < 1) {
            return 0;
        }
        int sum = 0, k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += a[j];
                k++;
                if (k == n) {
                    return sum;
                }
            }
        }
        return 0;
    }
}
