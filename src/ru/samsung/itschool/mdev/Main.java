package ru.samsung.itschool.mdev;


import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    static class Staff {
        public String name;
        public int age;
        public String position;
        public BigDecimal salary;
        public List<String> skills;
    }

    
    public static void main(String[] args) {
        String answer = "{\"name\":\"Anton\",\"age\":15,\"position\":\"Junior\",\"salary\":100,\"skills\":[\"java\",\"xml\",\"python\",\"Android\"]}";
        // библиотека от Google => Gson (Google SON)
        // не путать с JSON

        Gson gson = new Gson();
        Staff staff =  gson.fromJson(answer,Staff.class);

        int size = staff.skills.size();

        Staff ivan = new Staff();
        ivan.age = 28;
        ivan.salary= BigDecimal.valueOf(4494);

        System.out.println(gson.toJson(ivan));



    }
}
