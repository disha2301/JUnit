package com.gevernova;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    StringUtils utils = new StringUtils();

    public StringUtilsTest() {
    }

    @Test
    void testReverse() {
        Assertions.assertEquals("cba", this.utils.reverse("abc"));
        Assertions.assertEquals("", this.utils.reverse(""));
        Assertions.assertNull(this.utils.reverse((String)null));
    }

    @Test
    void testIsPalindrome() {
        Assertions.assertTrue(this.utils.isPalindrome("madam"));
        Assertions.assertTrue(this.utils.isPalindrome("disha"));
    }

    @Test
    void testToUpperCase() {
        Assertions.assertEquals("DISHA", this.utils.toUpperCase("disha"));
        Assertions.assertNull(this.utils.toUpperCase((String)null));
    }
}
