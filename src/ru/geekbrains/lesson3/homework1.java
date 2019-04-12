package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class homework1 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        String[] arr = {"Москва", "Лондон", "Лондон", "Лондон", "Париж", "Сан-Франциско", //Как я понял из ДЗ необходимо сначала создать массив
                "Каир", "Токио", "Хабаровск", "Санкт-Петербург", "Каир", "Париж", "Хабаровск", "Сан-Франциско"};

        //Переводим массив в коллекцию для корректного отображения начальных данных
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Начальный массив: " + arrayList);

        // Отображаем список уникальных слов
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(arr));
        System.out.println("Список уникальных слов: " + linkedHashSet);

        //Считаем колличество повторений каждого слова. Пытался через equals решить данную задачу более грамотнее. Не удалось, пришлось топорно.
        ArrayList<String> arrayListUniq = new ArrayList<>(linkedHashSet);
        for (int i = 0; i < arrayListUniq.size(); i++) {
            for (int j = 1; j < arrayList.size(); j++) {
                if (arrayListUniq.get(i) == arrayList.get(j)) {
                    sum++;
                }
            }
            if (sum == 0) {
                sum = 1;
            }
            System.out.println("Слово " + arrayListUniq.get(i) + " встречается " + sum + " раз");
            sum = 0;
        }
    }
}
