package com.z4hyoung.lifecyclesamples;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * Class IObserverB_LifecycleAdapter will be generated automatically if annotationProcessor enabled
 */
interface IObserverB extends LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart();
}
