package com.company;

public class SplitString {
    String check;

    public SplitString(String s) {
        String[] words = s.split(".Ret:>");//разбиваем строку до Ret:>
        String[] finalCheck = words[1].split("<:");//разбиваем строку после: <:
        check = finalCheck[0];//получаем чек без хвостов
    }
}
