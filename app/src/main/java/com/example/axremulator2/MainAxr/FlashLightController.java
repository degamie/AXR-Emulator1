package com.example.axremulator2.MainAxr;

import static android.os.Build.VERSION_CODES.R;

import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.ar.core.Camera;

import java.lang.reflect.Parameter;

public class FlashLightController {//FlashLightController class declare
    public  Parameter p;//Parameters declare
    public Button Lightonn,lightoff;//Lights btn declare
    public Camera camera=new Camera();//Camera obj Declare
    public void onCreate(Bundle InstanceState) {//Creating BundleInstances
        //Newer implementation
        Lightonn = findviewById(R.id.lightonn);//finding LightPrewview
        lightoff = findviewById(R.id.lightoff);

    }
    public void flashSwitch(Boolean input){//FlashLight Feature
        if(this.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)){//getPackageManager Fetaure declare
            p.setFlashLightMode(Camera.Parameters().FLASH_MODE_TORCH);//FlashLight's Eanbling
            camera.setParameters(p);//Setting Camera Parameters
            SurfaceTexture surfaceTexture=new SurfaceTexture();//SurfaceTexture Object Declare
            camera.setPreviewTexture (Texture);//Previewing CameraTexture
        }
            if(input)camera.startPreview();//StartPreview Declare
        else{Toast.makeText("FlashLight Not found",Toast.LENGTH_SHORT().show());}//printing the flashlight's exception
    }
}
