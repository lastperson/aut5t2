package com.company;

public class Main2 {
    public static void main(String[] args) {
        // System.out.println(args[0]);

        // Если первьій єлемент args равен "Hello" тогда напечатать в консоль
        // "Class", иначе напечатать в консоль "Good bye".

        // Если первьій єлемент args равен "Hello", а второй "Class"
        // тогда напечатать в консоль "Success"
        // иначе напечатать в консоль "Good bye".
        int i = 0;
        while (i < 5) {
            i = 10;
            int f = i++;
            i = 11;
            System.out.println(i);
        }
        System.out.println(i);
        String s = "s";
        for (int j = 0; j < 5; j = j + 1) {
            System.out.println(j);
            if (s.equals("error")) {
                continue;
            }
            System.out.println("hello");
        }
    }
}
