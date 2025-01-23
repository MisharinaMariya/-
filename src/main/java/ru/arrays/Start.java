package ru.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Start {

    public static void main(String[] args) {
        String[] arr = {"Привет","Привет","Пока","Хэллоу","Добрый день","Здравствуйте", "До свидания","До встречи","Добрый день","Пока"};
        Set<String> set = new HashSet<>();
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i= 0; i < arr.length; i++){
            set.add(arr[i]);
            Integer value = hashMap.get(arr[i]);
            if (value == null){
                hashMap.put(arr[i], 1);
            } else {
                hashMap.put(arr[i], value+1);
            }

        }
        System.out.println(set);
        System.out.println(hashMap);

        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.add("Иванов", "111");
        telephoneBook.add("Иванов", "222");
        telephoneBook.add("Петров", "333");
        telephoneBook.add("Сидоров", "444");

        System.out.println(telephoneBook.get("Иванов"));
        System.out.println(telephoneBook.get("Петров"));
        System.out.println(telephoneBook.get("Сидоров"));
    }



}
