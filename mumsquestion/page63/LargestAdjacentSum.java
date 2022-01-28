package com.mumsquestion.page63;

/*

Write a function named largestAdjacentSum that iterates through an array computing the sum of adjacent elements and returning the largest such sum.
You may assume that the array has at least 2 elements.

 */
public class LargestAdjacentSum {

    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{ 1 , 2 , 3 , 4 }));
        System.out.println(largestAdjacentSum(new int[]{ 18 , -12 , 9 , -10 }));
        System.out.println(largestAdjacentSum(new int[]{ 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 }));
        System.out.println(largestAdjacentSum(new int[]{ 1 , 1 , 1 , 1 , 1 , 2 , 1 , 1 , 1 }));
    }

    public static int largestAdjacentSum(int[] a) {

        if (a.length < 2) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] + a[i + 1]) > max) {
                max = a[i] + a[i + 1];
            }
        }
        return max;
    }
}
