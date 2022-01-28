package com.mumsquestion.page25;

/*
Define an array to be a 121 array if all its elements are either 1 or 2 and it begins with one or more 1s followed by a one or more 2s and then
ends with the same number of 1s that it begins with. Write a method named is121Array that returns 1 if its array argument is a 121 array, otherwise,
it returns 0.

If you are programming in Java or C#, the function signature is
int is121Array(int[ ] a)

If you are programming in C or C++, the function signature is
int is121Array(int a[ ], int len) where len is the number of elements in the array a.

 */

public class Is121Array {
    public static void main(String[] args) {
        System.out.println("Result 1 : " + is121Array(new int[]{ 1 , 2 , 1 }));
        System.out.println("Result 1 : " + is121Array(new int[]{ 1 , 2 }));
        System.out.println("Result 2 : " + is121Array(new int[]{ 1 , 1 , 2 , 2 , 2 , 1 , 1 }));
        System.out.println("Result 3 : " + is121Array(new int[]{ 1 , 1 , 2 , 2 , 2 , 1 , 1 , 1 }));
        System.out.println("Result 4 : " + is121Array(new int[]{ 1 , 1 , 1 , 2 , 2 , 2 , 1 , 1 , 1 , 3 }));
        System.out.println("Result 5 : " + is121Array(new int[]{ 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 }));
        System.out.println("Result 6 : " + is121Array(new int[]{ 2 , 2 , 2 , 1 , 1 , 1 , 2 , 2 , 2 , 1 , 1 }));
        System.out.println("Result 7 : " + is121Array(new int[]{ 1 , 1 , 1 , 2 , 2 , 2 , 1 , 1 , 2 , 2 }));
        System.out.println("Result 8 : " + is121Array(new int[]{ 2 , 2 , 2 }));
        System.out.println("Result 9 : " + is121Array(new int[]{ 1 , 1 , 2 , 1 , 2 , 1 , 1 }));
        System.out.println("Result 10 : " + is121Array(new int[]{ 1 , 1 , 2 , 2 , 1 , 1 , 2 , 2 , 1 , 1 }));

    }

    public static int is121Array(int[] a) {

        if (a.length <= 2) {
            return 0;
        }
        if (a[0] != 1 || a[a.length - 1] != 1) {
            return 0;
        }

        if (isValid121Array(a) && check1sElement(a)) {
            return 1;
        }
        return 0;
    }

    public static boolean isValid121Array(int[] a) {

        // check whether first element and last element of an array is 1 or not... if not return 0
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 2 || a[i] < 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean check1sElement(int[] a) {

        int count1 = 0, count2 = 0;
        int index1 = 0, index2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count1++;
            } else {
                index1 = i;
                break;
            }
        }

        for (int i = index1; i < a.length; i++) {
            if (a[index1] != 2) {
                return false;
            }
            if (a[i] != 2) {
                index2 = i;
                break;
            }
        }

        for (int i = index2; i < a.length; i++) {
            if (a[i] == 1) {
                count2++;
            }
            if (count2 == a.length - index2) {
                if (count1 == count2) {
                    return true;
                }
            }
        }
        return false;
    }
}
