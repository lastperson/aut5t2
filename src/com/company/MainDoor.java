package com.company;

public class MainDoor {
    public static void main(String[] args) {
        Door k = new Door(100);
        Door l = new Door(190);

        System.out.println("k height is " + k.height);
        if (k.isOpened) {
            System.out.println("k is OPENED!");
        } else {
            System.out.println("k is CLOSED!");
        }
        k.height = 500;
        System.out.println("k height is " + k.height);
        k.close();
        if (k.isOpened) {
            System.out.println("k is OPENED!");
        } else {
            System.out.println("k is CLOSED!");
        }
    }
}
