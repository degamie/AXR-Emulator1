package com.example.axremulator2.Common.helpers;

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
    public CameraManager cameraManager;
    public CameraPermissionHelper cameraPermissionHelper=new CameraPermissionHelper();
    private static final int CAMERA_PERMISSION_CODE=0;
    private static final String CAMERA_PERMISSION= Manifest.permission.CAMERA;
    public String getCameraPermission(int CAMERA_PERMISSION_CODE,String CAMERA_PERMISSION,CameraPermissionHelper cameraPermissionHelper){
        if(CAMERA_PERMISSION_CODE.length==null && CAMERA_PERMISSION.length==null && cameraPermissionHelper.equals(0)==null )return null;
        while(CAMERA_PERMISSION_CODE.length!=null && CAMERA_PERMISSION.length!=null){
            if(CAMERA_PERMISSION_CODE.length>0){
                CAMERA_PERMISSION_CODE+=CAMERA_PERMISSION.length;
                cameraPermissionHelper.ShouldShowRequestCameraPermissionRationale(Activity);
            }else CAMERA_PERMISSION_CODE=0;
        }return CAMERA_PERMISSION_CODE+CAMERA_PERMISSION+cameraPermissionHelper;
    }
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
    public static void handleCameraPermission(Activity activity){
        if(CAMERA_PERMISSION_CODE==0)return ;
        while(CAMERA_PERMISSION_CODE!=0){
            if(!cameraManager.hasCameraEnabled){
                CAMERA_PERMISSION="Camera has been Enabled";
            }else  CAMERA_PERMISSION="Camera has been Disabled";
        }return CAMERA_PERMISSION;
    }
}
//        intent(intent);
//        intent.startActivity(intent);
