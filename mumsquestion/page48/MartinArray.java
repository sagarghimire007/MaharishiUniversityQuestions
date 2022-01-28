package com.mumsquestion.page48;

/*
Define an array to be a Martian array if the number of 1s is greater than the number of 2s and no two adjacent elements are equal. Write a function
named isMartian that returns 1 if its argument is a Martian array; otherwise it returns 0.

If you are programming in Java or C#, the function signature is
int isMartian(int[ ] a)

If you are programming in C or C++, the function signature is
int isMartian(int a[ ], int len) where len is the number of elements in the array a.

There are two additional requirements.

1. You should return 0 as soon as it is known that the array is not a Martian array; continuing to analyze the array would be a waste of CPU cycles.

2. There should be exactly one loop in your solution.

 */
public class MartinArray {
    public static void main(String[] args) {

        System.out.println(isMartinArray(new int[]{ 1 , 3 }));
        System.out.println(isMartinArray(new int[]{ 1 , 2 , 1 , 2 , 1 , 2 , 1 , 2 , 1 }));
        System.out.println(isMartinArray(new int[]{ 1 , 3 , 2 }));
        System.out.println(isMartinArray(new int[]{ 1 , 3 , 2 , 2 , 1 , 5 , 1 , 5 }));
        System.out.println(isMartinArray(new int[]{ 1 , 2 , -18 , -18 , 1 , 2 }));
        System.out.println(isMartinArray(new int[]{}));
        System.out.println(isMartinArray(new int[]{ 1 }));
        System.out.println(isMartinArray(new int[]{ 2 }));
    }

    public static int isMartinArray(int[] array) {

        if (array.length < 1) {
            return 0;
        }
        int count1 = 0, count2 = 0;
        if (!areElementsAdjacent(array)) {
            for (int i = 0; i < array.length; i++) {

                // counting elements whether its 1s or 2s
                if (array[i] == 1) {
                    count1++;
                }
                if (array[i] == 2) {
                    count2++;
                }
            }
        }

        if (count1 > count2) {
            return 1;
        }
        return 0;
    }

    private static boolean areElementsAdjacent(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
