package com.mumsquestion.page3;

/*
Array is defined to be inertial if the following condition hold :
a. it contains at least one odd value
b. the maximum value in the array is even
c. evey odd value is greater than every even value that is not the maximum value

So {11, 4, 20, 9, 2, 8} is inertial because
 a. it contains at least one odd value
 b. the maximum value in the array is 20 which is even
 c. the two odd values (11 and 9) are greater than all the
    even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.

However, {12, 11, 4, 9, 2, 3, 10} is not inertial because it fails condition (c), i.e., 10 (which is even) is greater 9 (which is odd) but 10 is not the maximum value in the array.

Write a function called isIntertial that accepts an integer array and returns 1 if the array is inertial; otherwise it returns 0.

If you are programming in Java or C#, the function signature is
	int isInertial(int[ ] a)

 */

public class InertialArray {
    static int max = 0;

    public static void main(String[] args) {

        System.out.println("Result 1 : " + isInertial(new int[]{ 1 }));
        System.out.println("Result 2 : " + isInertial(new int[]{ 2 }));
        System.out.println("Result 3 : " + isInertial(new int[]{ 1 , 2 , 3 , 4 }));
        System.out.println("Result 4 : " + isInertial(new int[]{ 1 , 1 , 2 }));
        System.out.println("Result 5 : " + isInertial(new int[]{ 2 , 12 , 4 , 6 , 8 , 11 }));
        System.out.println("Result 6 : " + isInertial(new int[]{ 2 , 12 , 12 , 4 , 6 , 8 , 11 }));
        System.out.println("Result 7 : " + isInertial(new int[]{ -2 , -4 , -6 , -8 , -11 }));
        System.out.println("Result 8 : " + isInertial(new int[]{ 2 , 3 , 5 , 7 }));
        System.out.println("Result 9 : " + isInertial(new int[]{ 2 , 4 , 6 , 8 , 10 }));
        System.out.println("Result 10 : " + isInertial(new int[]{ 0 }));
        System.out.println("Result 11 : " + isInertial(new int[]{}));
    }

    public static int isInertial(int[] array) {
        if (array.length < 1) {
            return 0;
        }
        if (hasAtLeastOneOdd(array) && hasMaxElementEven(array) && isOddGreaterThanEven(array)) {
            return 1;
        }
        return 0;
    }

    // find whether an array contains at least one odd element in it.
    private static boolean hasAtLeastOneOdd(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (!(array[i] % 2 == 0)) {
                return true;
            }
        }
        return false;
    }

    // array having maximum value as even
    private static boolean hasMaxElementEven(int[] array) {

        max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        // if maximum value is even return true else false
        if (max % 2 == 0) {
            return true;
        }
        return false;
    }

    // odd value greater than even that is not the maximum value;
    private static boolean isOddGreaterThanEven(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                continue;
            }
            for (int j = 0; j < array.length; j++) {
                if ((!(array[j] % 2 == 0)) || array[j] == max) {
                    continue;
                }
                // if the odd value is less than any even number than no more iteration and return false...
                if ((array[i] < array[j])) {
                    return false;
                }
            }
        }
        return true;
    }


    // with eliminating one for loop from second method

//    private static boolean isOddGreaterThanEven2(int[] array) {
//
//        // eliminate 1 for loop
//        int k = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[k] % 2 == 0) {
//                i = 0;
//                k++;
//                continue;
//            }
//            if ((!(array[i] % 2 == 0)) || array[i] == max) {
//                continue;
//            }
//            // if the odd value is less than any even number than no more iteration and return false...
//            if ((array[k] < array[i])) {
//                return false;
//            }
//        }
//        return true;
//    }
}
