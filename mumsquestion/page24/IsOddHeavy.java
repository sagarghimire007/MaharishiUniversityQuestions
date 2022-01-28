package com.mumsquestion.page24;

/*

An array is defined to be odd-heavy if it contains at least one odd element and every element whose value is odd is greater than every even-valued
element. So {11, 4, 9, 2, 8} is odd-heavy because the two odd elements (11 and 9) are greater than all the even elements. And {11, 4, 9, 2, 3, 10}
is not odd-heavy because the even element 10 is greater than the odd element 9.

Write a function called isOddHeavy that accepts an integer array and returns 1 if the array is odd-heavy; otherwise it returns 0.

If you are programming in Java or C#, the function signature is int isOddHeavy(int[ ] a)
If you are programming in C or C++, the function signature is int isOddHeavy(int a[ ], int len) where len is the number of elements in the array

 */

public class IsOddHeavy {
    public static void main(String[] args) {

        System.out.println("Result 1 : " + isOddHeavy(new int[]{ 11 , 4 , 9 , 2 , 10 }));
        System.out.println("Result 2 : " + isOddHeavy(new int[]{ 11 , 4 , 9 , 2 , 8 }));
        System.out.println("Result 3 : " + isOddHeavy(new int[]{ 1 }));
        System.out.println("Result 4 : " + isOddHeavy(new int[]{ 2 }));
        System.out.println("Result 5 : " + isOddHeavy(new int[]{ 1 , 1 , 1 , 1 , 1 }));
        System.out.println("Result 6 : " + isOddHeavy(new int[]{ 2 , 4 , 6 , 8 , 11 }));
        System.out.println("Result 7 : " + isOddHeavy(new int[]{ -2 , -4 , -6 , -8 , -11 })); // -8, an even value element greater than -11 an odd
        // value element
        System.out.println("Result 8 : " + isOddHeavy(new int[]{ -2 , -4 , -6 , -8 , -1 })); // -1, an odd value element greater than  all even
        // value element
    }

    public static int isOddHeavy(int[] a) {

        if (a.length < 1) {
            return 0;
        }
        if (hasAtLeast1OddElement(a) && isOddGreaterThanEven(a)) {
            return 1;
        }
        return 0;
    }

    public static boolean hasAtLeast1OddElement(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 2 != 0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isOddGreaterThanEven(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                continue;
            }
            for (int j = 0; j < a.length; j++) {
                if ((a[j] % 2 != 0)) {
                    continue;
                }
                if ((a[i] < a[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
