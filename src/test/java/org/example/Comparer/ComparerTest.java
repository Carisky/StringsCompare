package org.example.Comparer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ComparerTest {

    @Test
    void isPalindrome() {
        assertTrue(Comparer.isPalindrome("level"));
        assertTrue(Comparer.isPalindrome("A man, a plan, a canal, Panama"));
        assertFalse(Comparer.isPalindrome("Hello"));
    }

    @Test
    void countVowels() {
        assertEquals(3, Comparer.countVowels("Hello World"));
        assertEquals(4, Comparer.countVowels("Java Programming"));
    }

    @Test
    void countConsonants() {
        assertEquals(7, Comparer.countConsonants("Hello World"));
        assertEquals(12, Comparer.countConsonants("Java Programming"));
    }

    @Test
    void countOccurrences() {
        assertEquals(2, Comparer.countOccurrences("Java is the best programming language. Java rocks!", "Java"));
        assertEquals(0, Comparer.countOccurrences("Hello World", "Python"));
    }
}
