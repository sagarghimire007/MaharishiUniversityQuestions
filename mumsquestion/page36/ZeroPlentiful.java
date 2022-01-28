package com.mumsquestion.page36;

/*

An array is zero-plentiful if it contains at least one 0 and every sequence of 0s is of length at least 4.

Write a method named isZeroPlentiful which returns the number of zero sequences if its array argument is zero-plentiful, otherwise it returns 0.

If you are programming in Java or C#, the function signature is
int isZeroPlentiful(int[ ] a)

If you are programming in C or C++, the function signature is
int isZeroPlentiful(int a[ ], int len) where len is the number of elements in the array a.

 */

public class ZeroPlentiful {
    public static void main(String[] args) {

        System.out.println(zeroPlentiFul(new int[]{ 0 , 0 , 0 , 0 , 0 }));
        System.out.println(zeroPlentiFul(new int[]{ 1 , 2 , 0 , 0 , 0 , 0 , 2 , -18 , 0 , 0 , 0 , 0 , 0 , 12 }));
        System.out.println(zeroPlentiFul(new int[]{ 1 , 0 , 0 , 0 , 0 , 0 , 1 , 0 , 0 , 0 , 0 , 8 , 0 , 0 , 0 , 0 , 0 , 0 }));
        System.out.println(zeroPlentiFul(new int[]{ 1 , 2 , 3 , 4 }));
        System.out.println(zeroPlentiFul(new int[]{ 1 , 0 , 0 , 0 , 2 , 0 , 0 , 0 , 0 }));
        System.out.println(zeroPlentiFul(new int[]{ 0 }));
        System.out.println(zeroPlentiFul(new int[]{}));
    }

    private static int zeroPlentiFul(int[] num) {

        int count0Sequence = 0;
        int count0 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                count0++;
                continue;
            } else {
                if (count0 >= 4) {
                    count0Sequence++;
                    count0 = 0;
                }
            }
        }
        if (count0 >= 4) {
            count0Sequence++;
        }
        return count0Sequence;
    }
}
