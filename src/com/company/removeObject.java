package com.company;

import java.util.ArrayList;
import java.util.Scanner;
//удаление товара из корзины
public class removeObject {

    public void   RemoveObject(String[] array, String[] word,ArrayList<String> list ) {

        //создадим экземпляр класса наших алгоритмов
        Algorithms algorithms = new Algorithms();

        //удаляем товар
        for (int i = 0; i < word.length; i++) {
            if (algorithms.linearSearch(array, word[i]) % 2 == 0) {
                int p = algorithms.linearSearch(array, word[i]);
                //удаляем текущий найденный товар
                list.remove(p);
                //удаляем его значение, p остается потому что, когда удаляем он смещается на 1 индекс влево
                list.remove(p);
                System.out.println("Товар " + word[i] + " успешно удален!");
                //повторяем цикл
                continue;
            } else {

                //если не нашел такого товара, или что-то ввел неправильно, то выводим ошибку
                System.out.println("Произошла какая-то ошибка, попробуйте еще раз.");
                System.out.println("Возможно вы ввели неправильно или ваша корзина пуста");
                System.out.println(" ");
            }
        }

    }
}
