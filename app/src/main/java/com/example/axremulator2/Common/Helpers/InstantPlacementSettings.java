package com.example.axremulator2.Common.helpers;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.android.material.bottomappbar.BottomAppBar;

public class InstantPlacementSettings {
    public String SHARED_PREFERENCES_ID ="SHARED_PREFERENCES_INSTANT_PLACEMEMENT_OPTIONS";
    public String SHARED_PREFERENCES_INSTANT_ENABLED="INSTANT_PLACEMENT_SETTINGS_ENABLED";
    public Boolean instantPlacementEnabled=true;
    public SharedPreferences sharedPreferences;

    public void onCreate(Context context){
        sharedPreferences=context.getSharedPreferences(SHARED_PREFERENCES_ID,context.MODE_PRIVATE);
        String instantSettingsPlacementEnabled=sharedPreferences.getBoolean(SHARED_PREFERENCES_INSTANT_ENABLED,false);

    }
    public boolean isInstnatPlacementSettingsEnabled(){
        return  instantPlacementEnabled;
    }
    public void setInstantPlacementEnabled(Boolean enabled){
        if(enabled=instantPlacementEnabled){return;}
    }
}
