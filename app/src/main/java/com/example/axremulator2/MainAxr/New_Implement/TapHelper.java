package com.example.axremulator2.Common.helpers;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TapHelper {
    public GestureDetector gestureDetector;
    private final BlockingQueue<MotionEvent> queuedSingleTaps=new ArrayBlockingQueue<>(16);
    public String getTapHelper(TapHelper tapHelper){
        return tapHelper;
    }
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
    public MotionEvent poll(){
        return queuedSingleTaps.poll();
    }
    @Override
    public Boolean onTouch(View view ,MotionEvent motionEvent){
        return gestureDetector.onTouchEvent(motionEvent);
    }
}
