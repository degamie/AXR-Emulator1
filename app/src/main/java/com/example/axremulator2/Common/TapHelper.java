package com.example.axremulator2.Common;

import android.content.Context;
import android.gesture.Gesture;
import android.view.GestureDetector;
import android.view.MotionEvent;

import androidx.compose.animation.core.Motion;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TapHelper {
    private final BlockingQueue<MotionEvent> queuedSingleTaps=new ArrayBlockingQueue<>(16);
    public TapHelper(Context context){
         GestureDetector gestureDetector=new GestureDetector(
                context,
                new GestureDetector.SimpleOnGestureListener(){
                    @Override
                    public boolean onSinngleTapUp(MotionEvent e){
                        queuedSingleTaps.offer(e);
                        return true;
                    }
            @Override
            public boolean onSinngleTapDown(MotionEvent e){
                return true;
            }
        }
        );
    }
}
