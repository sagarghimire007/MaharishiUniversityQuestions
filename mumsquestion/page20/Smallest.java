package com.mumsquestion.page20;

/*
The number 124 has the property that it is the smallest number whose first three multiples contain the digit 2. Observe that
124*1 = 124, 124*2 = 248, 124*3 = 372 and that 124, 248 and 372 each contain the digit 2. It is possible to generalize this property to be the
smallest number whose first n multiples each contain the digit 2. Write a function named smallest(n) that returns the smallest number whose
first n multiples contain the digit 2. Hint: use modulo base 10 arithmetic to examine digits.

Its signature is
int smallest(int n)

 */

public class Smallest {
    public static void main(String[] args) {
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }

    public static int smallest(int n) {

        int num = 0, product = 0;
        int remainder = 0, count = 0;

        while (count != n) {
            num++;
            product = 0;
            count = 0;
            for (int i = 1; i <= n; i++) {
                product = num * i;
                while (product != 0) {
                    remainder = product % 10;
                    product = product / 10;
                    if (remainder == 2) {
                        count++;
                        break;
                    }
                }
            }
            if (count == n) {
                return num;
            }
        }
        return 0;
    }
}
