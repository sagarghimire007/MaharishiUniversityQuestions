package com.mumsquestion.page52;

/*
Define an array to be a 121 array if all elements are either 1 or 2 and the array begins with one or more 1s followed by a one or more 2s and
then ends with the same number of 1s that it begins   with. Write a method named is121Array that returns 1 if its array argument is a 121  array,
otherwise, it returns 0.

If you are programming in Java or C#, the function signature is
int is121Array(int[ ] a)
If you are programming in C or C++, the function signature is
int is121Array(int a[ ], int len) where len is the number of elements in the array a.

 */

public class Array121 {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{ 1 , 2 , 1 }));
        System.out.println(is121Array(new int[]{ 1 , 1 , 2 , 2 , 2 , 1 , 1 }));
        System.out.println(is121Array(new int[]{ 1 , 1 , 2 , 2 , 2 , 1 , 1 , 1 }));
        System.out.println(is121Array(new int[]{ 1 , 1 , 1 , 2 , 2 , 2 , 1 , 1 }));
        System.out.println(is121Array(new int[]{ 1 , 1 , 1 , 2 , 2 , 2 , 1 , 1 , 1 , 3 }));
        System.out.println(is121Array(new int[]{}));
        System.out.println(is121Array(new int[]{ 2 , 2 , 2 , 1 , 1 , 1 , 2 , 2 , 2 , 1 , 1 , 1 }));
        System.out.println(is121Array(new int[]{ 1 , 1 , 1 , 2 , 2 , 2 , 1 , 1 , 1 , 2 , 2 }));
        System.out.println(is121Array(new int[]{ 2 , 2 , 2 }));
        System.out.println(is121Array(new int[]{ 1 , 1 , 2 , 2 , 1 , 1 , 2 , 2 , 1 , 1 }));
    }

    public static int is121Array(int[] array) {

        if (array.length < 1 || array[0] != 1 || array[array.length - 1] != 1) {
            return 0;
        }
        if (areArrayElementsOf1And2Only(array) && checkIsArray121(array)) {
            return 1;
        }
        return 0;
    }

    private static boolean areArrayElementsOf1And2Only(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 2) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIsArray121(int[] array) {

        int count1 = 0, count2 = 0;
        int index1 = 0, index2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count1++;
            } else {
                index1 = i;
                break;
            }
        }

        for (int i = index1; i < array.length; i++) {
            if (array[i] == 1) {
                index2 = i;
                break;
            }
        }

        for (int i = index2; i < array.length; i++) {
            if (array[i] == 1) {
                count2++;
            }
            if (count2 == array.length - index2) {
                if (count1 == count2) {
                    return true;
                }
            }
        }
        return false;
    }
}
