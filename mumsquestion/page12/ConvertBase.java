package com.mumsquestion.page12;

/*
Using the <array, base> representation for a number described in the second question write a method named convertToBase10 that
converts its <array, base> arguments to a base 10 number if the input is legal for the specified base. If it is not, it returns -1.

Some examples:

convertToBase10(new int[  ] {1, 0, 1, 1}, 2) returns 11
convertToBase10(new int[  ] {1, 1, 2}, 3) returns 14
convertToBase10(new int[  ] {3, 2, 5}, 8) returns 213
convertToBase10 (new int[ ] {3, 7, 1},  6) returns 0 because 371 is not a legal base 6 number.

Your convertToBase10 method must call the isLegalNumber method that you wrote for question 2.

If you are programming in Java or C#, the function signature is:
	int convertToBase10(int[ ] a, int base)

If you are programming in C or C++, the function signature is:
	int convertToBase10(int a[ ], int len, int base) where len is the size of the array.

 */
public class ConvertBase {
    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[]{ 1 , 0 , 1 , 1 } , 2));
        System.out.println(convertToBase10(new int[]{ 1 , 1 , 2 } , 3));
        System.out.println(convertToBase10(new int[]{ 3 , 2 , 5 } , 8));
        System.out.println(convertToBase10(new int[]{ 3 , 7 , 1 } , 6));
    }

    public static int convertToBase10(int[] a , int n) {

        if (a.length < 1) {
            return 0;
        }
        if (!isLegalNumber(a , n)) {
            return -1;
        }
        int sum = 0, j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            sum += a[i] * power(n , j);
            j++;
        }
        return sum;
    }

    private static boolean isLegalNumber(int[] a , int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > n) {
                return false;
            }
        }
        return true;
    }

    private static int power(int base , int j) {
        int value = 1;
        for (int i = 0; i < j; i++) {
            value = value * base;
        }
        return value;
    }
}
