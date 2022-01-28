package com.mumsquestion.page61;

/*
An array is said to be hollow if it contains 3 or more zeros in the middle that are preceded and followed by the same number of non-zero elements.
Furthermore, all the zeroes in the array must be in the middle of the array. Write a function named isHollow that accepts an integer array and
returns 1 if it is a hollow array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isHollow(int[ ] a)
If you are programming in C or C++, the function signature is
int isHollow(int a[ ], int len) where len is the number of elements in the array

Hint: Write three loops. The first counts the number of preceding non-zeros. The second counts the number of zeros in the middle. The third counts
the number of following non-zeros. Then analyze the results.

 */

public class HollowArray {
    public static void main(String[] args) {

        System.out.println(isHollow(new int[]{ 1 , 1 , 1 , 0 , 0 , 0 , 1 , 1 , 1 }));
        System.out.println(isHollow(new int[]{ 1 , 1 , 1 , 0 , 0 , 0 , 1 , 1 , 0 , 0 , 0 , 1 , 1 }));
        System.out.println(isHollow(new int[]{ 1 , 2 , 0 , 0 , 0 , 3 , 4 }));
        System.out.println(isHollow(new int[]{ 1 , 1 , 1 , 1 , 0 , 0 , 0 , 0 , 0 , 2 , 1 , 2 , 18 }));
        System.out.println(isHollow(new int[]{ 1 , 2 , 0 , 0 , 3 , 4 }));
        System.out.println(isHollow(new int[]{ 1 , 2 , 0 , 0 , 0 , 3 , 4 , 5 }));
        System.out.println(isHollow(new int[]{ 3 , 8 , 3 , 0 , 0 , 0 , 3 , 3 }));
        System.out.println(isHollow(new int[]{ 1 , 2 , 0 , 0 , 0 , 3 , 4 , 0 }));
        System.out.println(isHollow(new int[]{ 0 , 1 , 2 , 0 , 0 , 0 , 3 , 4 }));
        System.out.println(isHollow(new int[]{ 0 , 0 , 0 }));

    }

    public static int isHollow(int[] a) {

        if (a.length < 1) {
            return 0;
        }

        int count0 = 0;
        int countNonZero1 = 0, countNonZero2 = 0;
        int index1 = 0, index2 = 0;

        // counting the number of preceding non-zeros
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                countNonZero1++;
                continue;
            }
            if (a[i] == 0) {
                index1 = i;
                break;
            }
        }

        // counts the number of zeros in the middle
        for (int i = index1; i < a.length; i++) {
            if (a[i] == 0) {
                count0++;
                if (i == a.length - 1 && count0 >= 3) {
                    return 1;
                }
                continue;
            } else {
                index2 = i;
                break;
            }
        }

        // counts the number of following non-zeros
        for (int i = index2; i < a.length; i++) {

            if (count0 < 3) {
                return 0;
            }
            if (a[i] != 0) {
                countNonZero2++;
                continue;
            }
        }

        if (index1 == a.length - index2) {
            if (countNonZero1 == countNonZero2) {
                return 1;
            }
        }
        return 0;
    }
}
