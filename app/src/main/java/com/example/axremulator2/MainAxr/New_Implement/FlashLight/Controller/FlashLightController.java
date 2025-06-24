package com.example.axremulator2.MainAxr;

import static android.hardware.camera2.CameraMetadata.FLASH_MODE_TORCH;
import static android.os.Build.VERSION_CODES.R;

import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.ar.core.Camera;

import java.io.IOException;
import java.lang.reflect.Parameter;
import  android.hardware.Camera.Parameters;

public class FlashLightController {//FlashLightController class declare
    public SurfaceTexture texture;
    public Button Lightonn,lightoff;//Lights btn declare
    public Camera camera=new Camera();//Camera obj Declare
    public String getCamera(Camera camera){
        return camera;
    }
    public Parameters p;//Parameters declare
    public String cameraId=null;
    CameraManager cameraManager;
    CameraDevice cameraDevice;
    public void EnableExtenrnalFlashLightAENode(){
        if(Build.VERSION.SDK_INT>=28 && isExternalFlashAemodeAvailable()){
            try{
                CaptureRequest.Builder builder=camera.createCaptureRequest(cameraDevice.TEMPLATE_PREVIEW);
            }
        }
    }
    public void onCreate(Bundle InstanceState) {//Creating BundleInstances
        //Newer implementation
        Lightonn = finalize(R.Id.lightonn);//finding LightPrewview
        Lightonn.setOnClickListener(new View.OnClickListener() {//Seting the FlashlighList Onlick Listener
            @Override
            public void onClick(View view) {flashSwitch(true);}});//returning the OnClicking the flashLight

        lightoff = finalize(R.id.lightoff);//turning off the FlashLight
        lightoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {flashSwitch(false)}});//Swiching off the Camera's FlashLight

    }
    public void flashSwitch(Boolean input){//FlashLight Feature
        if(this.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)){//getPackageManager Fetaure declare
            p.setFlashLightMode(camera.getDisplayOrientedPose(),FLASH_MODE_TORCH);//FlashLight's Eanbling
            camera.setParameters(p);//Setting Camera Parameters
            SurfaceTexture surfaceTexture=new SurfaceTexture();//SurfaceTexture Object Declare
            camera.setPreviewTexture (Texture);//Previewing CameraTexture
        }
        try{
            cameraId= cameraManager.getCameraIdList()[0];
            else Camera camera1=camera.open();
            camera.Parameters p= camera1.getParameters();
            p.setFlashMode(torch);
            camera1.setParameters(p);
            SurfaceTexture surfaceTexture=new SurfaceTexture(0);

        }
        try{
            camera.getImageIntrinsics(texture);
        }
        catch(IOException e){
            e.printStackTrace();
        }
            if(input)camera.getTrackingState(true);//StartPreview Declare
        else{Toast.makeText("FlashLight Not found",Toast.LENGTH_SHORT().show());}//printing the flashlight's exception
    }
}
