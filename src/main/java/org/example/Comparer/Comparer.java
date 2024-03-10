package org.example.Comparer;

public class Comparer {

    public static boolean isPalindrome(String input) {
        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int length = cleanInput.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int countVowels(String input) {
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }

    public static int countConsonants(String input) {
        return (int) input.toLowerCase().chars()
                .filter(c -> "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1)
                .count();
    }

    public static int countOccurrences(String input, String word) {
        int count = 0;
        int index = 0;

        while ((index = input.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        return count;
    }
}
