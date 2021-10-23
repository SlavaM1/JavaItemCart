
package com.company;

import java.util.Scanner;
import  java.util.Random;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        //Создаем экземпляр класса корзины
        Data data = new Data();

        String[] words;
        //тут мы храним наши товары из корзины
        ArrayList<String> list = new ArrayList<String>();
        //экземпляр класса корзины
        CartList cartList = new CartList();
        //экземпляр класса проверки правильности ввода товара, перед сохранением в корзину
        CheckInput сheckInput1 = new CheckInput();
        //сгенерируем рандом число для нашего заказа в сессии
        int randomInt = new Random().ints(1000, 1000, 11000).findFirst().getAsInt();

        String[] cart;
        //создаем экземпляр для считывания с консоли текста
        Scanner console = new Scanner(System.in);

        System.out.println("Добро пожаловать! Прежде чем начать");
        System.out.println("Введите ФИО");
        //Ввод ФИО
        System.out.print("Введите:");
        String str1 = console.nextLine();

        //для меню
        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";

        while (!"6".equals(s)){
            //наше меню
            System.out.println("1. Для вывода доступных товаров введите 1");
            System.out.println("2. Для вывода корзины введите 2");
            System.out.println("3. Для обновления корзины введите 3");
            System.out.println("4. Для удаления товара введите 4");
            System.out.println("5. Для записи корзины в файл введите 5");
            System.out.println("6. Для выхода из приложения введите 6");

            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод");
            }

            switch (x){
                case 1:

                    System.out.println(" ");
                    System.out.println("Доступные товары:");
                   //выводим доступные товары

                   cart =  data.date();

                    for (int i = 0; i < cart.length; i = i + 2) {

                        System.out.println(cart[i] + "- цена " + cart[i+1] + " руб" );

                    }

                    System.out.println(" ");
                    break;
                case 2:
                    //выводим корзину
                    cart =  data.date();

                    //передаем данные в корзину
                    String[] array = list.toArray(new String[0]);

                    //вызываем метод вывода корзины
                    cartList.СartListItem(str1,cart,array,randomInt);

                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("Введите товар и цену без запятых, в формате: \nтовар количество");
                    System.out.println("Пример: Бумага 2 Гуашь 4");
                    System.out.print("Введите: ");

                    //Ввод с экрана и присовение переменной
                    String str = console.nextLine();
                    cart =  data.date();
                    //проверка правильности ввода товара и ввод в него
                    сheckInput1.сheckInput(cart,str, list);

                      break;
                case 4:
                    String[] word;
                    System.out.println("Введите товар, который хотите удалить");
                    System.out.println("Пример: Бумага");

                    //вводим то, что хотим удалить
                    String ObjectItem = console.nextLine();
                    word = ObjectItem.split(" ");

                    array = list.toArray(new String[0]);
                    //Создаем экземпляр
                     removeObject removeObject1 = new removeObject();
                    //Вызываем метод удаления товара из корзины
                    removeObject1.RemoveObject(array,word,list);

                    break;
                case 5:
                    //запись корзины в текстовый файл
                    cart =  data.date();
                    array = list.toArray(new String[0]);
                    //экземпляр класса записи корзины в файл
                    WriteCartFile writeCartFile = new WriteCartFile();
                    //вызов метода записи
                    writeCartFile.writeCartFile(str1,cart,array, randomInt);

                    System.out.println("Данные успешно записаны!");

            }
        }
        System.out.println("До свидания!");
        System.out.println("Автор:");
        System.out.println("Миронов Вячеслав Владиславович");


    }

}

