package ru.itis.jna.sodium;

public class App {
    public static void main(String[] args) {
        byte[] in = new byte[32];
        byte[] out = new byte[32];
        Sodium.INSTANCE.crypto_hash_sha256(out, in, 32);
        for(byte b : in) {
            System.out.print(String.format("%02x", b));
        }
        System.out.println();
        for(byte b : out) {
            System.out.print(String.format("%02x", b));
        }
    }
}
