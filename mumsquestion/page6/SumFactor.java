package com.mumsquestion.page6;

/*
The sum factor of an array is defined to be the number of times that the sum of the array appears as an element of the array. So the sum factor
of {1, -1, 1, -1, 1, -1, 1} is 4 because the sum of the elements of the array is 1 and 1 appears four times in the array. And the sum factor of
{1, 2, 3, 4} is 0 because the sum of the elements of the array is 10 and 10 does not occur as an element of the array. The sum factor of the empty
array { } is defined to be 0.

Write a function named sumFactor that returns the sum factor of its array argument.

If you are programming in Java or C#, the function signature is
	int sumFactor(int[ ] a)

 */

public class SumFactor {
    public static void main(String[] args) {

        System.out.println("Result 1 : " + sumFactor(new int[]{ 3 , 0 , 2 , -5 , 0 }));
        System.out.println("Result 2 : " + sumFactor(new int[]{ 9 , -3 , -3 , -1 , -1 }));
        System.out.println("Result 3 : " + sumFactor(new int[]{ 1 }));
        System.out.println("Result 4 : " + sumFactor(new int[]{ 0 , 0 , 0 , 0 }));
        System.out.println("Result 5 : " + sumFactor(new int[]{}));
    }

    public static int sumFactor(int[] a) {

        if (a.length < 1) {
            return 0;
        }

        int sum = 0, numOfOccurrence = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == sum) {
                numOfOccurrence++;
            }
        }
        return numOfOccurrence;
    }
}
