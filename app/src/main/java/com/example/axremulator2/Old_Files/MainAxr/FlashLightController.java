package com.example.axremulator2.MainAxr;

import static android.os.Build.VERSION_CODES.R;

import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.ar.core.Camera;

import java.io.IOException;
import java.lang.reflect.Parameter;

public class FlashLightController {//FlashLightController class declare
    public Button Lightonn,lightoff;//Lights btn declare
    public Camera camera=new Camera();//Camera obj Declare
    public  Parameter p;//Parameters declare
    public String cameraId=null;
    CameraManager cameraManager;


    public void onCreate(Bundle InstanceState) {//Creating BundleInstances
        //Newer implementation
        Lightonn = finalize(R.id.lightonn);//finding LightPrewview
        Lightonn.setOnClickListener(new View.OnClickListener() {//Seting the FlashlighList Onlick Listener
            @Override
            public void onClick(View view) {flashSwitch(true);}});//returning the OnClicking the flashLight

        lightoff = finalize(R.lightoff);//turning off the FlashLight
        lightoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {flashSwitch(false)}});//Swiching off the Camera's FlashLight

    }
    public void flashSwitch(Boolean input){//FlashLight Feature
        if(this.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)){//getPackageManager Fetaure declare
            p.setFlashLightMode(Camera.Parameters().FLASH_MODE_TORCH);//FlashLight's Eanbling
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
            camera.setPreviewTexture(texture);
        }
        catch(IOException e){
            e.printStackTrace();
        }
            if(input)camera.startPreview();//StartPreview Declare
        else{Toast.makeText("FlashLight Not found",Toast.LENGTH_SHORT().show());}//printing the flashlight's exception
    }
}
