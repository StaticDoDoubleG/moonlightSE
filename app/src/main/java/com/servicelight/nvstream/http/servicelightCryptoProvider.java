package com.servicelight.nvstream.http;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public interface servicelightCryptoProvider {
    X509Certificate getClientCertificate();
    PrivateKey getClientPrivateKey();
    byte[] getPemEncodedClientCertificate();
    String encodeBase64String(byte[] data);
}
