package ru.itis.jna.sodium;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface Sodium extends Library {

    public static final Sodium INSTANCE = Native.load("sodium", Sodium.class);

    void crypto_hash_sha256(byte[] out, byte[] in, int len);
}
