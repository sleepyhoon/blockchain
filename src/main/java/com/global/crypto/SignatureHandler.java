package com.global.crypto;

import java.math.BigInteger;
import java.util.Base64;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.ECKey.ECDSASignature;
import org.bitcoinj.core.Sha256Hash;

public class SignatureHandler {
    private static final ECKey key = new ECKey();

    public ECDSASignature makeSignature(String string) {
        BigInteger privateKey = key.getPrivKey();
        String publicKey = Base64.getEncoder().encodeToString(key.getPubKey());
        System.out.println("Private Key: " + privateKey.toString(16));
        System.out.println("Public Key: " + publicKey);
        Sha256Hash dataHash = Sha256Hash.of(string.getBytes());

        // 서명 생성
        return key.sign(dataHash);
    }

//    public boolean verifySignature(Sha256Hash signature) {
//        return key.verify(signature)
//    }
}
