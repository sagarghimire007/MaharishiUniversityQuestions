package com.mumsquestion.page1;

/*
Define the n-upcount of an array  to the number of times the partial sum goes from less than equal to n or greater than n during the calculation
during the calculation of the sum of the element of the array
For eg. if n = 5, the 5-upcount of the array (2,3,1,-6,8,-3,-1,-2) is 3

Hint : Save the previous partial sum int the variable.

Here is an example of an array with a 20-upcount : {1,2,-1,5,3,2,-3}. This is because the maximum value of partial sum is 12, i.e the partial sum
never gets bigger than 20.
 */

public class PartialSumUpCount {
    public static void main(String[] args) {

        System.out.println(nUpCount(new int[]{ 2 , 3 , 1 , -6 , 8 , -3 , -1 , 2 } , 5));
        System.out.println(nUpCount(new int[]{ 6 , 3 , 1 } , 6));
        System.out.println(nUpCount(new int[]{ 1 , 3 , -1 , 5 , 3 , 2 , -3 } , 20));
        System.out.println(nUpCount(new int[]{ 5 } , 5));
        System.out.println(nUpCount(new int[]{} , 2));
    }

    public static int nUpCount(int[] a , int n) {
        if (a.length < 1) {
            return 0;
        }
        int partialSum = 0, upCount = 0, previousPartialSum;
        for (int i = 0; i < a.length; i++) {
            previousPartialSum = partialSum;
            partialSum += a[i];
            if (previousPartialSum < n && partialSum >= n) {
                upCount++;
            }
        }
        return upCount;
    }
}
