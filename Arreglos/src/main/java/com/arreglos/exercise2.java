/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arreglos;

/**
 *
 * @author cpere
 */
public class exercise2 {

    public static int[] mergeAndSort(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }

        return mergedArray;
    }
    
    public static void printArray(int[] array) {
        String outPutText = "Resultado: [ ";
        
        for (int i = 0; i < array.length-1; i++) {
            outPutText += array[i] + ", ";
        }
        
        outPutText += array[array.length-1] + " ]";

        System.out.println(outPutText);
    }
}
