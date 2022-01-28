package com.mumsquestion.page22;

/*

Define the fullness quotient of an integer n > 0 to be the number of representations of n in bases 2 through 9 that have no zeroes anywhere after
the most significant digit. For example, to see why the fullness quotient of 94 is 6 examine the following table which shows the representations
of 94 in bases 2 through 9.

Write a method named fullnessQuotient that returns the fullness quotient of its argument. If the argument is less than 1 return -1. Its signature is
int fullnessQuotient(int n)

Hint: use modulo and integer arithmetic to convert n to its various representations
 */

public class FullnessQuotient {
    public static void main(String[] args) {

        System.out.println("Result for 1   : " + fullnessQuotation(1));
        System.out.println("Result for 8   : " + fullnessQuotation(8));
        System.out.println("Result for 360 : " + fullnessQuotation(360));
        System.out.println("Result for -4  : " + fullnessQuotation(-4));
        System.out.println("Result for 94  : " + fullnessQuotation(94));
        System.out.println("Result for 0   : " + fullnessQuotation(0)); // for argument less than 1 returns -1

    }

    private static int fullnessQuotation(int n) {

        if (n < 1) {
            return -1;
        }
        int count = 0;
        for (int i = 2; i <= 9; i++) {
            int num = n;
            int remainder = 0;
            int isFullnessQuotient = 1;
            while (num != 0) {
                remainder = num % i;
                num = num / i;
                if (remainder == 0) {
                    isFullnessQuotient = 0;
                    break;
                }
            }
            if (isFullnessQuotient == 1) {
                count++;
            }
        }
        return count;
    }
}

