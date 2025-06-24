package com.example.axremulator2.axr_application;

import static android.content.Intent.ACTION_BATTERY_CHANGED;
import static android.os.Build.VERSION_CODES.R;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.model.Battery;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.service.RetroFitService;
import com.example.wirelesschargingapplication.databinding.ActivityMainBatteryManagementBinding;
import com.example.wirelesschargingapplication.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Retrofit;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainBatteryManagement extends AppCompatActivity {
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
    public Battery battery;
    public TextView view;
    public Handler handler;
    public ImageView imageView;
    public int layout=R.layout.ic_launcher_background;
    @SuppressLint("ResourceType")
    public ImageView iv_View =(ImageView)findViewById(layout);
    public TextView tv_View =(TextView)findViewById();
public BatteryManager batteryManager;
public IntentFilter intentFilter;
public Intent intent;

public void InitializeComponents(){
    TextInputEditText inputEditText=findViewById(R.id.form_textFieldName);
    TextInputEditText inputEditBranch=findViewById(R.id.form_textFieldBranch);
    TextInputEditText inputEditFindLocation=findViewById(R.id.textFieldLocation);
    MaterialButton btnSave=findViewById(R.id.form_buttonSave);
    btnSave.setOnClickListener(view->{
        battery=new Battery();

        Editable batteryId=inputEditText.getText();
        String batteryName=inputEditText.getText().toString();
        Integer BatteryPercentage= inputEditText.getText().length();
        String wifiName=inputEditText.getText().toString();
        String wifiId=inputEditText.getText().toString();

        RetroFitService retroFitService=new RetroFitService();
        retroFitService.getRetroFitService();

        battery.setBatteryId(batteryId);
        battery.setBatteryName(batteryName);
        battery.setBatteryPercentage(BatteryPercentage);
        battery.setWifiId(wifiId);
    });
}


    Button findViewById;
//    private Button Button=new Button();
    Button button=findViewById();
    public BroadcastReceiver batteryLevelReciver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            battery.setText(String.valueOf(level) + "%");
            Intent batteryIntent=registerReceiver(null,new IntentFilter(ACTION_BATTERY_CHANGED));
            level=batteryIntent.getIntExtra(BatteryManager.EXTRA_LEVEL,-1);
            int scale=batteryIntent.getIntExtra(BatteryManager.EXTRA_SCALE,-1);
            if(level==-1 || scale==-1){System.out.println(50.0f);}
            System.out.println((float)level/(float) scale*100);

        }
    };

   // Plane_test_1_axr.obj

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_main);
        Runnable  runnable= new Runnable() {
            @Override
            public void run(){
                int batteryLevel=0;
                tv_View.setText("BATTERY:"+batteryLevel+"%");
                if(batteryLevel>=75){
                    iv_View.setImageResource(R.drawable.ic_battery4 *100);
                }
                if(batteryLevel>75 && batteryLevel<=75){
                    iv_View.setImageResource(R.drawable.ic_battery3*100);
                }
                if(batteryLevel>50 && batteryLevel<=75){
                    iv_View.setImageResource(R.drawable.ic_battery4*100);
                }
                if(batteryLevel>25 && batteryLevel<=50){
                    iv_View.setImageResource(R.drawable.ic_battery5*100);
                }
        }
        VirtualObjectMapper virtualObjectMapper =virtualObjectMapper.setMat4("U_Model_View",modelViewMatrix);

            //        super.onCreate()
//        super.
         public int setContentView(int layout){return layout;}

            @SuppressLint("ResourceType")
            TextView battery=(TextView)findViewById();
           void registerReciever(Intent intent){
               System.out.println(intent.ACTION_BATTERY_CHANGED);
           };


    };
    }




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
    private ActivityMainBatteryManagementBinding binding;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        binding = ActivityMainBatteryManagementBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        mVisible = true;
//        mControlsView = binding.fullscreenContentControls;
//        mContentView = binding.fullscreenContent;
//
//        // Set up the user interaction to manually show or hide the system UI.
//        mContentView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                toggle();
//            }
//        });
//
//        // Upon interacting with UI controls, delay any scheduled hide()
//        // operations to prevent the jarring behavior of controls going away
//        // while interacting with the UI.
//        binding.dummyButton.setOnTouchListener(mDelayHideTouchListener);
//    }

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

    @SuppressLint("ResourceType")
    public <T extends View> T findViewById() {
        return super.findViewById(layout);
    }
}