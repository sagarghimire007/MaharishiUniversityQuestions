package com.mumsquestion.page15;

/*
Define a stacked number to be a number that is the sum of the first n positive integers for some n. The first 5 stacked numbers are
	1 = 1
	3 = 1 + 2
	6 = 1 + 2 + 3
	10 = 1 + 2 + 3+ 4
	15 = 1 + 2 + 3 + 4 + 5

Note that from the above we can deduce that 7, 8, and 9 are not stacked numbers because they cannot be the sum of any sequence of positive
integers that start at 1.
Write a function named isStacked that returns 1 if its argument is stacked. Other-wise it returns 0. Its signature is:
	int isStacked(int n);
So for example, isStacked(10) should return 1 and isStacked(7) should return 0.

 */

public class StackedNumber {
    public static void main(String[] args) {
        System.out.println("Result 1 : " + isStacked(1));
        System.out.println("Result 2 : " + isStacked(3));
        System.out.println("Result 3 : " + isStacked(6));
        System.out.println("Result 4 : " + isStacked(10));
        System.out.println("Result 5 : " + isStacked(15));
        System.out.println("Result 6 : " + isStacked(7));
        System.out.println("Result 7 : " + isStacked(8));
        System.out.println("Result 8 : " + isStacked(9));
        System.out.println("Result 9 : " + isStacked(0));

    }

    public static int isStacked(int number) {

        if (number < 1) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; sum <= number; i++) {
            sum += i;
            if (sum == number) {
                return 1;
            }
        }
        return 0;
    }
}
