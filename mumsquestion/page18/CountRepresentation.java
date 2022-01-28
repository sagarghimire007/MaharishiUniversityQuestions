package com.mumsquestion.page18;

/*
Write a function named countRepresentations that returns the number of ways that an amount of money in rupees can be represented as rupee notes.
For this problem we only use  rupee notes in denominations of 1, 2, 5, 10 and 20 rupee notes.

The signature of the function is:
   int countRepresentations(int numRupees)

 */
public class CountRepresentation {

    public static void main(String[] args) {
        System.out.println(countRepresentation(12));
        System.out.println(countRepresentation(15));
        System.out.println(countRepresentation(18));
        System.out.println(countRepresentation(20));
    }

    private static int countRepresentation(int num) {
        int count = 0;
        for (int rupee20 = 0; rupee20 <= num / 20; rupee20++) {
            for (int rupee10 = 0; rupee10 <= num / 10; rupee10++) {
                for (int rupee5 = 0; rupee5 <= num / 5; rupee5++) {
                    for (int rupee2 = 0; rupee2 <= num / 2; rupee2++) {
                        for (int rupee1 = 0; rupee1 <= num; rupee1++) {
                            if (rupee20 * 20 + rupee10 * 10 + rupee5 * 5 + rupee2 * 2 + rupee1 * 1 == num) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
