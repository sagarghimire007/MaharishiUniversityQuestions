package com.mumsquestion.page2;

/*
Madhav array has following property :
a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] =.....
The length of a madhav array must be n*(n+1)/2 for some n.

Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array, otherwise it returns 0. If you are programming in Java or C# the function signature is
   int isMadhavArray(int[ ] a)

If you are programming in C or C++, the function signature is
   int isMadhavArray(int a[ ], int len) where len is the number of elements in a.

 */

public class MadhavArray {
    public static void main(String[] args) {

        System.out.println("Result 1 : " + isMadhavArray(new int[]{ 2 , 1 , 1 }));
        System.out.println("Result 2 : " + isMadhavArray(new int[]{ 2 , 1 , 1 , 4 , -1 , -1 }));
        System.out.println("Result 3 : " + isMadhavArray(new int[]{ 6 , 2 , 4 , 2 , 2 , 2 , 1 , 5 , 0 , 0 }));
        System.out.println("Result 4 : " + isMadhavArray(new int[]{ 18 , 9 , 10 , 6 , 6 , 6 }));
        System.out.println("Result 5 : " + isMadhavArray(new int[]{ -6 , -3 , -3 , 8 , -5 , -4 }));
        System.out.println("Result 6 : " + isMadhavArray(new int[]{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 1 , 1 , 1 , -2 , -1 }));
        System.out.println("Result 7 : " + isMadhavArray(new int[]{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 1 , 1 , 1 , -2 , -1 , 5 })); // size = 16
        // which is not equals to  n*(n+1)/2 for some n. so returns 0
        System.out.println("Result 8 : " + isMadhavArray(new int[]{ 3 , 1 , 2 , 3 , 0 }));

    }

    public static int isMadhavArray(int[] array) {
        int value = array.length, equation;
        boolean isExpression = false, isValue = false;

        for (int n = 0; n < value; n++) {
            equation = n * (n + 1) / 2;
            if (value == equation) {
                isExpression = true;
                break;
            }
        }

        if (isExpression) {
            int x = 1, y = 3, c = 0, sum = 0;
            do {
                for (int i = x, j = y; i < j; i++) {
                    sum += array[i];
                }
                if (array[0] == sum) {
                    isValue = true;
                    sum = 0;
                } else {
                    isValue = false;
                    break;
                }
                c++;
                x = y;
                y = x + c + 2;
            } while (x < array.length);
        }

        if (isValue) {
            return 1;
        }
        return 0;
    }
}
