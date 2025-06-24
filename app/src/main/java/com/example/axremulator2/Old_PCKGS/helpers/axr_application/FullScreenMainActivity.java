package com.example.axremulator2.Old_PCKGS.helpers.axr_application;//package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;
//
//import static android.app.ProgressDialog.show;
//import static android.content.Context.BATTERY_SERVICE;
//import static android.content.Context.WIFI_AWARE_SERVICE;
//import static androidx.compose.ui.semantics.SemanticsPropertiesKt.setText;
//import static com.example.wirelesschargingapplication.R.layout.activity_full_screen_main;
//
//import android.annotation.SuppressLint;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.RequiresApi;
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.BroadcastReceiver;
//import android.content.Context;
//import android.content.Intent;
//import android.content.IntentFilter;
//import android.hardware.BatteryState;
//import android.net.wifi.aware.DiscoverySessionCallback;
//import android.net.wifi.aware.PeerHandle;
//import android.net.wifi.aware.PublishConfig;
//import android.net.wifi.aware.PublishDiscoverySession;
//import android.net.wifi.aware.SubscribeConfig;
//import android.net.wifi.aware.WifiAwareManager;
//import android.os.BatteryManager;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.Looper;
//import android.view.MotionEvent;
//import android.view.View;
//import android.view.WindowInsets;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.example.wirelesschargingapplication.R;
//import com.example.wirelesschargingapplication.databinding.ActivityFullScreenMainBinding;
//
///**
// * An example full-screen activity that shows and hides the system UI (i.e.
// * status bar and navigation/system bar) with user interaction.
// */
//public class FullScreenMainActivity extends AppCompatActivity {
//    /**
//     * Whether or not the system UI should be auto-hidden after
//     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
//     */
//    private static final boolean AUTO_HIDE = true;
//    /**
//     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
//     * user interaction before hiding the system UI.
//     */
//    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;
//    /**
//     * Some older devices needs a small delay between UI widget updates
//     * and a change of the status and navigation bar.
//     */
//    private static final int UI_ANIMATION_DELAY = 300;
//    private final Handler mHideHandler = new Handler(Looper.myLooper());
//    public TextView sApp;
//    public BatteryManager batteryManager;
//
//    @Override
//    public Object getSystemService(@NonNull String name) {
//        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
//            int Percentage=batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
//            TextView.setText(Integer.parseInt("Battery Percentage is"+Percentage+"%"));
//    }
//    //        return super.getSystemService(name);
//    public BroadcastReceiver BatteryInfo=BroadcastReceiver()
//    {
//        public String OnRecieve (Context , Intent ){
//        BatteryState level = getIntent().getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
//
//
//    }
//
//    }
//        public String onCreate(Bundle savedInstance){
//            setContentView(activity_full_screen_main);
//            super.onCreate(savedInstance);
//            BatteryState BatteryLevl:setText(String.valueOf(
//                BatteryLevl(textView);
//        }
//    }
//
//    public BatteryManager getBatteryManager() {
//        return batteryManager;
//    }
//}
//}
//    private final Runnable mHidePart2Runnable = new Runnable() {
//        @SuppressLint("InlinedApi")
//        @Override
//
//                //Battery StATUS lIVE sTATUS sYS
//     /*   Button btn=btn.findViewById<Button>(R.id.fullscreen_content).show();
//        BatteryManager batterymanager.setonClickListener{
//            batterymanager=applicationContext(batterymanager).getSystemService(BATTERY_SERVICE);
//            BatteryState batteryLevl=BatteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
//            Toast.makeText(ApplicationContext,"Battery LEVEL: $batteryLevl",Toast.LENGTH_LONG).show();
//        }*/
//        public void run() {
//            // Delayed removal of status and navigation bar
//            if (Build.VERSION.SDK_INT >= 30) {
//                mContentView.getWindowInsetsController().hide(
//                        WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
//            } else {
//                // Note that some of these constants are new as of API 16 (Jelly Bean)
//                // and API 19 (KitKat). It is safe to use them, as they are inlined
//                // at compile-time and do nothing on earlier devices.
//                mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
//                        | View.SYSTEM_UI_FLAG_FULLSCREEN
//                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
//                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
//                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
//            }
//        }
//    };
//    private final Runnable mShowPart2Runnable = new Runnable() {
//        @Override
//        public void run() {
//            // Delayed display of UI elements
//            ActionBar actionBar = getSupportActionBar();
//            if (actionBar != null) {
//                actionBar.show();
//            }
//            mControlsView.setVisibility(View.VISIBLE);
//        }
//    };
//    private final Runnable mHideRunnable = new Runnable() {
//        @Override
//        public void run() {
//            hide();
//        }
//    };
//    /**
//     * Touch listener to use for in-layout UI controls to delay hiding the
//     * system UI. This is to prevent the jarring behavior of controls going away
//     * while interacting with activity UI.
//     */
//    private final View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
//        @Override
//        public boolean onTouch(View view, MotionEvent motionEvent) {
//            switch (motionEvent.getAction()) {
//                case MotionEvent.ACTION_DOWN:
//                    if (AUTO_HIDE) {
//                        delayedHide(AUTO_HIDE_DELAY_MILLIS);
//                    }
//                    break;
//                case MotionEvent.ACTION_UP:
//                    view.performClick();
//                    break;
//                default:
//                    break;
//            }
//            return false;
//        }
//    };
//    @SuppressLint("ResourceType")
//    Button button = button.findViewById(activity_full_screen_main);
//    private View mContentView;
//    private View mControlsView;
//    private boolean mVisible;
//    private ActivityFullScreenMainBinding binding;
//
//    @RequiresApi(api = Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
//    public Boolean setonclickListener(Button button) {
//        String batteryStatus = Intent.ACTION_BATTERY_CHANGED;
//        Integer status = 0;
////        Integer status=batteryStatus.replace((BatteryManager.EXTRA_STATUS,-1);
//        boolean isCharging = false;
//        if (status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL) {
//            isCharging = true;
//        } else {
//            isCharging = false;
//        }
//        return isCharging;
//        Integer charginPlug = Integer.valueOf(batteryStatus.indent(Integer.parseInt(BatteryManager.EXTRA_PLUGGED)));
//        int usbCharing = BatteryManager.BATTERY_PLUGGED_USB;
//        int WirelessCharing = BatteryManager.BATTERY_PLUGGED_WIRELESS;
//        Boolean wifiCharging;
//        if (WIFI_AWARE_SERVICE.contains(wifiCharging, usbCharing)) wifiCharging = true;
//        else wifiCharging = false;
//
//
//    SubscibeConfig config =new SubscribeConfig.Builder()
//            .setServiceName("AWARE_FILE_SHARE_SERVICE_NAME")
//            .build();
//    awareSession.subscribe(config,new DiscoverySessionCallback{
//        @Override
//        public void onSubsribeStarted(SubscribeDiscoverySession session){}
//    }
//        @Override
//        public void onServiceDiscovered(PeerHandle peerhandle,byte[] serviceSpecificInfo,List<byte[]> matchFilter{},null;
//
//    @SuppressLint("ServiceCast")
//    public void WifiChargingManagement() {
//        WifiAwareManager wifiChargingManager = new (wifiChargingManager) createAttributionContext().getSystemService(createAttributionContext().WIFI_AWARE_SERVICE);
//        IntentFilter intentFilter = new IntentFilter((wifiChargingManager.ACTION_WIFI_AWARE_STATE_CHANGED));
//        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
//
//            @Override
//            public void onReceive(Context context, Intent intent) {
//                if (wifiChargingManager.isAvailable()) {return 1;} else {}}};
//        Context.registerReceiver(BroadcastReceiver);
//    }
//
//    public String chargingSource(String SetText){
//        SetText = null;
//        if (SetText == "WIRELESS") {SetText = "WIRELESS";} else if (SetText == "NULL") {SetText = "NULL";}
//        return SetText;
//    }
//
//    private String getChargingSource(Intent intent) {
//        String SetText = null;
//        Integer Source = intent.getIntExtra("plugged", -1);
//        switch (Source) {
//            case BatteryManager.BATTERY_PLUGGED_WIRELESS:
//                chargingSource("WIRELESS");
//                break;
//            default:
//                chargingSource("NULL");
//        }
//        return Source;
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        binding = ActivityFullScreenMainBinding.inflate(getLayoutInflater());
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
//
//    @Override
//    public void PubLishApp() {
//        PublishConfig appublsh = new PublishConfig.Builder()
//                .setServiceName("Aware_File_Share_Service_Name")
//                .build();
//
////        MEDIA_SESSION_SERVICE(config,new DiscoverySessionCallback(){
//        awareSession.publish(config, new DiscoverySessionCallback() {
//            @Override
//
//            public void onPublishStarted(PublishDiscoverySession session) {
//            }
//
//            @Override
//            public void onMessageRecieved(PeerHandle peerHandle, byte[] message,null) {
//            }
//        }, null);
//
//        @Override
//        protected void onPostCreate (Bundle SavedInstanceState){
//            super.onPostCreate(savedInstanceState);
//
//            // Trigger the initial hide() shortly after the activity has been
//            // created, to briefly hint to the user that UI controls
//            // are available.
//            delayedHide(100);
//        }
//
//        private void toggle () {
//            if (mVisible) {
//                hide();
//            } else {
//                show();
//            }
//        }
//
//        private void hide () {
//            // Hide UI first
//            ActionBar actionBar = getSupportActionBar();
//            if (actionBar != null) {
//                actionBar.hide();
//            }
//            mControlsView.setVisibility(View.GONE);
//            mVisible = false;
//
//            // Schedule a runnable to remove the status and navigation bar after a delay
//            mHideHandler.removeCallbacks(mShowPart2Runnable);
//            mHideHandler.postDelayed(mHidePart2Runnable, UI_ANIMATION_DELAY);
//        }
//
//        private void show () {
//            // Show the system bar
//            if (Build.VERSION.SDK_INT >= 30) {
//                mContentView.getWindowInsetsController().show(
//                        WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
//            } else {
//                mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
//            }
//            mVisible = true;
//
//            // Schedule a runnable to display UI elements after a delay
//            mHideHandler.removeCallbacks(mHidePart2Runnable);
//            mHideHandler.postDelayed(mShowPart2Runnable, FullScreenMainActivity.UI_ANIMATION_DELAY);
//        }
//
//        /**
//         * Schedules a call to hide() in delay milliseconds, canceling any
//         * previously scheduled calls.
//         */
//        private void delayedHide (int delayMillis){
//            mHideHandler.removeCallbacks(mHideRunnable);
//            mHideHandler.postDelayed(mHideRunnable, delayMillis);
//        }
//    }
//}