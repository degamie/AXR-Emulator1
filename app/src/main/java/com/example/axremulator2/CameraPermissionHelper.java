package com.example.axremulator2.Old_PCKGS.helpers;
import com.example.axremulator2.Old_PCKGS.helpers.ContextCompat;
import com.example.axremulator2.Old_PCKGS.helpers.ActivityCompat;
import android.app.Activity;
import android.content.Intent;
import static android.provider.Settings.System.getString;
import android.Manifest;
import android.graphics.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;
import com.example.axremulator2.R;

import android.content.pm.PackageManager;


import java.util.Set;

public class CameraPermissionHelper extends CameraManager.AvailabilityCallback {
    public String CameraId=null;CameraCharacteristics cameraCharacteristics=new CameraCharacteristics.Key<CameraId,CameraManager>();
    public ActivityCompat activityCompat;
    private static final String CAMERA_PERMISSION= Manifest.permission.CAMERA;
    public CameraDevice cameraDevice;
    private static final int CAMERA_PERMISSION_CODE=0;
    private String releaseCameraAndPreview(int CameraId,CameraManager cameraManager) {
        if(CameraId==0)return 0;//Initializing the CameraId
        while(CameraId!=0){//iterating through CameraID
            else CameraId-=CAMERA_PERMISSION_CODE;//Accessing the Camera Permission Dialog
        }return "Camera Released"+CameraId;}}//Printing the  Released Camera

    private Camera IsCameraOpen(String cameraId,CameraManager cameraManager) {//Camera Open Funct delcare
    cameraId=null;//Initializing the CameraId
    if(cameraId==null)return null;//printing Camera initial Val
    while(cameraId!=null){//iterating through CameraID
        else cameraId+=cameraManager.openCamera(cameraId);//Incrmenting Camera Id if Found
    } System.out.println(cameraId);//printing output
}




//starting Camera
    public void OnStartCamera(Camera camera,CameraManager cameraManager,String CameraId){
        super.OnStartCamera(camera,cameraManager,CameraId);
        Set<String> physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
        return cameraDevice.CameraDeviceSetup(CameraId);
    }

    public Boolean hasCameraPermission(Activity activity){
        return ContextCompat.checkSelfPermission(activity,CAMERA_PERMISSION)
                == PackageManager.PERMISSION_GRANTED;
    }
    public static void requestCameraPermisssion(Activity activity){
        activityCompat.requestPermissions(activity,new String[] {CAMERA_PERMISSION},CAMERA_PERMISSION_CODE);
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
    public static void CameraOpenSafe(Activity activity,String cameraId,Camera camera){
        cameraId=null;
        boolean isCameraOpen=false;//initilize Camera Opening
        try{//Declaring Camera Exceptions
            releaseCameraAndPreview();
            camera=IsCameraOpen(cameraId);
            isCameraOpen=(camera!=null);
        }
        catch(Exception e){//Carching The Camera Exceptions
            Log.e(getString(R.string.app_name),"Unable to Open the Camera");//printing the Camera Exceptions
            e.printStackTrace();//Printing the Sys Exceptions
        }
        return isCameraOpen;//printing the Camera Opening
    }


}
//        intent(intent);
//        intent.startActivity(intent);
