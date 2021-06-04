package ru.itis.jna.interfacemapping;

import com.sun.jna.Library;

public interface Kernel32 extends Library {
    public boolean Beep(int frequency, int duration);
}
