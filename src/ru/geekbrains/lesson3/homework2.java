package ru.geekbrains.lesson3;

import java.sql.SQLOutput;
import java.util.*;

public class homework2 {
    public static void main(String[] args) {

        //        Вариант №1. Опирался на то что возможна запись сначала номера, потом имени

        Map<String, String> map = new HashMap<>();
        map.put("8-903-000-00-01", "Волков");
        map.put("8-903-000-00-02", "Волков");
        map.put("8-903-000-00-03", "Волков");
        map.put("8-903-000-00-04", "Астахов");
        map.put("8-903-000-00-05", "Петров");
        map.put("8-903-000-00-06", "Сидоров");
        map.put("8-903-000-00-07", "Сидоров");

        Map<Object, List<String>> phonebook = new HashMap<>();

//        Следующую строчку подсмотрел на просторах интернета, в целом понимая как она работает,
//        хотел реализовать работу знакоымыми мне методами и по итогу запутался
//        map.forEach((tel, name) -> {phonebook.computeIfAbsent(name, (k) -> new ArrayList<String>()).add(tel);});

        for (Map.Entry entryPB : phonebook.entrySet()) {
            for (Map.Entry entryM : map.entrySet()) {
                if (entryM.getValue() != entryPB.getKey()) {
                    List<String> list = new ArrayList<>();
                    list.add((String) entryM.getKey());
//                    entryM.getValue() = entryPB.getKey();
                    System.out.println(entryM.getKey());
                }
//                list.add((String) entryM.getKey());
//                phonebook.put(entryM.getValue(), );
                System.out.println(phonebook);
            }
        }
    }


    //        Вариант №2. Подсмотрел Ваш код

    private Map<String, Set<String>> phonebookV2;

    public homework2() {
        this.phonebookV2 = new HashMap<>();
    }

    void addPhone(String name, String phone) {
        Set<String> phones = phonebookV2.get(name);
        if ((phones) == null) {
            phones = new HashSet<>();
            phonebookV2.put(name, phones);
        }
        phones.add(phone);
    }

    public Set<String> getPhoneByName(String name) {
        return phonebookV2.get(name);
    }

}
