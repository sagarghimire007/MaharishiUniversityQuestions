package com.mumsquestion.page35;

/*

 A number can be encoded as an integer array as follows. The first element of the array is any number and if it is negative then the encoded number
 is negative. Each digit of the number is the absolute value of the difference of two adjacent elements of the array. The most significant digit of
 the number is the absolute value of the difference of the first two elements of the array. For example, the array {2, -3, -2, 6, 9, 18} encodes the
 number 51839 because
•	5 is abs(2 - (-3))
•	1 is abs(-3 - (-2))
•	8 is abs(-2 - 6)
•	3 is abs(6-9)
•	9 is abs(9-18)
The number is positive because the first element of the array is >= 0.
If you are programming in Java or C#, the function prototype is
int decodeArray(int[ ] a)
If you are programming in C or C++, the function prototype is
int decodeArray(int a[ ], int len) where len is the length of array a;

You may assume that the encoded array is correct, i.e., the absolute value of the difference of any two adjacent elements is between 0 and 9
inclusive and the array has at least two elements.

 */

public class Encoded {
    public static void main(String[] args) {

        decodeArray(new int[]{ 0 , -3 , 0 , -4 , 0 });
        decodeArray(new int[]{ -1 , 5 , 8 , 17 , 15 });
        decodeArray(new int[]{ 1 , 5 , 8 , 17 , 15 });
        decodeArray(new int[]{ 111 , 115 , 118 , 127 , 125 });
        decodeArray(new int[]{ 1 , 1 });
    }

    public static void decodeArray(int[] a) {

        if (a.length < 2) {
            System.out.println(0);
        }
        int sum = 0, digit = 0;
        for (int i = 0; i < a.length - 1; i++) {
            digit = Math.abs(a[i] - a[i + 1]);
            sum += digit * Math.pow(10 , a.length - 2 - i);
        }
        if (a[0] < 0) {
            sum = sum * -1;
        }

        System.out.println(sum);
    }
}
