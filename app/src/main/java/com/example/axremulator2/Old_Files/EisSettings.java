package com.example.axremulator2.Common.helpers;

import android.content.Context;
import android.content.SharedPreferences;

public class EisSettings {
    public static  final String SHARED_PREFERENCES_ID=" SHARED_PREFERENCES_EIS_SETTINGS_OPTIONS";
    public static  final String SHARED_PREFERENCES_EIS_ENABLED="eis_enabled";
    public boolean eis_enabled=false;
    public Integer enable=0;
    public SharedPreferences sharedPreferences;
    public void onCreate(Context context){
        sharedPreferences=context.getSharedPreferences(SHARED_PREFERENCES_ID,context.MODE_PRIVATE);
    }
    public boolean is_enabled(){
        return eis_enabled;
        eis_enabled=enable;
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean(SHARED_PREFERENCES_EIS_ENABLED,eis_enabled);
        editor.apply();
    }

}
