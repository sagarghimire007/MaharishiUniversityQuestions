package com.mumsquestion.page39;

/*
An integer number can be encoded as an array as follows. Each digit n of the number is represented by n zeros followed by a 1.
So the digit 5 is represented by 0, 0, 0, 0, 0, 1. The encodings of each digit of a number are combined to form the encoding of the number.
So the number 1234 is encoded as the array {0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}. The first 0, 1 is contributed by the digit 1,
the next 0, 0, 1 is contributed by the digit 2, and so on. There is one other encoding rule: if the number is negative, the first element of
the encoded array must be -1, so -201 is encoded as {-1, 0, 0, 1, 1, 0, 1}. Note that the 0 digit is represented by no zeros, i.e. there are
two consecutive ones!

Write a method named encodeArray that takes an integer as an argument and returns the encoded array.

If you are programming in Java or C#, the function prototype is
int[] encodeArray(int n)

If you are programming in C or C++, the function prototype is
int * encodeArray(int n);

Hints

Use modulo 10 arithmetic to get digits of number
Make one pass through the digits of the number to compute the size of the encoded array.
Make a second pass through the digits of the number to set elements of the encoded array to 1.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(encodeArray(-1234)));
        System.out.println(Arrays.toString(encodeArray(0)));
        System.out.println(Arrays.toString(encodeArray(1)));
        System.out.println(Arrays.toString(encodeArray(-1)));
        System.out.println(Arrays.toString(encodeArray(100001)));
        System.out.println(Arrays.toString(encodeArray(999)));

    }

    public static int[] encodeArray(int n) {

        List<Integer> list = new ArrayList<Integer>();
        boolean isNegative = false;
        int remainder = 0;
        int size = 0;
        if (n < 0) {
            isNegative = true;
            n = n * -1;
            size++;
        }
        while (n != 0) {
            remainder = n % 10;
            n = n / 10;
            list.add(remainder);
            size = size + remainder + 1;
        }

        int[] resultArray = new int[size];
        int index = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (isNegative) {
                isNegative = false;
                resultArray[0] = -1;
                index++;
            }

            for (int j = 0; j < list.get(i); j++) {
                resultArray[index] = 0;
                index++;
            }
            resultArray[index] = 1;
            index++;
        }
        return resultArray;
    }
}
