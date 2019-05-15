package com.z4hyoung.lifecyclesamples;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * Class IObserverA_LifecycleAdapter will be generated automatically if annotationProcessor enabled
 */
interface IObserverA extends LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart();
}
