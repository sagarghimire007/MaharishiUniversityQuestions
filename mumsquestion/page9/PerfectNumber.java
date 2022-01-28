package com.mumsquestion.page9;

/*
A perfect number is one that is the sum of its factors, excluding itself. The 1st perfect number is 6 because 6 = 1 + 2 + 3. The 2nd perfect
number is 28 which equals 1 + 2 + 4 + 7 + 14. The third is 496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248. In each case, the number is the sum of
all its factors excluding itself.

Write a method named henry that takes two integer arguments, i and j and returns the sum of the ith and jth perfect numbers. So for
example, henry (1, 3) should return 502 because 6 is the 1st perfect number and 496 is the 3rd perfect number and 6 + 496 = 502.

The function signature is
    int henry (int i, int j)
 */

public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(henry(1 , 3));
    }

    public static int henry(int a , int b) {
        int factorSum = 0, countPerfectNumber = 0, totalFactorSum = 0;

        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            factorSum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    factorSum += j;
                }
            }
            if (factorSum == i) {
                countPerfectNumber++;
                if (countPerfectNumber == a || countPerfectNumber == b) {
                    totalFactorSum += factorSum;
                    if (countPerfectNumber == b) {
                        break;
                    }
                }
            }
        }
        return totalFactorSum;
    }
}
