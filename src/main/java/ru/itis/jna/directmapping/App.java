package ru.itis.jna.directmapping;

import com.sun.jna.Native;
import com.sun.jna.Platform;

public class App {
    public static native double cos(double x);
    public static native double sin(double x);

    static {
        Native.register(Platform.C_LIBRARY_NAME);
//        Native.register(Platform.isWindows() ? "msvcrt" : "c"); // the same
    }

    public static void main(String[] args) {
        System.out.println("c sin(pi): " + sin(Math.PI));
        System.out.println("java sin(pi): " + Math.sin(Math.PI));
    }
}
