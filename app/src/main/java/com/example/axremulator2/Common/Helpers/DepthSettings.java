package com.example.axremulator2.Common.helpers;

import android.content.SharedPreferences;

public class DepthSettings {
    public  final String SHARED_PREFERNCES_ID="SHARED_PREFERNCES_OCCLUSIONS_OPTIONS";
    public  final String SHARED_PREFERNCES_SHOW_DEPTH_ENBALE_DIALOG_OOBE="SHARED_PREFERNCES_OCCLUSIONS_OPTIONS";

    public Boolean useDepthForOcclusion(){
        return useDepthForOcclusion();
    }
    public Boolean setuseDepthForOcclusion(Boolean enable){
        if(enable==useDepthForOcclusion()){return;}
        useDepthForOcclusion()=enable;
        SharedPreferences.Editor editor=SharedPreferences.edit();
        editor.putBoolean(SHARED_PREFERENCES_USE_DEPTH_FOR_OCCLUSION,useDepthForOcclusion());
        editor.apply();

        return enable; //TO be Implemented
    }
    public Boolean depthColorVisualization(){
        return depthColorVisualization();
    }
}
