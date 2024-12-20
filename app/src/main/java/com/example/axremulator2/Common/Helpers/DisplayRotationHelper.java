package com.example.axremulator2.Common.helpers;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.view.Display;

import com.google.ar.core.Session;

public class DisplayRotationHelper {
    public DisplayManager  displayManager;
    public CameraManager cameraManager;
    public Display display;
    public boolean ViewPortChanged;
    public int viewHeight;
    public int viewWidth;

    @SuppressLint("ServiceCast")
    public DisplayRotationHelper(DisplayRotationHelper context){
        displayManager =(displayManager)context.getSystemService(context.DISPLAY_SERVICE);
        cameraManager=(cameraManager)context.getSystemService(context.CAMERA_SERVICE);
    }
    public void onResume(){
        displayManager.registerDisplayListener(this,null);

    }
    public void onPause(){
        displayManager.unregisterDisplayListener(this);
    }
    public void onSurfaceChanged(int width ,int height){
        viewWidth=width;
        viewHeight=height;
        ViewPortChanged=true;
    }
    public void updateSessionifRequired(Session session){
        if(ViewPortChanged){
            displayManager=display.getRotation();
            session.setDisplayGeometry(display,viewWidth,viewHeight);
            ViewPortChanged=false;
        }
    }
    public int getCameraSensorRelativeViewPortAspectRatio(String CameraId){
        float aspectRatio=0;
        int CameraSensorDisplayRotation=getCameraSensorToDisplayRotation(CameraId);
        switch (CameraSensorDisplayRotation){
            case 90:
            case 270:
                aspectRatio=(float) viewHeight/(float) viewWidth;
                break;

            case 0:
            case 180:
                aspectRatio=(float) viewHeight/(float) viewWidth;
                break;
            default:
                throw new RuntimeException("UnHandled Rotation:"+CameraSensorDisplayRotation);

        }
        return (int) aspectRatio;
    }

}
