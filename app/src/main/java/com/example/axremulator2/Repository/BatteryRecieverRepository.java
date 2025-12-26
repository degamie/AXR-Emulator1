package com.example.axremulator2.MainAxr.New_Implement.Repository;

import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.TextView;

import com.example.axremulator2.Model.BatteryReciever;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BroadCastReciever;

import java.util.List;

//WID(26/12/2025)
@Repository

public interface BatteryRecieverRepository  extends JpaRepository<BatteryReciever,String> {//BatteryReciever class inherititing BroadCastRecieve
    public List<BatteryReciever> saveAll();
    public List<BatteryReciever>findAll();
    public String findAllByContext(Context context);
    public String saveAllByNetworkInfo(String networkInfo);
    public String findAllByNetworkInfo(String networkInfo);
    public String saveAllByBatteryLevel(String BatteryLevel);
    public String saveAllmBatteryLevel();
    public String saveAllByTextViewInfo(TextView textView);
    public void findBybatterylevel(String mBatterylevel);
}

