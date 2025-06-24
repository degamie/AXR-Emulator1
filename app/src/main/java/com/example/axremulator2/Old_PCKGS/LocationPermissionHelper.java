//package com.example.axremulator2.Common.helpers;
//
//import android.app.Activity;
//import android.content.pm.PackageManager;
//
//import androidx.core.app.ActivityCompat;
//import androidx.core.content.ContextCompat;
//
//public class LocationPermissionHelper {
//    public final Integer LOCATION_PERMISSION_HELPER=1;
//    public boolean hasFineLocation(Activity activity){
//        return ContextCompat.checkSelfPermission(activity,LOCATION_PERMISSION_HELPER)== PackageManager.PERMISSION_GRANTED;
//    }
//    public boolean shouldShowPermisssionRequestRationale(Activity activity){
//        return ActivityCompat.shouldShowRequestPermissionRationale(activity,LOCATION_PERMISSION_HELPER);
//    }
//}
