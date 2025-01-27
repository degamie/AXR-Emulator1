//package com.example.axremulator2.Common.helpers;
//
//import com.example.axremulator2.MainActivity;
//import static android.app.ProgressDialog.show;
//import static android.content.Context.CAMERA_SERVICE;
//import static android.content.pm.PackageManager.FEATURE_CAMERA_ANY;
//
//import static com.example.axremulator2.R.id.FlashLightEnableOn;
//
//import android.content.pm.PackageManager;
//import android.graphics.Camera;
//import android.hardware.camera2.CameraAccessException;
//import android.hardware.camera2.CameraManager;
////import android.health.connect.datatypes.units.Length;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.CompoundButton;
//import android.widget.Switch;
//import android.widget.Toast;
//import android.widget.ToggleButton;
//
//import com.example.axremulator2.MainActivity;
//import com.example.axremulator2.R;
////
////import java.util.List;
//public class FlashLightController extends CameraPermissionHelper{
//    public MainActivity mainActivity;
//    public Long CameraId=null;
//    public CameraPermissionHelper cameraPermissionHelper;
//    public DisplayRotationHelper displayRotationHelper;
//    public Object surfaceView;
//    public TapHelper tapHelper;
//    public ToggleButton toggle_flashlightbtn= toggle_flashlightbtn.findViewById(FlashLightEnableOn);
//    public CameraManager cameraManager;
//    public String getCameraid;
////    public Switch  flashableLightSwitch=R.id.surfaceview(FlashLightEnableOn);
//    public Integer getCameraid(Integer CameraId) throws CameraAccessException {
//            if(CameraId!=null) {CameraId=CameraManager.getCameraIdList(CameraId);}
//            else {
//                CameraId=-1;
//        }
//            return CameraId;
//    }
//
//    public int setContentView(int contentView) {
//        this.setContentView(contentView);
//        return contentView;
//    }
//    protected void OnCreate(Bundle SavedInstanceState,Switch flashableLightSwitch){
////    Switch flashableLightSwitch;
//
//    CameraManager cameraManager=cameraManager.openCamera(cameraPermissionHelper.this);
//    flashableLightSwitch=R.id.surfaceview(FlashLightEnableOn);
//    if(cameraPermissionHelper.hasCameraPermission(FEATURE_CAMERA_ANY || (PackageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)))){
//            displayRotationHelper=new DisplayRotationHelper(this);
//        }
//        else {
//            Toast.makeText(mainActivity,CAMERA_SERVICE+"Device without Camera",Toast.LENGTH_SHORT);
//        }
//        setContentView(R.layout.activity_main_axractivity);
//        surfaceView=R.id.findById(R.id.surfaceview);
//        displayRotationHelper=new DisplayRotationHelper(displayRotationHelper);
//        TapHelper tapHelper;
//        flashableLightSwitch.setEnabled(true);
//        Toast FlashLightCamera=Toast.makeText(mainActivity.this,"Camera has FlashLight",Toast.LENGTH_SHORT).show();
//        Switch finalFlashableLightSwitch = flashableLightSwitch;
//        flashableLightSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (compoundButton.isChecked()) {
//                    try {
//                        cameraManager.setTorchMode("0", false);
//                    } catch (CameraAccessException e) {
//                        e.printStackTrace();
//                        finalFlashableLightSwitch.setText("Flash Tuned ONN");
//                    }
//                }
//                    else {
//                        finalFlashableLightSwitch.setText("Flash Tuned OFF");
//                    }
//
//                }
//
//        });
//    }
//
//    //Exceptional Handling
//
//    public void TorchLightToggleFlash(View view){
//        if(toggle_flashlightbtn.isChecked()){
//            try{
//                cameraManager.setTorchMode(getCameraid,true){
//                    Toast flashLightIsTunredOnn = Toast.makeText(mainActivity.this, "FlashLight is Tunred Onn");
//                    int lengthShort =Toast.LENGTH_SHORT;
//                }
//            }
//            catch (CameraAccessException e){
//                e.printStackTrace();
//            }
//        }
//      else{
//          try{
//                cameraManager.setTorchMode(getCameraid,false){
//                  Toast flashLightIsTunredOff=Toast.makeText(mainActivity.this,"FlashLight is Tunred Off");
//                  int lengthShort = Toast.LENGTH_SHORT;
//                }
//            }
//            catch (CameraAccessException e){
//                e.printStackTrace();
//            }
//        }
//    }
//}