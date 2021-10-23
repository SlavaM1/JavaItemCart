package com.company;

import java.util.Date;
import java.util.Random;

public class CartList {
    //Вывод текущей корзины
    public static void СartListItem(String str1, String[] cart, String[] words, int randomInt) {

        Date currentDate = new Date();
        Algorithms algorithms = new Algorithms();
        String[] CartItemList = new String[20];
        //вывод корзины
        System.out.println(" ");
        System.out.println("Заказа №" + randomInt +  " " + str1 + " " + currentDate);
        System.out.println(" ");
        System.out.println("Товары в вашей корзине:");
        System.out.println("Название Цена Количество Сумма");
        int sum =0;
        //вызов линейного поиска и подсчет товаров и тд, все что надо для корзины
        for (int i = 0; i < words.length; i++){
            if(i % 2 == 0){

                int x = algorithms.linearSearch(cart,words[i]);
                int z = Integer.parseInt(cart[x + 1]);
                int c = Integer.parseInt(words[i + 1]);
                int k = c * z;
                sum += k;
                System.out.println(cart[x] + "     " +  cart[x + 1] + "      " + words[i + 1] + "     " + k );

            }

        }
        System.out.println(" ");
        System.out.println("Итого:" + sum);
    }
}
