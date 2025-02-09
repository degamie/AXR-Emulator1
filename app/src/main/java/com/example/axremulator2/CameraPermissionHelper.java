//import com.example.axremulator2.Manifest;
package com.example.axremulator2.Old_PCKGS.helpers;
import com.example.axremulator2.Old_PCKGS.helpers.ContextCompat;

import static android.provider.Settings.System.getString;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


import android.Manifest;
import android.graphics.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;;
import com.example.axremulator2.R;

public class CameraPermissionHelper extends CameraManager {
    public String CameraId=null;CameraCharacteristics cameraCharacteristics=new CameraCharacteristics.Key<CameraId,CameraManager>();
    //starting Camera
    public void OnStartCamera(Camera camera,CameraManager cameraManager,String CameraId){
        super.OnStartCamera(camera,cameraManager,CameraId);
        cameraCharacteristics.getPhysicalCameraIds();
        return CameraDevice.CameraDeviceSetup(CameraId);
    }
    private static final int CAMERA_PERMISSION_CODE=0;
    private static final String CAMERA_PERMISSION= Manifest.permission.CAMERA;
    public Boolean hasCameraPermission(Activity activity){
        return ContextCompat.checkSelfPermission(activity,CAMERA_PERMISSION)
                == PackageManager.PERMISSION_GRANTED;
    }
    public static void requestCameraPermisssion(Activity activity){
        com.example.axremulator2.Old_PCKGS.helpers.ActivityCompat.requestPermissions(activity,new String[] {CAMERA_PERMISSION},CAMERA_PERMISSION_CODE);
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
    public static void CameraOpenSafe(Activity activity,String cameraId){
        boolean isCameraOpen=false;//initilize Camera Opening
        try{//Declaring Camera Exceptions
            releaseCameraAndPreview();
            Camera camera=IsCameraOpen(cameraId);
            isCameraOpen=(Camera!=null);
        }
        catch(Exception e){//Carching The Camera Exceptions
            Log.e(getString(R.string.app_name),"Unable to Open the Camera");//printing the Camera Exceptions
            e.printStackTrace();//Printing the Sys Exceptions
        }
        return isCameraOpen;//printing the Camera Opening
    }

    private static Camera IsCameraOpen(String cameraId,CameraManager cameraManager) {
        if(cameraId==null)return 0;
        while(cameraId!=null){
            else {int cameraId=0;
                cameraId+=cameraManager.openCamera(cameraId);
            }
        }return cameraId;
    }

    private static void releaseCameraAndPreview() {

    }
}
//        intent(intent);
//        intent.startActivity(intent);
