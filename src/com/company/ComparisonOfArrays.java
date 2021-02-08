package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ComparisonOfArrays {

    public static void comparison(ArrayList<String> logChek, ArrayList<String> finderChek){

        Collections.sort(logChek);
        Collections.sort(finderChek);

        for (String s : logChek) {
            if (finderChek.contains(s))
                MainWindow.textAreaResult.append(s + " Верно" + "\n");
            else
                MainWindow.textAreaResult.append(s + " Ошибка, отсутствует в finder" + "\n");
        }
    }
}
