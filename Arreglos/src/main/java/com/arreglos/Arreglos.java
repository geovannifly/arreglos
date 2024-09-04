/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.arreglos;

/**
 *
 * @author cpere
 */
public class Arreglos {

    public static void main(String[] args) {
        
        // Reordenar Palabras en una Oración
        String[] words = {"esta2", "bien4", "muy3", "esto1"};
        String result1 = exercise1.reorderSentence(words);
        System.out.println(result1);
        
        
        
        
        // Fusionar y Ordenar dos Arreglos
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] result2 = exercise2.mergeAndSort(nums1, nums2);

        exercise2.printArray(result2);

    }
}
