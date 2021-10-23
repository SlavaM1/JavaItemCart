package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class WriteCartFile {
    //запись корзины в файл
    public static void writeCartFile(String str1, String[] cart, String[] words, int randomInt) {

        //тут имя тхт файла
        try(FileWriter writer = new FileWriter("cart.txt", false))
        {
            //экземпляры
            Date currentDate = new Date();
            Algorithms algorithms = new Algorithms();
            String[] CartItemList = new String[20];

            //Тут записываем в файл все наши данные
            writer.write(" ");
            writer.append('\n');
            writer.write("Заказа №" + randomInt +  " " + str1 + " " + currentDate);
            writer.write(" ");
            writer.append('\n');
            writer.write("Товары в вашей корзине:");
            writer.append('\n');
            writer.write("Название Цена Количество Сумма");
            writer.append('\n');

            //Обьявляем итоговую сумму
            int sum =0;

            for (int i = 0; i < words.length; i++){
                if(i % 2 == 0){

                    //вызов линейного поиска, + подсчет суммы, количества и тд
                    int x = algorithms.linearSearch(cart,words[i]);
                    int z = Integer.parseInt(cart[x + 1]);
                    int c = Integer.parseInt(words[i + 1]);
                    int k = c * z;
                    sum += k;
                    writer.write(cart[x] + "     " +  cart[x + 1] + "      " + words[i + 1] + "     " + k );
                    writer.append('\n');

                }

            }
            writer.write(" ");
            writer.append('\n');
            writer.write("Итого:" + sum);
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
