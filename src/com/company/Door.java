package com.company;

/**
 * Created by Oleksii on 3/30/2015.
 */
public class Door {
    public int height;
    public boolean isOpened;
    public Door(int h) {
        height = h;
        isOpened = true;
    }
    public void close() {
        isOpened = false;
    }
}
