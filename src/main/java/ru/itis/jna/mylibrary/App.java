package ru.itis.jna.mylibrary;

import com.sun.jna.Native;

public class App {
    public static void main(String[] args) {
        MyLib myLib = Native.load("libdlltest3", MyLib.class);
        myLib.hello();
    }
}
