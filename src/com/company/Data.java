package com.company;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Data {
    //тут выводим наши данные о товарах, какие есть
    public String[] date() {

        ReadFile readFile1 = new ReadFile();
        String str = readFile1.readFile();
        //кладем в массив товаров, разделенных через пробел
        String[] cart = str.split(" ");
        //возвращаем массив товаров
       return cart;
    }



}
