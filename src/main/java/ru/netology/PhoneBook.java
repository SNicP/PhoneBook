package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private static final Map<String,String> phoneBookByName = new TreeMap<>();
    private static final Map<String,String> phoneBookByNumber = new HashMap<>();

    public int add (String name, String numberPhone) {
        phoneBookByName.put(name, numberPhone);
        phoneBookByNumber.put(numberPhone, name);
        return phoneBookByName.size();
    }

    public String findByNumber(String numberPhone) {
        return phoneBookByNumber.get(numberPhone);
    }

    public String findByName(String name) {
        return phoneBookByName.get(name);
    }

    public String printAllNames() {
        return phoneBookByName.keySet().toString();
    }
}
