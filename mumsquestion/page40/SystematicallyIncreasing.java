package com.mumsquestion.page40;

/*
An array is called systematically increasing if it consists of increasing sequences of the numbers from 1 to n.

The first six (there are over 65,000 of them) systematically increasing arrays are:

	{1}
	{1, 1, 2}
	{1, 1, 2, 1, 2, 3}
	{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
	{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}
	{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}

Write a function named isSystematicallyIncreasing which returns 1 if its array argument is systematically increasing. Otherwise it returns 0.

If you are programming in Java or C#, the function signature is
int isSystematicallyIncreasing(int[ ] a)

 */

public class SystematicallyIncreasing {
    public static void main(String[] args) {

        System.out.println(isSystematicallyIncreasing(new int[]{ 1 }));
        System.out.println(isSystematicallyIncreasing(new int[]{ 1 , 2 , 1 , 2 , 3 }));
        System.out.println(isSystematicallyIncreasing(new int[]{ 1 , 1 , 3 }));
        System.out.println(isSystematicallyIncreasing(new int[]{ 1 , 2 , 1 , 2 , 1 , 2 }));
        System.out.println(isSystematicallyIncreasing(new int[]{ 1 , 2 , 3 , 1 , 2 , 1 }));
        System.out.println(isSystematicallyIncreasing(new int[]{ 1 , 1 , 2 , 3 }));
    }

    private static int isSystematicallyIncreasing(int[] n) {

        int i = 1;
        int iter = 0;
        boolean lengthMatched = false;
        int cond = 0;

        // size check
        while (cond <= n.length) {
            cond = (i * (i + 1)) / 2;
            if (cond == n.length) {
                iter = i;
                lengthMatched = true;
                break;
            }
            i++;
        }

        int[] arr = new int[n.length];
        int l = 0;

        if (lengthMatched) {
            for (int j = 1; j <= iter; j++) {
                for (int k = 1; k <= j; k++) {
                    arr[l] = k;
                    l++;
                }
            }

            for (int q = 0; q < arr.length; q++) {
                if (n[q] != arr[q]) {
                    return 0;
                }
            }
        } else {
            return 0;
        }
        return 1;
    }
}
