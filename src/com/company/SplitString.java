package com.company;

public class SplitString {
    static String check;

    public static String Check(String s) {
        String[] words = s.split(".Ret:>");//разбиваем строку до Ret:>
        String[] finalCheck = words[1].split("<:");//разбиваем строку после: <:
        return check = finalCheck[0];//получаем чек без хвостов
    }

}
