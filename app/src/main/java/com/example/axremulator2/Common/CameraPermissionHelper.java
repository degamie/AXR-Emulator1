package com.example.axremulator2.Common;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

//import com.example.axremulator2.Manifest;
import android.Manifest;
import android.net.Uri;
import android.provider.Settings;;
public class CameraPermissionHelper {
    private static final int CAMERA_PERMISSION_CODE=0;
    private static final String CAMERA_PERMISSION= Manifest.permission.CAMERA;
    public Boolean hasCameraPermission(Activity activity){
        return ContextCompat.checkSelfPermission(activity,CAMERA_PERMISSION)
                == PackageManager.PERMISSION_GRANTED;
    }
    public static void requestCameraPermisssion(Activity activity){
        ActivityCompat.requestPermissions(activity,new String[] {CAMERA_PERMISSION},CAMERA_PERMISSION_CODE);
    }
    public Boolean ShouldShowRequestCameraPermissionRationale(Activity activity){
        return ActivityCompat.shouldShowRequestPermissionRationale(activity,CAMERA_PERMISSION);
    }
    public static void launchCameraPermissionSettings(Activity activity){
        Intent intent=new Intent();
        intent.setAction(Settings.ACTION_ACCESSIBILITY_SETTINGS);
        intent.setData(Uri.fromParts("Package",activity.getPackageName(),null));
        activity.startActivity(intent);
    }
    public static void handleCameraPermission(Activity activity){}
}
//        intent(intent);
//        intent.startActivity(intent);
