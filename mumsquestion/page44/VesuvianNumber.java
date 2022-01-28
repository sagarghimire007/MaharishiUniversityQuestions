package com.mumsquestion.page44;

/*
A number n is vesuvian if it is the sum of two different pairs of squares. For example, 50 is vesuvian because 50 == 25 + 25 and 1 + 49.
The numbers 65 (1+64, 16+49) and 85 (4+81, 36+49) are also vesuvian. 789 of the first 10,000 integers are vesuvian.

Write a function named isVesuvian that returns 1 if its parameter is a vesuvian number, otherwise it returns 0. Hint: be sure to verify that your
function detects that 50 is a vesuvian number!

 */
public class VesuvianNumber {
    public static void main(String[] args) {
        System.out.println(isVesuvianNumber(50));
        System.out.println(isVesuvianNumber(65));
        System.out.println(isVesuvianNumber(85));
        System.out.println(isVesuvianNumber(90));
    }

    public static int isVesuvianNumber(int n) {

        int sum = 0;
        int countVesuvianNumber = 0;

        for (int i = 1; i * i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum = (i * i) + (j * j);
                if (sum == n) {
                    countVesuvianNumber++;
                }
            }
            if (countVesuvianNumber == 2) {
                return 1;
            }
        }
        return 0;
    }
}
