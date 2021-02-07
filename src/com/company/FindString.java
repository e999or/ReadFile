package com.company;

import java.io.*;
import java.util.ArrayList;

public class FindString {

    static ArrayList<String> logCheck = new ArrayList<>();

    public static void findStr(File openFile) throws IOException {

        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(openFile));
        int i = 0;

        while ((line = bufferedReader.readLine()) != null) { 
            if (line.contains("DataForMerchant:>") || i > 0) { 
                i++;
            }

            if (i >= 1 && line.contains("Ret:>")) {
            	i = 0;
            	MainWindow.textArea.append(SplitString.Check(line) + "\n");
            	logCheck.add(SplitString.Check(line));
            }

        }

        bufferedReader.close();
    }
}
