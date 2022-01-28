package com.mumsquestion.page51;


/*
Define an array to be n-primeable if for a given n, any elements of the array when incremented by n are prime.
Recall that a prime number is a number that has no factors except 1 and itself. Write a method named isAnyNPrimeable that has an array parameter
and an integer parameter that defines n; the method returns 1 if its array parameter is n-primeable; otherwise it returns 0.
 */


import java.util.Random;

public class AnyNPrimeable {
    public static void main(String[] args) {

        long start, end;

        int[] array = new int[]{ 2 , 3 , 4 , 5 , 6 , 6 , 76 , 67 , 86 , 65 , 56 , 5 , 434 , 5 , 6 , 656 , 76 , 5 , 453 , 453 , 76 , 348 , 56 , 453 , 24 , 4434 , 42 , 3 , 43 , 656 , 34 , 75 , 3434 , 342 , 1 , 2 , 2 , 3 , 33 , 3 , 3 , 3 , 3 , 3 , 4 , 5 , 6 , 6 , 76 , 67 , 86 , 65 , 56 , 5 , 434 , 5 , 6 , 656 , 76 , 5 , 453 , 453 , 76 , 348 , 56 , 453 , 24 , 4434 , 42 , 3 , 43 , 656 , 34 , 75 , 3434 , 342 , 1 , 2 , 2 , 3 , 33 , 3 , 3 , 3 , 3 , 4 , 5 , 6 , 6 , 76 , 67 , 86 , 65 , 56 , 5 , 434 , 5 , 6 , 656 , 76 , 5 , 453 , 453 , 76 , 348 , 56 , 453 , 24 , 4434 , 42 , 3 , 43 , 656 , 34 , 75 , 3434 , 342 , 1 , 2 , 2 , 3 , 33 , 3 , 3 , 3 , 3 , 4 , 5 , 6 , 6 , 76 , 67 , 86 , 65 , 56 , 5 , 434 , 5 , 6 , 656 , 76 , 5 , 453 , 453 , 76 , 348 , 56 , 453 , 24 , 4434 , 42 , 3 , 43 , 656 , 34 , 75 , 3434 , 342 , 1 , 2 , 2 , 3 , 33 , 3 , 3 , 3 , 3 , 4 , 5 , 6 , 6 , 76 , 67 , 86 , 65 , 56 , 5 , 434 , 5 , 6 , 656 , 76 , 5 , 453 , 453 , 76 , 348 , 56 , 453 , 24 , 4434 , 42 , 3 , 43 , 656 , 34 , 75 , 3434 , 342 , 1 , 2 , 2 , 3 , 33 , 3 , 3 , 3 , 3 , 4 , 5 , 6 , 6 , 76 , 67 , 86 , 65 , 56 , 5 , 434 , 5 , 6 , 656 , 76 , 5 , 453 , 453 , 76 , 348 , 56 , 453 , 24 , 4434 , 42 , 3 , 43 , 656 , 34 , 75 , 3434 , 342 , 1 , 2 , 2 , 3 , 33 , 3 , 3 , 3 , 3 , 4 , 5 , 6 , 6 , 76 , 67 , 86 , 65 , 56 , 5 , 434 , 5 , 6 , 656 , 76 , 5 , 453 , 453 , 76 , 348 , 56 , 453 , 24 , 4434 , 42 , 3 , 43 , 656 , 34 , 75 , 3434 , 342 , 1 , 2 , 2 , 3 , 33 , 3 , 3 , 3 , 3 , 4 , 5 , 6 , 6 , 76 , 67 , 86 , 65 , 56 , 5 , 434 , 5 , 6 , 656 , 76 , 5 , 453 , 453 , 76 , 348 , 56 , 453 , 24 , 4434 , 42 , 3 , 43 , 656 , 34 , 75 , 3434 , 342 , 1 , 2 , 2 , 3 , 33 , 3 , 3 , 3 , 3 , 4 , 5 , 6 , 6 , 76 , 67 , 86 , 65 , 56 , 5 , 434 , 5 , 6 , 656 , 76 , 5 , 453 , 453 , 76 , 348 , 56 , 453 , 24 , 4434 , 42 , 3 , 43 , 656 , 34 , 75 , 3434 , 342 , 1 , 2 , 2 , 3 , 33 , 3 , 3 , 3 , };

        int[] array1 = getArray(5000);

        start = System.currentTimeMillis();
        int a = isAnyNPrimeableMethod1(array1 , 2);
        end = System.currentTimeMillis();


        System.out.println(a);
        System.out.println("Time taken for method1 : " + (end - start));


        start = System.currentTimeMillis();
        int b = isAnyNPrimeableMethod2(array1 , 2);
        end = System.currentTimeMillis();

        System.out.println(b);
        System.out.println("Time taken for method2 : " + (end - start));

        System.out.println(start + " , " + end);
    }

    private static int isAnyNPrimeableMethod1(int[] a , int n) {

        System.out.println("Calling Method 1");
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i] + n)) {
                return 1;
            }
        }
        System.out.println("Completed Method 1");
        return 0;
    }

    private static int isAnyNPrimeableMethod2(int[] a , int n) {

        System.out.println("Calling Method 2");

        int test = 0;
        for (int i = 0; i < a.length; i++) {

            if (isPrime(a[i] + n)) {
                test = 1;
            }
        }
        System.out.println("Completed Method 2");
        return test;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] getArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}
