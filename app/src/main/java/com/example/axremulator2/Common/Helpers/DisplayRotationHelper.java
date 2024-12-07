package com.example.axremulator2.Common.Helpers;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.view.Display;

public class DisplayRotationHelper {
    public DisplayManager displayManager;
    public CameraManager cameraManager;
    public Display display;
    public boolean ViewPort;
    public int viewHeight;
    public int viewWidth;

    public DisplayRotationHelper(Context context){
        displayManager =(displayManager)context.getSystemService(context.DISPLAY_SERVICE);
        cameraManager=(cameraManager)context.getSystemService(context.CAMERA_SERVICE);
    }
}
