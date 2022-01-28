package com.mumsquestion.page33;

/*

Define the n-based integer rounding of an integer k to be the nearest multiple of n to k. If two multiples of n are equidistant use the greater one. For example

the 4-based rounding of 5 is 4 because 5 is closer to 4 than it is to 8,
the 5-based rounding of 5 is 5 because 5 is closer to 5 that it is to 10,
the 4-based rounding of 6 is 8 because 6 is equidistant from 4 and 8, so the greater one is used,
the 13-based rounding of 9 is 13, because 9 is closer to 13 than it is to 0,

Write a function named doIntegerBasedRounding that takes an integer array and rounds all its positive elements using n-based integer rounding.

A negative element of the array is not modified and if n <=0, no elements of the array are modified.  Finally you may assume that the array has at least two elements.

Hint: In integer arithmetic,  (6/4) * 4 = 4

If you are programming in Java or C#, the function signature is
void doIntegerBasedRounding(int[ ] a, int n) where n is used to do the rounding

 */

import java.util.Arrays;

public class IntegerBasedRounding {
    public static void main(String[] args) {

        doIntegerBasedRounding(new int[]{ 1 , 2 , 3 , 4 , 5 } , 2);
        doIntegerBasedRounding(new int[]{ 1 , 2 , 3 , 4 , 5 } , 3);
        doIntegerBasedRounding(new int[]{ 1 , 2 , 3 , 4 , 5 } , -3);
        doIntegerBasedRounding(new int[]{ -1 , -2 , -3 , -4 , -5 } , 3);
        doIntegerBasedRounding(new int[]{ -18 , 1 , 2 , 3 , 4 , 5 } , 4);
        doIntegerBasedRounding(new int[]{ 1 , 2 , 3 , 4 , 5 } , 5);
        doIntegerBasedRounding(new int[]{ 1 , 2 , 3 , 4 , 5 } , 100);
    }

    public static void doIntegerBasedRounding(int[] a , int n) {

        if (n <= 0) {
            System.out.println(Arrays.toString(a));
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                int lowerBound = (a[i] / n * n);
                int upperBound = lowerBound + n;
                int middleElement = n % 2 == 0 ? lowerBound + n / 2 : lowerBound + n / 2 + 1;
                if (a[i] >= middleElement) {
                    a[i] = upperBound;
                } else {
                    a[i] = lowerBound;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
