package com.z4hyoung.lifecyclesamples;

import android.util.Log;

final class ObserverAB implements IObserverA, IObserverB {
    private static final String TAG = ObserverAB.class.getSimpleName();

    /**
     * Although both {@link IObserverA_LifecycleAdapter} and {@link IObserverB_LifecycleAdapter} generated, this
     * method will be only called once because of {@link androidx.lifecycle.MethodCallsLogger}
     * in {@link androidx.lifecycle.CompositeGeneratedAdaptersObserver}
     */
    @Override
    public void onStart() {
        Log.d(TAG, "ON_START");
    }
}
