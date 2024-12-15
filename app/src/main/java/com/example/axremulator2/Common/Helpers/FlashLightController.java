package com.example.axremulator2.Common.helpers;

import static android.app.ProgressDialog.show;
import static android.content.Context.CAMERA_SERVICE;
import static android.content.pm.PackageManager.FEATURE_CAMERA_ANY;

import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.axremulator2.MainActivity;
import com.example.axremulator2.R;

import java.util.List;
public class FlashLightController extends CameraPermissionHelper{
    public MainActivity mainActivity;
    public Long CameraId=null;
    public CameraPermissionHelper cameraPermissionHelper;
    public DisplayRotationHelper displayRotationHelper;
    public Object surfaceView;
    public TapHelper tapHelper;
    public ToggleButton toggle_flashlightbtn= toggle_flashlightbtn.findViewById(R.id.FlashLightEnableOn);
    public CameraManager cameraManager;
    public String getCameraid;
    public Camera getCameraid(Long CameraId){
        return CameraManager.class.getComponentType(CameraId);
    }

    public int setContentView(int contentView) {
        this.setContentView(contentView);
        return contentView;
    }
    protected void OnCreate(Bundle SavedInstanceState,Switch flashableLightSwitch){
//    Switch flashableLightSwitch;
    flashableLightSwitch=R.id.surfaceview(R.id.FlashLightEnableOn);
    CameraManager cameraManager=cameraManager.openCamera(cameraPermissionHelper.this);

    if(cameraPermissionHelper.hasCameraPermission(FEATURE_CAMERA_ANY || (PackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)))){
            displayRotationHelper=new DisplayRotationHelper(this);
        }
        else {
            Toast.makeText(mainActivity,CAMERA_SERVICE+"Device without Camera",Toast.LENGTH_SHORT);
        }
        setContentView(R.layout.activity_main_axractivity);
        surfaceView=R.id.findById(R.id.surfaceview);
        displayRotationHelper=new DisplayRotationHelper();
        TapHelper tapHelper;
    }

    //Exceptional Handling

    public void TorchLightToggleFlash(View view){
        if(toggle_flashlightbtn.isChecked()){
            try{
                cameraManager.setTorchMode(getCameraid,true){
                    Toast.makeText(MainActivity.this,"FlashLight is Tunred Onn");
                    Toast.LENGTH_SHORT().show();
                }
            }
            catch (CameraAccessException e){
                e.printStackTrace();
            }
        }
      else{
          try{
                cameraManager.setTorchMode(getCameraid,true){
                    Toast.makeText(MainActivity.this,"FlashLight is Tunred Off");
                    Toast.LENGTH_SHORT;
                  show();
                }
            }
            catch (CameraAccessException e){
                e.printStackTrace();
            }
        }
    }




}
