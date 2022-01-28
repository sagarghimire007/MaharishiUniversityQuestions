package com.mumsquestion.page16;

/*

Define a positive number to be isolated if none of the digits in its square are in its cube. For example 163 is n isolated number
because 69*69 =  26569  and 69*69*69 = 4330747 and the square does not contain any of the digits 0, 3, 4 and 7 which are the digits used in the
cube. On the other hand 162 is not an isolated number because 162*162=26244 and 162*162*162 = 4251528 and the digits 2 and 4 which appear in the
square are also in the cube.

Write a function named isIsolated that returns 1 if its argument is an isolated number,  it returns 0 if its not an isolated number and
it returns -1 if it cannot determine whether it is isolated or not (see the note below). The function signature is:

int isIsolated(long n)

Note that the type of the input parameter is long. The maximum positive number that can be represented as a long is 63 bits long. This allows us
to test numbers up to 2,097,151 because the cube of 2,097,151 can be represented as a long. However, the cube of 2,097,152 requires more than 63
bits to represent it and hence cannot be computed without extra effort. Therefore, your function should test if n is larger than 2,097,151 and
return -1 if it is. If  n is less than 1 your function should also return -1.

Hint: n % 10 is the rightmost digit of n, n = n/10 shifts the digits of n one place to the right.

 */

public class IsolatedNumber {
    public static void main(String[] args) {
        System.out.println("Result for -1 : " + isIsolated(-1));
        System.out.println("Result for 2 : " + isIsolated(2));
        System.out.println("Result for 3 : " + isIsolated(3));
        System.out.println("Result for 8 : " + isIsolated(8));
        System.out.println("Result for 9 : " + isIsolated(9));
        System.out.println("Result for 14 : " + isIsolated(14));
        System.out.println("Result for 24 : " + isIsolated(24));
        System.out.println("Result for 28 : " + isIsolated(28));
        System.out.println("Result for 34 : " + isIsolated(34));
        System.out.println("Result for 58 : " + isIsolated(58));
        System.out.println("Result for 63 : " + isIsolated(63));
        System.out.println("Result for 0 : " + isIsolated(0));
        System.out.println("Result for 1 : " + isIsolated(1));

    }

    public static int isIsolated(long n) {

        if (n < 1 || n > 2097151) {
            return -1;
        }
        long squareNumber = n * n;
        long cubeNumber = n * n * n;
        int checkDigit, checkDigit1 = 0;
        while (squareNumber != 0) {
            checkDigit = (int) squareNumber % 10;
            squareNumber = squareNumber / 10;

            while (cubeNumber != 0) {
                checkDigit1 = (int) cubeNumber % 10;
                cubeNumber = cubeNumber / 10;
                if (checkDigit == checkDigit1) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
