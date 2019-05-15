package com.z4hyoung.lifecyclesamples;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivity extends AppCompatActivity {
    private static final LifecycleObserver mAnonymousObserver = new LifecycleObserver() {
        private static final String TAG = "AnonymousObserver";

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            Log.d(TAG, "ON_START");
        }
    };

    private static final LifecycleObserver mResumeObserver = new Observer("ResumeObserver");
    private static final LifecycleObserver mStopObserver = new Observer("StopObserver");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getLifecycle().addObserver(new EmptyObserver());
        getLifecycle().addObserver(new GenericObserver());
        getLifecycle().addObserver(mAnonymousObserver);
    }

    @Override
    protected void onResume() {
        super.onResume();
        /*
         * mResumeObserver will receive ON_CREATE, ON_START and ON_RESUME for first adding
         */
        getLifecycle().addObserver(mResumeObserver);
    }

    @Override
    protected void onStop() {
        super.onStop();
        /*
         * mResumeObserver will receive ON_CREATE for first adding
         */
        getLifecycle().addObserver(mStopObserver);
    }
}
