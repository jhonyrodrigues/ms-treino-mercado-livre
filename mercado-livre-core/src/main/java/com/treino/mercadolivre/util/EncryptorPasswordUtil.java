package com.treino.mercadolivre.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EncryptorPasswordUtil {

    private static final String ALGORITHM = "SHA-256";
    private static final String CHARSET_NAME = "UTF-8";
    private static final int SIGNUM = 1;
    private static final int RADIX = 16;

    public static String encryptorPassword(String password) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ALGORITHM);
            messageDigest.update(password.getBytes(CHARSET_NAME));
            return new BigInteger(SIGNUM, messageDigest.digest()).toString(RADIX);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}