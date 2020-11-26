package com.company;

public class SplitString {
    String check;
    public SplitString(String s) {
        String[] words = s.split(".Ret:>");
        String[] finalCheck = words[1].split("<:");
        check = finalCheck[0];
    }
}
