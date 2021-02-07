package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ComparisonOfArrays {

    public static void comparison(ArrayList<String> logChek, ArrayList<String> finderChek){

        Collections.sort(logChek);
        Collections.sort(finderChek);

        for (int i = 0; i < logChek.size(); i++) {
            try {
                if (logChek.contains(finderChek.get(i)))
                    MainWindow.textAreaResult.append(finderChek.get(i) + " Верно" + "\n");
                else
                    MainWindow.textAreaResult.append(logChek.get(i) + "   " + finderChek.get(i) + " Ошибка " + "\n");
            }catch (IndexOutOfBoundsException e){
                MainWindow.textAreaResult.append(logChek.get(i) +  " Ошибка ." + "\n");
            }
        }
    }
}
