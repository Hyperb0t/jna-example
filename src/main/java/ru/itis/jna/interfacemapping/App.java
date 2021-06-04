package ru.itis.jna.interfacemapping;

import com.sun.jna.Native;

public class App {
    public static void main(String[] args) {
        Kernel32 kernel32 = Native.load("kernel32", Kernel32.class);
        kernel32.Beep(2000, 1000);

        kernel32.Beep(247, 500);
        kernel32.Beep(417, 500);
        kernel32.Beep(417, 500);
        kernel32.Beep(370, 500);
        kernel32.Beep(417, 500);
        kernel32.Beep(329, 500);
        kernel32.Beep(247, 500);
        kernel32.Beep(247, 500);
        kernel32.Beep(247, 500);
        kernel32.Beep(417, 500);
        kernel32.Beep(417, 500);
        kernel32.Beep(370, 500);
        kernel32.Beep(417, 500);
        kernel32.Beep(497, 500);
    }
}
