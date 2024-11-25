package com.global.util;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtils {
    private static final String SHA256 = "SHA-256";
    private static final String RIPEMD160 = "RIPEMD160";

    // SHA-256 해시 계산
    public static byte[] sha256(byte[] input) {
        try {
            MessageDigest digest = MessageDigest.getInstance(SHA256);
            return digest.digest(input);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // RIPEMD-160 해시 계산
    public static byte[] ripemd160(byte[] input) {
        try {
            MessageDigest digest = MessageDigest.getInstance(RIPEMD160);
            return digest.digest(input);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("RIPEMD-160 is not supported in this environment", e);
        }
    }

    // HASH160
    public static byte[] hash160(byte[] input) {
        return ripemd160(sha256(input));
    }
}
