package com.company;

public class Algorithms {


        //линейный поиск. В нашем случае его достаточно, тк массив небольшой
        public static int linearSearch(String words[], String elementToSearch) {

            //сравниваем наши товары
            for (int index = 0; index < words.length; index++) {
                if (words[index].equals(elementToSearch))
                //возвращаем индекс товара
                    return index;
            }
            return -1;
        }

        //проверка является ли строка числом
        public static boolean isNumeric(String str) {
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

}
