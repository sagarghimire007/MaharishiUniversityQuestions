package com.mumsquestion.page59;

/*

An array is called layered if its elements are in ascending order and each element appears two or more times. For example,

{1, 1, 2, 2, 2, 3, 3} is layered but {1, 2, 2, 2, 3, 3} and {3, 3, 1, 1, 1, 2, 2} are not. Write a method named isLayered that accepts an integer
array and returns 1 if the array is layered, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isLayered(int[ ] a)
If you are programming in C or C++, the function signature is
int isLayered(int a[ ], int len) where len is the number of elements in the array

 */

public class LayeredArray {
    public static void main(String[] args) {

        System.out.println(isLayered(new int[]{ 1 , 1 , 2 , 2 , 2 , 3 , 3 , 3 }));
        System.out.println(isLayered(new int[]{ 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 }));
        System.out.println(isLayered(new int[]{ 1 , 2 , 2 , 2 , 3 , 3 }));
        System.out.println(isLayered(new int[]{ 2 , 2 , 2 , 3 , 3 , 1 , 1 }));
        System.out.println(isLayered(new int[]{ 2 }));
        System.out.println(isLayered(new int[]{}));
        System.out.println(isLayered(new int[]{ 1 , 1 , 1 , 3 , 3 , 3 , 5 , 5 , 5 , 5 }));
    }

    public static int isLayered(int[] a) {

        if (a.length < 2) {
            return 0;
        }
        int count = 0;
        if (areElementsInAscendingOrder(a) && elementAppearsTwoOrMoreTime(a)) {
            return 1;
        }
        return 0;
    }

    private static boolean areElementsInAscendingOrder(int[] a) {

        int element = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                continue;
            }
            if (a[i] > element) {
                element = a[i];
            }
            if (a[i] < element) {
                return false;
            }
        }
        return true;
    }

    private static boolean elementAppearsTwoOrMoreTime(int[] a) {

        int element = a[0];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                count++;
                continue;
            }
            if (a[i] != element) {
                if (count >= 2) {
                    element = a[i];
                    count = 0;
                    continue;
                }
                return false;
            }
        }

        if (count >= 2) {
            return true;
        }
        return false;
    }
}
