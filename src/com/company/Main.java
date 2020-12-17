package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("C:\\Users\\Eg\\Desktop\\1.log")));//открываем поток получаем файл
        FileWriter writer = new FileWriter("C:\\Users\\Eg\\Desktop\\2.txt", true);//открываем 2ой поток для записи в файл , каждая запись в файл будет проиводится с сохранением последней
        String line = bufferedReader.readLine();//получаем целую строку
        int i = 0;//счётчик строк
        while (line != null) {//начинаем цикл пока строки не будут пустыми
            if (line.contains("DataForMerchant:>") || i > 0) {//ищем оригинальное слово
                i++;//прибавляем к счётчику
            }

            if (i >= 1 && line.contains("Ret:>")) {//получаем положительный ответ ,что есть фин запрос и что строка содержит Ret(чек)
                i = 0;//обнуляем счётчик
                SplitString splStr = new SplitString(line);// создаём обеъкт класса и передаём ему строку
                writer.write(splStr.check + System.lineSeparator());//разбиваем строку, и записываем чать массива
                writer.flush();//записываем в поток все данные
            }
            line = bufferedReader.readLine();//переходим на другую строку

        }
        bufferedReader.close();//закрываем поток
        writer.close();//закрываем поток

    }

}
