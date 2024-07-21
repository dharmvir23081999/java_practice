package com.jspider.placement.smallprojectbasedoncollection;

import java.util.Arrays;

public class ArrangeNegativePositive {

    public static void main(String[] args) {
        int[] arr = {-1,2,-3,4,-5}; // {-1, -3, -5, 2, 4}
        int n = arr.length;
        int j = n-1;
        int k = 0;


        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer to the right until it points to a negative number
            while (left < right && arr[left] < 0) {
                left++;
            }

            // Move right pointer to the left until it points to a positive number
            while (left < right && arr[right] > 0) {
                right--;
            }

            // Swap if positions are valid
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        System.out.println("Array:"+ Arrays.toString(arr));

    }
}
