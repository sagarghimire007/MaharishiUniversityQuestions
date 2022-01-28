package com.mumsquestion.page20;

/*
 Define a cluster in an integer array to be a maximum sequence of elements that are all the same value. For example,
 in the array {3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4} there are 5 clusters, {3, 3, 3}, {4, 4}, {3}, {2, 2, 2, 2} and {4}.
 A cluster-compression of an array replaces each cluster with the number that is repeated in the cluster. So, the cluster compression of the
 previous array would be {3, 4, 3, 2, 4}. The first cluster {3, 3, 3} is replaced by a single 3, and so on.

Write a function named clusterCompression with the following signature

If you are programming in Java or C#, the function signature is
int[ ] clusterCompression(int[ ] a)

If you are programming in C++ or C, the function signature is
int *clusterCompression(int a[ ], int len) where len is the length of the array.

The function returns the cluster compression of the array a. The length of the returned array must be equal to the number of clusters in the original array! This means that someplace in your answer you must dynamically allocate the returned array.

 */

import java.util.Arrays;

public class ClusterCompression {
    public static void main(String[] args) {

        System.out.println("Result 1 : " + Arrays.toString(clusterCompression(new int[]{ 3 , 3 , 3 , 4 , 4 , 3 , 2 , 2 , 2 , 2 , 4 })));
        System.out.println("Result 2 : " + Arrays.toString(clusterCompression(new int[]{ 0 , 0 , 0 , 2 , 0 , 2 , 0 , 2 , 0 , 0 })));
        System.out.println("Result 3 : " + Arrays.toString(clusterCompression(new int[]{ 18 })));
        System.out.println("Result 4 : " + Arrays.toString(clusterCompression(new int[]{})));
        System.out.println("Result 5 : " + Arrays.toString(clusterCompression(new int[]{ -5 , -5 , -5 , -5 , -5 })));
        System.out.println("Result 6 : " + Arrays.toString(clusterCompression(new int[]{ 1 , 1 , 1 , 2 , 2 , 1 , 1 , 1 , 1 })));
        System.out.println("Result 7 : " + Arrays.toString(clusterCompression(new int[]{ 8 , 8 , 6 , 6 , -2 , -2 , -2 })));
    }

    public static int[] clusterCompression(int[] a) {

        if (a.length <= 1) {
            return a;
        }

        // for finding size of a cluster compression
        int num = a[0];
        int size = 1;
        for (int i = 1; i < a.length; i++) {
            if (num != a[i]) {
                size++;
                num = a[i];
            }
        }

        int result[] = new int[size];
        int dummy = a[0];
        result[0] = dummy;
        int p = 1;
        for (int i = 0; i < a.length; i++) {
            if (dummy != a[i]) {
                result[p] = a[i];
                p++;
                dummy = a[i];
            }
        }
        return result;
    }
}
