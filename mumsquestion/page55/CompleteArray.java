package com.mumsquestion.page55;

/*
An array is called complete if it contains an even element, a perfect square and two different elements that sum to 8. For example, {3, 2, 9, 5} is
complete because 2 is even, 9 is a perfect square and a[0] + a[3] = 8.
Write a function named isComplete that accepts an integer array and returns 1 if it is a complete array, otherwise it returns 0. Your method must be
efficient. It must return as soon as it is known that the array is complete. Hint: reuse the method you wrote for question 1.
If you are programming in Java or C#, the function signature is
int isComplete(int[ ] a)

 */

public class CompleteArray {
    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{ 3 , 2 , 9 , 5 }));
        System.out.println(isComplete(new int[]{ 36 , -28 }));
        System.out.println(isComplete(new int[]{ 36 , 28 }));
        System.out.println(isComplete(new int[]{ 4 }));
        System.out.println(isComplete(new int[]{ 3 , 2 , 1 , 1 , 5 , 6 }));
        System.out.println(isComplete(new int[]{ 3 , 7 , 23 , 13 , 107 , -99 , 97 , 81 }));
    }

    public static int isComplete(int[] array) {

        if (isElementEven(array) && isElementPerfectSquare(array)) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == 8) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    private static boolean isElementEven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isElementPerfectSquare(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j * j <= a[i]; j++) {
                if (j * j == a[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
