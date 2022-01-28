package com.mumsquestion.page57;

import java.util.ArrayList;
import java.util.List;

/*
Write a function named hasNValues which takes an array and an integer n as arguments. It returns true if all the elements of the array are one of
n different values.
If you are writing in Java or C#, the function signature is
int hasNValues(int[ ] a, int n)
If you are writing in C or C++, the function signature is
int hasNValues(int a[ ], int n, int len) where len is the length of a

Hint: There are many ways to solve this problem. One way is to allocate an array of n integers and add each unique element found in the array
parameter to it. If you add n elements to the array, return 1, otherwise return 0.

 */

public class HasNValues {
    public static void main(String[] args) {

        System.out.println(hasNValues(new int[]{ 1 , 2 , 2 , 1 } , 2));
        System.out.println(hasNValues(new int[]{ 1 , 1 , 1 , 8 , 1 , 1 , 1 , 3 , 3 } , 3));
        System.out.println(hasNValues(new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 } , 10));
        System.out.println(hasNValues(new int[]{ 1 , 2 , 2 , 1 } , 3));
        System.out.println(hasNValues(new int[]{ 1 , 1 , 1 , 8 , 1 , 1 , 1 , 3 , 3 } , 2));
        System.out.println(hasNValues(new int[]{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 } , 20));
        System.out.println(hasNValues(new int[]{ 1 , 2 , 2 , 1 } , 2));
        System.out.println(hasNValues(new int[]{ 1 , 2 , 2 , 1 } , 2));
        System.out.println(hasNValues(new int[]{ 1 , 2 , 2 , 1 } , 2));
    }

    public static int hasNValues(int[] array , int n) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (list.size() == 0) {
                list.add(array[i]);
            } else {
                if (!isElementAlreadyPresent(list , array[i])) {
                    list.add(array[i]);
                }
            }
        }

        if (list.size() == n) {
            return 1;
        }
        return 0;
    }

    private static boolean isElementAlreadyPresent(List<Integer> list , int element) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                return true;
            }
        }
        return false;
    }
}
