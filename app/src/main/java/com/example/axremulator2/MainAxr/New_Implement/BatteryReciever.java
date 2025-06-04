package com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application;

import static androidx.compose.ui.semantics.SemanticsPropertiesKt.setText;

import android.content.Context;
import android.content.Intent;
import android.hardware.BatteryState;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.TextView;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryWireless;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BroadCastReciever;

public class BatteryReciever  extends BroadCastReciever {//BatteryReciever class inherititing BroadCastReciever
    //Obj and Variables Declare
    public Context context;
    public Integer mBatteryLevel;
    public TextView textView;
    public String  networkInfo=null;
    public ConnectivityManager connectivityManager = null;
    public BatteryReciever batteryReciever;
    public void setmBatteryLevel(Integer mBatteryLevel){this.mBatteryLevel=mBatteryLevel;}//Binding BatteryLevel
    public BatteryReciever(){//Default Const
        return;
    }

    public String getBatterylevel(int Batterylevel){//Fetchinh Batterylevel
        return Batterylevel;
    }
    public String onInit(connectivityManager,networkInfo){
        if(networkInfo==null)return null;
        while(networkInfo!=null){
            else if(networkInfo>null)networkInfo=connectivityManager.getAllNetworkInfo();
            else networkInfo=connectivityManager.unregisterNetworkCallback();
        }return networkInfo;
    }
}
    public class BatteryReciever extends BatteryWireless{//Inheriting BatteryWireless Class
    public BatteryReciever(TextView textView){
        this.textView=textView;
    }
    public String networkReciever(Context context){
        ConnectivityManager connectivityManager=context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetwork();
        return networkInfo!=null && networkInfo.isConnected();
    }
    public Integer batteryChanged(mBatteryLevel){
        if(mBatteryLevel==0)return 0;
        while(mBatteryLevel!=0){
                else if(mBatteryLevel>0)mBatteryLevel++;
            else mBatteryLevel=0;
        }
        return mBatteryLevel;
    }



    @Override
    public String onReciever(Context context, Intent intent) {
        return super.onReciever(context, intent);
        int BatteryPercentage=intent.getIntExtra("level",0);
        TextView textView.setText(BatteryPercentage+"%");

    }
    }

