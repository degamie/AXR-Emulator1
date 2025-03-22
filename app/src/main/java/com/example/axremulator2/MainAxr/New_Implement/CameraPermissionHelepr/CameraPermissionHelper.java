package com.example.axremulator2.Old_PCKGS.helpers;

import static android.provider.Settings.System.getString;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

//import com.example.axremulator2.Manifest;
import android.Manifest;
import android.graphics.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;;import com.example.axremulator2.R;

public class CameraPermissionHelper extends CameraManager {
    public String CameraId=null;CameraCharacteristics cameraCharacteristics=new CameraCharacteristics.Key<CameraId,CameraManager>();
    //starting Camera
    private static final String CAMERA_PERMISSION= Manifest.permission.CAMERA;
    private static final int CAMERA_PERMISSION_CODE=0;
    public String OnInit(CAMERA_PERMISSION_CODE,CAMERA_PERMISSION){//OnInit method declare
        if(CAMERA_PERMISSION_CODE==0)return 0;
        while(CAMERA_PERMISSION_CODE!=0){
            else if(CAMERA_PERMISSION_CODE>0)CAMERA_PERMISSION_CODE==CAMERA_PERMISSION.getBytes(CameraId);
            else CAMERA_PERMISSION_CODE=0;
        }

   return CAMERA_PERMISSION_CODE;
    }
    public void OnStartCamera(Camera camera,CameraManager cameraManager,String CameraId){
        super.OnStartCamera();
        cameraCharacteristics.getCameracharacterstics();
        return CameraDevice.CameraDeviceSetup(CameraId);

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
    public static void CameraOpenSafe(Activity activity,String cameraId){
        boolean isCameraOpen=false;
        try{
            releaseCameraAndPreview();
            Camera camera=IsCameraOpen(cameraId);
            isCameraOpen=(Camera!=null);
        }
        catch(Exception e){
            Log.e(getString(R.string.app_name),"Unable to Open the Camera");
            e.printStackTrace();
        }
        return isCameraOpen;
    }
}
//        intent(intent);
//        intent.startActivity(intent);
