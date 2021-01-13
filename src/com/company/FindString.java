package com.company;

import java.io.*;

public class FindString {

    public FindString(File openFile, File saveFile) throws IOException {

        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(openFile));//открываем поток получаем файл
        FileWriter writer = new FileWriter(saveFile, true);//открываем 2ой поток для записи в файл , каждая запись в файл будет проиводится с сохранением последней
        int i = 0;//счётчик строк

        while ((line = bufferedReader.readLine()) != null) { //начинаем цикл пока строки не будут пустыми
            if (line.contains("DataForMerchant:>") || i > 0) { //ищем оригинальное слово
                i++;//прибавляем к счётчику
            }

            if (i >= 1 && line.contains("Ret:>")) { //получаем положительный ответ ,что есть фин запрос и что строка содержит Ret(чек)
                i = 0;//обнуляем счётчик
                writer.write(SplitString.Check(line) + System.lineSeparator());//разбиваем строку, и записываем чать массива
                writer.flush();//записываем в поток все данные
            }

        }


        bufferedReader.close();//закрываем поток
        writer.close();//закрываем поток
    }
}
