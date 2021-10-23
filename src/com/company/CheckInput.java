package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckInput {

    public   boolean сheckInput(String[] cart, String str, ArrayList<String> list) {
        //создадим экземпляр класса наших алгоритмов
        Algorithms algorithms = new Algorithms();
        Scanner console = new Scanner(System.in);

        //кладем в массив, разделяем по пробелу
        String[] words = str.split(" ");

        //проверка правильности ввода товара
        for (int i = 0; i < words.length; i++) {

            //берем каждый 1й элемент(тк с 0, те четный) , тк второй у нас количество и он не нужен
            if (i % 2 == 0) {

                //тут 4 вида проверок. 1. Что действительно у нас есть такой товар. 2 и 3. Длинна нашей записи должна быть четна
                //тк у нас товар и цена, в противном случае ошибка и 4. Проверка, что 2й элемент действительно число
                       if (algorithms.linearSearch(cart, words[i]) % 2 == 0 && words.length % 2 == 0 && words.length % 2 != 1 &&  algorithms.isNumeric(words[i + 1])) {
                           //кладем наш товар в массив, если все ок
                           list.add(new String(words[i]));
                           //его цену
                           list.add(new String(words[i + 1]));
                           //говорим какой товар успешно добавлен
                           System.out.println(" ");
                           System.out.println("Товар " + words[i] + " успешно добавлен!");
                           System.out.println(" ");
                           //повторяем все
                           continue;


                   } else {
                           //если что-то пошло не так выходим из массива
                           System.out.println("Упс, что-то не так. Возможно вы ввели все товары неправильно или только 1");
                           System.out.println("Пожалуйста, попытайтесь снова ввести товар");
                           System.out.println(" ");
                       }

            }
        }

        return false;
    }

}
