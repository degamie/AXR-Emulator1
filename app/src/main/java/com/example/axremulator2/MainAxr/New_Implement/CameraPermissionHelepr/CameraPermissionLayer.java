package com.example.axremulator2.MainAxr.CameraPermissionHelepr;

import static androidx.core.app.ActivityCompat.startActivityForResult;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.MediaStore;

import com.google.ar.core.Camera;

public class CameraPermissionLayer extends Camera {
    public int COuntdownAeModelatch=0;
    public String ArCharacterstics;
    public CameraPermissionLayer cameraPermissionLayer;
    public Camera camera;

}
public class CameraPermissionLayer implements CameraInterface {

    public String OnRequestPermisission(String reqCode,String Permission,Boolean grantPermission){
        super.OnRequestPermisission(reqCode,Permission,grantPermission);
        if(reqCode==Camera.CAMERA_PERMISSION_CODE){
            if(grantPermission[0]== PackageManager.PERMISSION_GRANTED){
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,CAMERA_REQUEST_CODE);
            }
        }
        return reqCode;
    }

    public String cameraAeAutoCharacter(){
        try {}
    }
//            ArCharacterstics=Camee

