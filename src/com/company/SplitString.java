package com.company;

public class SplitString {
    static String check;

    public static String Check(String s) {
        String[] words = s.split(".Ret:>");
        String[] finalCheck = words[1].split("<:");
        return check = finalCheck[0];
    }

}
