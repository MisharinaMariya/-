package ru.arrays;

import java.util.*;

public class TelephoneBook {

    HashMap<String, List<String>> hashMap = new HashMap<>();

    public void add(String surname, String phone){

        List<String> phoneList = hashMap.get(surname);
        if (phoneList == null) {
            List<String> telephone = new ArrayList<>();
            telephone.add(phone);
            hashMap.put(surname, telephone);
        }else {
            phoneList.add(phone);
        }
    }
    public List<String> get(String surname){
        return hashMap.get(surname);
    }
}