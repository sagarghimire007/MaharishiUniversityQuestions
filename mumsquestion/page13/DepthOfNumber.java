package com.mumsquestion.page13;

/*

The depth of an integer n is defined to be how many multiples of n it is necessary to compute before all 10 digits have appeared at least
once in some multiple. For example the depth of 42 is 9 as shown by the following table.

Write a function name computeDepth that computes the depth of its integer argument. Its signature is :
 int computeDepth(int n)

 Hint : Use an array to keep track of which digits have been contributed. Digits can be isolated using a combination of modulo 10 and integer
 arithmetic.

 */

import java.util.ArrayList;
import java.util.List;

public class DepthOfNumber {
    public static void main(String[] args) {
        System.out.println("For 7 : " + computeDepth(7));
        System.out.println("For 13 : " + computeDepth(13));
        System.out.println("For 25 : " + computeDepth(25));
        System.out.println("For 42 : " + computeDepth(42));
        System.out.println("For -7 : " + computeDepth(-7));
        System.out.println("For 0 : " + computeDepth(0));

    }

    private static int computeDepth(int num) {

        if (num <= 0) {
            return 0;
        }
        List<Integer> list = new ArrayList<Integer>();
        boolean allNumberOccurred = false;
        int product = 0;
        int n = 0;
        while (list.size() != 10) {
            n++;
            product = num * n;
            int remainder = 0;
            while (product != 0) {
                remainder = product % 10;
                product = product / 10;
                if (list.size() == 0) {
                    list.add(remainder);
                } else {
                    if (isNewListValue(list , remainder)) {
                        list.add(remainder);
                    }
                }
            }
        }
        return n;
    }

    // creating a new method to check whether the number is already present in it or not
    public static boolean isNewListValue(List<Integer> list , int remainder) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == remainder) {
                return false;
            }
        }
        return true;
    }
}
