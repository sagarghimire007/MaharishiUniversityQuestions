package com.mumsquestion.page26;

/*

A binary representation of a number can be used to select elements from an array. For example,

  n:           88 = 23 + 24 + 26  (1011000)
  array:     8, 4, 9, 0, 3, 1, 2
  indexes  0  1  2  3  4  5  6
  selected              *  *     *
  result                  0, 3,    2

so the result of filtering {8, 4, 9, 0, 3, 1, 2} using 88 would be {0, 3, 2}

In the above, the elements that are selected are those whose indices are used as exponents in the binary representation of 88.
In other words, a[3], a[4], and a[6] are selected for the result because 3, 4 and 6 are the powers of 2 that sum to 88.

Write a method named filterArray that takes an array and a non-negative integer and returns the result of filtering the array using the binary
representation of the integer. The returned array must big enough to contain the filtered elements and no bigger. So in the above example, the
returned array has length of 3, not 7 (which is the size of the original array.) Furthermore, if the input array is not big enough to contain all
the selected elements, then the method returns null. For example, if n=3 is used to filter the array a = {18}, the method should return null
because 3=20+21 and hence requires that the array have at least 2 elements a[0] and a[1], but there is no a[1].

If you are using Java or C#, the signature of the function is
int[ ] filterArray(int[ ] a, int n)

If you are using C or C++, the signature of the function is
int * filterArray(int a[ ], int len, int n) where len is the length of the array a

Hint: Proceed as follows

a. Compute the size of the returned array by counting the number of 1s in the binary representation of n (You can use modulo 2 arithmetic to
determine the 1s in the binary representation of n)

b.  Allocate an array of the required size

c. Fill the allocated array with elements selected from the input array

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterArray {
    public static void main(String[] args) {

        System.out.println("Result 1 : " + Arrays.toString(filterArray(new int[]{ 8 , 4 , 9 , 0 , 3 , 1 , 2 } , 88)));
        System.out.println("Result 2 : " + Arrays.toString(filterArray(new int[]{ 18 } , 3)));
        System.out.println("Result 3 : " + Arrays.toString(filterArray(new int[]{ 9 , -9 } , 0)));
        System.out.println("Result 4 : " + Arrays.toString(filterArray(new int[]{ 9 , -9 } , 1)));
        System.out.println("Result 5 : " + Arrays.toString(filterArray(new int[]{ 9 , -9 } , 2)));
        System.out.println("Result 6: " + Arrays.toString(filterArray(new int[]{ 9 , -9 } , 3)));
        System.out.println("Result 7 : " + Arrays.toString(filterArray(new int[]{ 9 , -9 } , 4)));
        System.out.println("Result 8 : " + Arrays.toString(filterArray(new int[]{ 9 , -9 , 5 } , 3)));
        System.out.println("Result 9 : " + Arrays.toString(filterArray(new int[]{ 0 , 9 , 12 , 18 , -6 } , 11)));
        System.out.println("Result 10 : " + Arrays.toString(filterArray(new int[]{ 0 , 9 , 12 , 18 , -6 } , -1)));
    }

    public static int[] filterArray(int[] a , int n) {

        List<Integer> list = generateBinaryRepresentation(a , n);
        int[] list1 = new int[]{};

        if (n <= 0) {
            return list1;
        }

        // counting the size of returned array by counting the number of 1s in the binary representation
        int size = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                size++;
            }
        }

        if (list.size() > a.length) {
            return list1;
        }

        int[] result = new int[size];
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                result[k] = a[i];
                k++;
            }
        }
        return result;
    }

    public static List<Integer> generateBinaryRepresentation(int[] a , int n) {

        List<Integer> list = new ArrayList<Integer>();
        int remainder = 0;
        while (n != 0) {
            remainder = n % 2;
            n = n / 2;
            list.add(remainder);
        }
        return list;
    }
}
