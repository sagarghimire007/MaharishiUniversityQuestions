package com.mumsquestion.page41;

/*
Write a function named largestDifferenceOfEvens which returns the largest difference between even valued elements of its array argument.
For example largestDifferenceOfEvens(new int[ ]{-2, 3, 4, 9}) returns 6 = (4 - (-2)). If there are fewer than 2 even numbers in the array,
largestDifferenceOfEvens should return -1.

If you are programming in Java or C#, the function signature is
int largestDifferenceOfEvens(int[ ] a)

 */

public class LargestDifferenceOfEvens {
    public static void main(String[] args) {

        System.out.println(largestNumberOfEvens(new int[]{ -2 , 3 , 4 , 9 }));
        System.out.println(largestNumberOfEvens(new int[]{ 1 , 3 , 5 , 9 }));
        System.out.println(largestNumberOfEvens(new int[]{ 1 , 18 , 5 , 7 , 33 }));
        System.out.println(largestNumberOfEvens(new int[]{ 2 , 2 , 2 , 2 }));
        System.out.println(largestNumberOfEvens(new int[]{ 1 , 2 , 1 , 2 , 1 , 4 , 1 , 6 , 4 }));
    }

    public static int largestNumberOfEvens(int[] a) {

        int max = 0;
        int difference = 0;

        if (hasFewerNumberOfEvens(a)) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    continue;
                }
                for (int j = 0; j < a.length; j++) {
                    if (i == j || a[j] % 2 != 0) {
                        continue;
                    }

                    difference = a[i] - a[j];
                    if (difference >= max) {
                        max = difference;
                    }
                }
            }
            return max;
        }
        return -1;
    }

    public static boolean hasFewerNumberOfEvens(int[] a) {
        int countEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                countEven++;
            }
        }
        return countEven >= 2;
    }
}
