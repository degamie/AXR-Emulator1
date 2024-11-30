package com.example.axremulator2;

import static java.lang.reflect.Modifier.*;

import android.annotation.SuppressLint;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.Toast;

import com.example.axremulator2.Common.CameraPermissionHelper;
import com.example.axremulator2.databinding.ActivityMainAxractivityBinding;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.RecordingConfig;
import com.google.ar.core.Session;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

import java.io.File;
import java.lang.reflect.Modifier;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainAXRActivity extends AppCompatActivity {
    public CameraPermissionHelper cameraPermissionHelper;
    Object mArButton=new Object();
    boolean mUserRequestedInstall = true;
    boolean mSession=false;
    boolean mRequestedInstall=false;
    boolean isGranted=false;
//    private Object Manifest;

    show();

    //Enabling Camera Permissions to Record the Live Camera Outside Scene Activity
    @Override
    private String CameraPermission(ActivityResultContracts.RequestPermission){

        if(isGranted){

        }else {
            Toast.makeText(this,"Go to Setttings Feature to enable this feature");
            Toast.LENGTH_LONG;
       
        }
        return Display;
    }
//        return null;
    @Override
    private void StartDefaultCamera(){}
    protected void onResume(){
        super.onResume();
        if(!cameraPermissionHelper.hasCameraPermission(this)){cameraPermissionHelper.requestCameraPermisssion(this);return;}
        try{
            if(mSession==null){
                switch(ArCoreApk.getInstance().requestInstall(this,mUserRequestedInstall)){
                    case INSTALLED:
                        mSession=new mSession();
                        break;
                    case INSTALL_REQUESTED:
                        mRequestedInstall=false;
                        return;
                }
            }
        }
        catch(UnavailableUserDeclinedInstallationException e){
            Toast.makeText(this,
                    "TODO:handleException"+e.LENGTH_LONG).show();
            return;
        }
        catch (UnavailableUserDeclinedInstallationException e){return;}
    }
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

    //Intent.ACTION_

    public void onCreate(){
        mArButton=CameraPermissionHelper.handleCameraPermission();
        Modifier.align(Alignment.ButtonCenter);
        String Text="Take Video";
        //Intent.ACTION_

    }

    public void handleCameraPermission(){
        if(ContextCompat.checkSelfPermission(Manifest.permission.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION)){
            this.Manifest.Permission.camera== PackageManager.PERMISSION_GRANTED;
        }
    }

    public String enableARCoreAppButton(){
        Boolean enablearapp=false;
        ArCoreApk.getInstance().checkAvailabilityAsync(this, availibility-> {
            if (availibility) {enablearapp=enableARCoreAppButton(); }
            else { enablearapp=false;}
        }
        return enablearapp;
    }

    //Ar Core Camera's Real world Activity Remain to start
    //Testing Purposes(recording a screen)    //Currently

    public void RecordSessionScreen(){
        Session session=new Session(Context);
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
        super.onCreate(savedInstanceState);

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
//                mArButton.setAvailability(View.VISIBLE);
//                mArButton.set
//               Enabled(true);
//                mArButton.setVisibility(View.INVISIBLE);
//                mArButton.setEnabled(false);
