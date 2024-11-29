package com.example.axremulator2.Common;

import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.core.content.ContextCompat;

//import com.example.axremulator2.Manifest;
import android.Manifest;;
public class CameraPermissionHelper {
    private int CAMERA_PERMISSION_CODE=0;
    private String CAMERA_PERMISSION= Manifest.permission.CAMERA;
    public void hasCameraPermission(Activity activity){
        return ContextCompat.checkSelfPermission(activity,CAMERA_PERMISSION== PackageManager.PERMISSION_GRANTED);
    }
}
