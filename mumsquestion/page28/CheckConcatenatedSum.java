package com.mumsquestion.page28;

/*
The number 198 has the property that 198 = 11 + 99 + 88, i.e., if each of its digits is concatenated twice and then summed, the result will be the
 original number. It turns out that 198 is the only number with this property. However, the property can be generalized so that each digit is
  concatenated n times and then summed. For example, 2997 = 222+999+999+777 and here each digit is concatenated three times. Write a function 
  named checkContenatedSum that tests if a number has this generalized property.
The signature of the function is
int checkConcatenatedSum(int n, int catlen) where n is the number and catlen is the number of times to concatenate each digit before summing. 

The function returns 1 if n is equal to the sum of each of its digits contenated catlen times. Otherwise, it returns 0. You may assume that n 
and catlen are greater than zero

Hint: Use integer and modulo 10 arithmetic to sequence through the digits of the argument. 

 */

public class CheckConcatenatedSum {
    public static void main(String[] args) {

        System.out.println(checkConcatenatedSum(198 , 2));
        System.out.println(checkConcatenatedSum(198 , 3));
        System.out.println(checkConcatenatedSum(2997 , 3));
        System.out.println(checkConcatenatedSum(2997 , 2));
        System.out.println(checkConcatenatedSum(13332 , 4));
        System.out.println(checkConcatenatedSum(9 , 1));

    }

    public static int checkConcatenatedSum(int n , int catlen) {

        if (n <= 0 || catlen < 0) {
            return 0;
        }
        int sum = 0, remainder = 0;
        int number = n;
        while (number != 0) {
            remainder = number % 10;
            number = number / 10;
            sum = sum + concatenatedDigit(remainder , catlen);
        }
        if (sum == n) {
            return 1;
        }
        return 0;
    }

    // concatenatedDigit calculation...
    private static int concatenatedDigit(int remainder , int catlen) {

        int digit = 0;
        for (int i = 1; i <= catlen; i++) {
            digit += remainder * Math.pow(10 , i - 1);
        }
        return digit;
    }
}
