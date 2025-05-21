package com.gevernova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test
    void testReverse_Positive() {
        Assertions.assertEquals("cba", utils.reverse("abc"));
        Assertions.assertEquals("a", utils.reverse("a"));
        Assertions.assertEquals("123", utils.reverse("321"));
        Assertions.assertEquals("", utils.reverse(""));  // edge case: empty string reversed is empty
    }

    @Test
    void testReverse_Negative() {
        Assertions.assertNull(utils.reverse(null));  // null input returns null
    }

    @Test
    void testIsPalindrome_Positive() {
        Assertions.assertTrue(utils.isPalindrome("madam"));
        Assertions.assertTrue(utils.isPalindrome("racecar"));
        Assertions.assertTrue(utils.isPalindrome("a"));
        Assertions.assertTrue(utils.isPalindrome(""));  // empty string is palindrome by definition
    }

    @Test
    void testIsPalindrome_Negative() {
        Assertions.assertFalse(utils.isPalindrome("disha"));
        Assertions.assertFalse(utils.isPalindrome("hello"));
        Assertions.assertFalse(utils.isPalindrome("Madam"));  // case sensitive check (if applicable)
        Assertions.assertFalse(utils.isPalindrome(null));     // assuming null returns false, or handle accordingly
    }

    @Test
    void testToUpperCase_Positive() {
        Assertions.assertEquals("DISHA", utils.toUpperCase("disha"));
        Assertions.assertEquals("HELLO WORLD", utils.toUpperCase("hello world"));
        Assertions.assertEquals("", utils.toUpperCase(""));  // empty string remains empty
    }

    @Test
    void testToUpperCase_Negative() {
        Assertions.assertNull(utils.toUpperCase(null));  // null input returns null
    }
}
