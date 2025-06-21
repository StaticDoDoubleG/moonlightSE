package com.servicelight.binding;

import android.content.Context;

import com.servicelight.binding.audio.AndroidAudioRenderer;
import com.servicelight.binding.crypto.AndroidCryptoProvider;
import com.servicelight.nvstream.av.audio.AudioRenderer;
import com.servicelight.nvstream.http.servicelightCryptoProvider;

public class PlatformBinding {
    public static servicelightCryptoProvider getCryptoProvider(Context c) {
        return new AndroidCryptoProvider(c);
    }
}
