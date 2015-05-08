package com.company;

import java.util.ArrayList;
import java.util.List;

public class MainLists {
    public static void main(String[] args) {
        String[] s = {"Hello ", "Class", "."};

        List<String> f = new ArrayList<String>();

        f.add("Privet");
        f.add("Klas");
        f.add("...");

        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
        System.out.println(f.get(0));
        System.out.println(f.get(1));
        System.out.println(f.get(2));
        System.out.println(s.length);
        System.out.println(f.size());
    }
}
