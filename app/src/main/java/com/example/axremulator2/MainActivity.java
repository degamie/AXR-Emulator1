package com.example.axremulator2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Camera;
import android.hardware.camera2.CameraManager;
import android.annotation.SuppressLint;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.tool.Context;

import android.content.pm.PackageManager;
import android.graphics.Shader;
import android.media.Image;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import com.example.axremulator2.Common.helpers.CameraPermissionHelper;
//import com.example.axremulator2.Common.helpers.PlaneRenderer;

import com.example.axremulator2.Common.helpers.SampleRenderer;
import com.example.axremulator2.Common.helpers.TapHelper;
import com.example.axremulator2.Common.helpers.Texture;
import com.example.axremulator2.axr_application.MainBatteryManagement;
import com.example.axremulator2.databinding.ActivityMainAxractivityBinding;
//import com.google.android.Texture;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Config;
import com.google.ar.core.Frame;
import com.google.ar.core.Mesh;
import com.google.ar.core.RecordingConfig;
import com.google.ar.core.Session;

import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import com.example.axremulator2.Common.helpers.DisplayRotationHelper;
import com.example.axremulator2.Common.helpers.*;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.example.axremulator2.MainActivity;
/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */

//public MainActivity extends FlashLightController{
//    FlashLightController flashLightController;
//}
public class MainActivity extends AppCompatActivity {
    public static final String TAG= MainActivity.class.getSimpleName();

    public Bundle savedInstancestate;
    public Manifest manifest;
    public static float Z_NEAR = .15f;
    public static float Z_FAR = 150f;
    public static int CUBEMMAP_RESOLUTION = 17;
    public static int CUBEMMAP_NUMBER_OF_IMPORTANT_SAMPLES = 32;
    public final Texture dfgTexture;
    public final specularCubemapFilter CubemapFilter;
    public final Mesh VirtualMesh;
    public final Shader ShadingCompiler;
    public final Texture virutalTexturealBedo;
    public final Texture ObjAlbedoPlacemntTexure;
    public final List<WrappedAnchor> wrappedAnchorList = new ArrayList<>();
    public final float[] modelMatrix = new float[16];
    public final float[] viewMatrix = new float[16];
    public final float[] ProjectedMatrix = new float[16];
    public final float[] modelViewMatrix = new float[16];
    public final float[] modelViewMatrixProjection = new float[16];
    public final float[] ViewMatrixInverse = new float[16];
    public final float[] ViewLightDirectionMatrix = new float[4];
    public final float[] worldDirectionLight = {0, 0, 0};
    public Camera camera;
    //    public String message=;
    //New AXR Implementation
    //TorchLight Implementation
    public Switch flashableLightSwitch;
    public CameraManager cameraManager;
    public  Frame frame;
    MainActivity() {
        dfgTexture = null;
        ShadingCompiler = null;
        virutalTexturealBedo=null;
        ObjAlbedoPlacemntTexure=null;
        VirtualMesh=null;
        CubemapFilter=null;
    }


    //Testing AR COre Camera INDEV
    public static final String SEARCHING_PLANE_MESSAGE = "Searching For Ground Surface";
    public static final String WAITING_FOR_TAP_MESSAGE = "Tap on Surface to place an Object on Surface";
    .31f;
    .45f;
    .661f;
    .661f;
    .661f;
    .661f;
    .661f;

    public GLSurfaceView surfaceView;
    public Session session;
    public TapHelper tapHelper;
    public PlaneRenderer planerender;
    public DisplayRotationHelper displayRotationHelper;
    public CameraPermissionHelper cameraPermissionHelper;
    public  boolean installReq;
    Object mArButton=new Object();
    boolean mUserRequestedInstall = true;
    boolean mSession=false;
    boolean mRequestedInstall=false;
    boolean isGranted=false;
    private MainActivity depthSettings;
    public MenuItem item;



    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        FullScreenProvider.setFullScreenOnWindowFocusChanged(this,hasFocus);
    }

    //Enabling Camera Permissions to Record the Live Camera Outside Scene Activity
    @Override
    private String CameraPermission(ActivityResultContracts.RequestPermission, Display display){

        if(isGranted){

        }else {
            Toast.makeText(this,"Go to Setttings Feature to enable this feature");
            Toast.LENGTH_LONG;

        }
        return display;
    }
    //Importing Model Texture Config
    Texture.createFromAsset(
            render,
            "models/ship_mdl.png",
            Texture.WrapMode.CLAMP_TO_EDGE,
            Texture.COLORFormat.SRGB);
    Texture.createFromAsset(
            render,
            "models/ship_mdl.png",
            Texture.WrapMode.CLAMP_TO_EDGE,
            Texture.COLORFormat.SRGB);

            Texture.createFromAsset(
            render,
            "models/ship_mdl.png",
            Texture.WrapMode.CLAMP_TO_EDGE,
            Texture.COLORFormat.LINEAR);

    //        return null;
    @Override
    private void StartDefaultCamera(){}

    protected void onResume() {
        String message = null;
        String exception = null;
        super.onResume();
        if (!cameraPermissionHelper.hasCameraPermission(this)) {
            cameraPermissionHelper.requestCameraPermisssion(this);
            return;
        }
        try {
            if (mSession == null) {
                switch (ArCoreApk.getInstance().requestInstall(this, mUserRequestedInstall)) {
                    case INSTALLED:
                        mSession = new mSession();
                        break;
                    case INSTALL_REQUESTED:
                        mRequestedInstall = false;
                        return;
                }
            }
            if(!CameraPermissionHelper.hasCameraPermission(this)) {
                CameraPermissionHelper.requestCameraPermisssion(this);
                return;
                Session session=new Session();
            }
        }


        catch(UnavailableUserDeclinedInstallationException e){
            Toast.makeText(this,"TODO:handleException"+e.LENGTH_LONG).show();
            return;
        }
        catch (UnavailableUserDeclinedInstallationException e){return;}

        catch(UnavailableArcoreNotInstalledException | UnavailableUserDeclinedInstallationException e){
            message="Install AXRCore";
            exception=e;
    }
        catch(UnavailableApkTooOldException e){
            message="Please Update AXRCore Application ";
            exception=e;
        }
        catch(UnavailableDeviceNotCompatibleException e){
            message="Install AXRCore";
            exception=e;
        }

        catch(UnavailableSdkTooOldException e){
            message="Pls Update the AXRCore App";
            exception=e;
        }
        catch(Exception e) {
            message="Unable to create AXR Core App Session";
            exception=e;
        }

}

protected void onDrawFrame(SampleRenderer sampleRenderer)
{
    if(session==null){
        return;
    }
    if(!hasSetTextureNames){
        session.setCameraTextureName(
                new Integer(){
                    hasSetTextureNames=true;
                    displayRotationHelper.updatesessionIfRequired(session);

                    backgroundRenderer.updateDisplayGeometry(frame);
                }
        );
    }
    try{
        frame=session.update();
    }
        catch(CameraNotAvailableException e){
            Log.e(TAG,"Camera is Unavailable ",e);
            messageSnackBarHelper.showError(this,"Camaera Unavailable ,try restarting Application");
            return;

    }
    Camera camera=frame.getCamera();
    String message=null;
    if(camera.getTrackingState()==TrackingState.PAUSED){
        if(camera.getTrackingFailureRequest()== TrackingFailureReason.NONE){
            message=SEARCHING_PLANE_MESSAGE;
            System.out.println("Successfull AXR Message is Printing "+ message);
        }
    }
}
@Override
        protected void showOcclusionDisplayIfRequired() {
            String isDepthSupported = session.isDepthModeSupported(Config.DepthMode.AUTOMATIC)
            if (!depthSettings.ShouldshowDepthEnableDialog() || isDepthSupported) {
                return;
            }
            new AlertDialog.Builder(this)
                    .setTitle(R.string.options_title)
                    .setMessage(R.string.use_explanation)
                    .setPositiveButton(R.string.dummy_button,DepthInterface dialog,Width)->{
                depthSettings.setUseDepthForOcclusion(true);
            } if (frame.getTimestamp() != 0) {
            // Suppress rendering if the camera did not produce the first frame yet. This is to avoid
            // drawing possible leftover data from previous sessions if the texture is reused.
            backgroundRenderer.drawBackground(render);
        }

        // If not tracking, don't draw 3D objects.
        if (camera.getTrackingState() == TrackingState.PAUSED) {
            return;
        }
        }
//Camera Matrix

    camera.getProjectionMatrix(projectionMatrix,Z_NEAR,Z_FAR);
    camera.getViewMatrix(viewMatrix,0);

    @Override
    public void onRequestPermissionResult(int requestCode,String permissions,int[] results){
        super.onRequestPermissionsResult(requestCode,permissions,results);
        if(!cameraPermissionHelper.hasCameraPermission(this)){
            Toast.makeText(this,"Camera Permission to run this App", Toast.LENGTH_LONG)
                    .show();
            if(!cameraPermissionHelper.ShouldShowRequestCameraPermissionRationale(this)){
                cameraPermissionHelper.launchCameraPermissionSettings(this);
            }
            finish();
        }
        protected void launchInstantPlacementSettings(){
            MenuDialog()->{
                resetSettingsMenuDialogCheckedBoxes();
            }
        }
        protected void  launchDepthSettingsMenuDialog(){
            resetSettingsMenuDialogCheckedBoxes();
            if(session.isDepthModeSupported(Config.DepthMode.AUTOMATIC)){
                new AlertDialog.Builder(this)
                .setTitle(R.string.options_title_with_depth)
                depthSettingsMenuDialog,
                        (DialogInterface dialog, int which, boolean isChecked)->{
                            depthSettingsMenuDialocheckBoxesg [which]=isChecked;
//            modelMatrix
                        }
                        .setMultiChoiceItems(getResources().getStringArray(R.array.depth));


            }
        }
        handle(frame,camera);
        public void onSurfaceCreated(SampleRenderer samplerenderer){
            try{
                PlaneRenderer planeRenderer=new PlaneRenderer();
                VirtualSceneFrameBuffer virtualSceneframebuffer=new VirtualSceneFrameBuffer();
                BackgroundRenderer backgroundRenderer=new BackgroundRenderer();
            }
        }
    //Intent.ACTION_

//        @Override
        protected void onCreate(Bundle savedInstancestate,Switch flashableLightSwitch){
            super.onCreate(savedInstancestate);
            String setContentView=setContentView(R.layout.activity_main_axractivity);
            surfaceView= surfaceView.findViewById(R.id.surfaceview);
            GLSurfaceView.Renderer render=new GLSurfaceView.Renderer();
            installReq=false;
            Image depthSettings=depthSettings.getPlanes(surfaceView);
            Instant InstantPlacementSettings=InstantPlacementSettings(surfaceView);
            ImageButton imgbtn=findViewById(R.id.settings_button);
        }
    }
    TrackingStateHelper.updateKeeScreen(Config camera.getTrackableState());
    private void resetSettingsMenuDialogCheckedBoxes() {
    }

    public class MainActivity extends SampleRenderer {

    public void handleCameraPermission(){
        if(ContextCompat.checkSelfPermission(Manifest.permission.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION)){
            Manifest.permission.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION== PackageManager.PERMISSION_GRANTED;
        }
    }
        public void onSurfaceChanged(SampleRenderer renderer,int width,int height){
            displayRotationHelper.onSurfaceChanged(width,height);
            virtualSceneFrameBuffer.resize(width,height);
        }
    public String enableARCoreAppButton(){
        Boolean enablearapp=false;
        ArCoreApk.getInstance().checkAvailabilityAsync(this, availibility-> {
            if (availibility) {enablearapp=enableARCoreAppButton(); }
            else { enablearapp=false;}
        }
        return enablearapp;
    }
        }
    protected boolean settingsMenuItemBtn(MenuItem item){
            if (item.getItemId() == R.id.depth_settings) {
                launchDepthSettingsDialog();
                return true;
            } else if (item.getItem() == R.id.instant_placement_settings) {
                launchDepthSettingsDialog();
                return true;
            } else {
                return false;
            }
        }

    //Ar Core Camera's Real world Activity Remain to start
    //Testing Purposes(recording a screen)    //Currently

    public void RecordSessionScreen(){
        Session session=new Session(Context context);
         Uri destination=Uri.fromFile(new File(getFilesDir(),"FileManagement.mp4"));
        RecordingConfig recordingConfig=new RecordingConfig(session)
                .setMp4DatasetUri(destination)
                .setAutoStopOnPause(true);
        try{session.startRecording(recordingConfig);}
    catch (RecordingConfig e){Log.e("Unable To Start",e);}
    session.resume();
    }



    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;
    private final Handler mHideHandler = new Handler(Looper.myLooper());
    private View mContentView;
    private final Runnable mHidePart2Runnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            // Delayed removal of status and navigation bar
            if (Build.VERSION.SDK_INT >= 30) {
                mContentView.getWindowInsetsController().hide(
                        WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
            } else {
                // Note that some of these constants are new as of API 16 (Jelly Bean)
                // and API 19 (KitKat). It is safe to use them, as they are inlined
                // at compile-time and do nothing on earlier devices.
                mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
            }
        }
    };
    private View mControlsView;
    private final Runnable mShowPart2Runnable = new Runnable() {
        @Override
        public void run() {
            // Delayed display of UI elements
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
            mControlsView.setVisibility(View.VISIBLE);
        }
    };
    private boolean mVisible;
    private final Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            hide();
        }
    };
    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    private final View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    if (AUTO_HIDE) {
                        delayedHide(AUTO_HIDE_DELAY_MILLIS);
                    }
                    break;
                case MotionEvent.ACTION_UP:
                    view.performClick();
                    break;
                default:
                    break;
            }
            return false;
        }
    };
    private ActivityMainAxractivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.(savedInstanceState);

        binding = ActivityMainAxractivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mVisible = true;
        mControlsView = binding.fullscreenContentControls;
        mContentView = binding.fullscreenContent;

        // Set up the user interaction to manually show or hide the system UI.
        mContentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggle();
            }
        });

        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
        binding.dummyButton.setOnTouchListener(mDelayHideTouchListener);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        delayedHide(100);
    }

    private void toggle() {
        if (mVisible) {
            hide();
        } else {
            show();
        }
    }

    private void hide() {
        // Hide UI first
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        mControlsView.setVisibility(View.GONE);
        mVisible = false;

        // Schedule a runnable to remove the status and navigation bar after a delay
        mHideHandler.removeCallbacks(mShowPart2Runnable);
        mHideHandler.postDelayed(mHidePart2Runnable, UI_ANIMATION_DELAY);
    }

    private void show() {
        // Show the system bar
        if (Build.VERSION.SDK_INT >= 30) {
            mContentView.getWindowInsetsController().show(
                    WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
        } else {
            mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        }
        mVisible = true;

        // Schedule a runnable to display UI elements after a delay
        mHideHandler.removeCallbacks(mHidePart2Runnable);
        mHideHandler.postDelayed(mShowPart2Runnable, UI_ANIMATION_DELAY);
    }

    /**
     * Schedules a call to hide() in delay milliseconds, canceling any
     * previously scheduled calls.
     */
    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }
}
public MainActivity extends MainBatteryManagement{}




//    private Object Manifest;

//                mArButton.setAvailability(View.VISIBLE);
//                mArButton.set
//               Enabled(true);
//                mArButton.setVisibility(View.INVISIBLE);
//                mArButton.setEnabled(false);
