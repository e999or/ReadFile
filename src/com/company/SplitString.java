package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitString {
    static String check;

    public static String Check(String s) {
        String[] words = s.split(".Ret:>");
        String[] finalCheck = words[1].split("<:");
        return check = finalCheck[0];
    }

    public static ArrayList<String> finderCheck(String s){
        String [] ar = s.split("\n");
        return new ArrayList<>(Arrays.asList(ar));
    }

}
