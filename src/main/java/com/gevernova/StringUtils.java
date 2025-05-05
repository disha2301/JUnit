package com.gevernova;

public class StringUtils {

    // to reverse the string
    public String reverse(String str){
        if(str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
    // to check if the string is palindrome
    public boolean isPalindrome(String str){
        if(str == null ) return false;
        String reversed = reverse(str);
        return str.equals(reversed);
    }
    // to convert to uppercase
    public String toUpperCase(String str){
        if(str == null ) return null;
        return str.toUpperCase();
    }
}
