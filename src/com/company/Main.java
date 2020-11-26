package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("C:\\Users\\Eg\\Desktop\\1.txt")));
    FileWriter writer = new FileWriter("C:\\Users\\Eg\\Desktop\\2.txt",true);
    String line = bufferedReader.readLine();
    int i = 0;
        while (line != null){
            if(line.contains("DataForMerchant:>") || i > 0){
                i++;
            }

            if(i == 2){
                line = bufferedReader.readLine();
                i = 0;
                SplitString splStr = new SplitString(line);
                writer.write( splStr.check + System.lineSeparator());
                writer.flush();
            }
            line = bufferedReader.readLine();

        }
        bufferedReader.close();
        writer.close();

    }

}
