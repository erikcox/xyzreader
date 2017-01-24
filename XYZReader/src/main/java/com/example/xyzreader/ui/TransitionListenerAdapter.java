/*
 * Copyright (c) 2017 Erik Cox
 */

package com.example.xyzreader.ui;

import android.annotation.TargetApi;
import android.os.Build;
import android.transition.Transition;

@TargetApi(Build.VERSION_CODES.KITKAT)
class TransitionListenerAdapter implements Transition.TransitionListener {
    @Override
    public void onTransitionStart(Transition transition) {
    }

    @Override
    public void onTransitionEnd(Transition transition) {
    }

    @Override
    public void onTransitionCancel(Transition transition) {
    }

    @Override
    public void onTransitionPause(Transition transition) {
    }

    @Override
    public void onTransitionResume(Transition transition) {
    }
}
