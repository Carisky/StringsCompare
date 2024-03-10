package org.example;

import org.example.Comparer.Comparer;

public class StringsCompare {
    public static void main(String[] args) {
        // Test isPalindrome method
        System.out.println("Is 'level' a palindrome? " + Comparer.isPalindrome("level"));
        System.out.println("Is 'A man, a plan, a canal, Panama' a palindrome? " +
                Comparer.isPalindrome("A man, a plan, a canal, Panama"));
        System.out.println("Is 'Hello' a palindrome? " + Comparer.isPalindrome("Hello"));
        System.out.println();

        // Test countVowels method
        System.out.println("Number of vowels in 'Hello World': " + Comparer.countVowels("Hello World"));
        System.out.println("Number of vowels in 'Java Programming': " + Comparer.countVowels("Java Programming"));
        System.out.println();

        // Test countConsonants method
        System.out.println("Number of consonants in 'Hello World': " + Comparer.countConsonants("Hello World"));
        System.out.println("Number of consonants in 'Java Programming': " +
                Comparer.countConsonants("Java Programming"));
        System.out.println();

        // Test countOccurrences method
        System.out.println("Occurrences of 'Java' in 'Java is the best programming language. Java rocks!': " +
                Comparer.countOccurrences("Java is the best programming language. Java rocks!", "Java"));
        System.out.println("Occurrences of 'Python' in 'Hello World': " +
                Comparer.countOccurrences("Hello World", "Python"));
    }
}