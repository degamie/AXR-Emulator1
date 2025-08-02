package com.example.axremulator2.MainAxr.New_Implement.Repository;

import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.TextView;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BroadCastReciever;

import java.util.List;

@Repository

public interface BatteryRecieverRepository  extends JpaRepository<BatteryReciever,String> {//BatteryReciever class inherititing BroadCastReciever

    public List<BatteryReciever> saveAll();
    public String saveAllByNetworkInfo(String networkInfo);
}

