package com.company;
import java.io.*;
import java.util.ArrayList;
import java.io.IOException;
public class ReadFile {

    public String readFile() {
        //Чтение данных из текстового файла
        String[] words;

        ArrayList<String> arr = new ArrayList<String>();
        //имя файла
        try (FileReader reader = new FileReader("text.txt");
             BufferedReader br = new BufferedReader(reader)) {
            // читаем построчно
            String line;
            while ((line = br.readLine()) != null) {
                //возвращаем прочитанную строку
                return line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";



    }

}
