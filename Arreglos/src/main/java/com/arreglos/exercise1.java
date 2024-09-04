/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arreglos;

/**
 *
 * @author cpere
 */
public class exercise1 {
        public static String reorderSentence(String[] words) {
        String[] reordered = new String[words.length];

        for (String word : words) {
            int index = word.length() - 1;
            while (index >= 0 && Character.isDigit(word.charAt(index))) {
                index--;
            }
            int position = Integer.parseInt(word.substring(index + 1)) - 1;
            reordered[position] = word.substring(0, index + 1);
        }

        return String.join(" ", reordered);
    }
}
