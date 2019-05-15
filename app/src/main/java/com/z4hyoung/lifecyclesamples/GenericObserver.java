package com.z4hyoung.lifecyclesamples;

import android.util.Log;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/**
 * Directly implements {@link GenericLifecycleObserver} although it is annotated with
 * {@link androidx.annotation.RestrictTo}
 */
final class GenericObserver implements GenericLifecycleObserver {
    private static final String TAG = GenericObserver.class.getSimpleName();

    @Override
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Log.d(TAG, event.name());
    }
}
