package com.example.axremulator2.MainAxr.New_Implement.Repository;

import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.TextView;

import com.example.axremulator2.Model.BatteryReciever;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BroadCastReciever;

import java.util.List;

@Repository
//WID(12/12/2025)( Sarthak Mittal(AKADegamieign))

public interface BatteryRecieverRepository  extends JpaRepository<BatteryReciever,String> {//BatteryReciever class inherititing BroadCastReciever
    public String findAllByBatteryLevel(String BatteryLevel);
    public List<BatteryReciever> saveAll();
    public List<BatteryReciever>findAll();
    public String saveAllByNetworkInfo(String networkInfo);
    public String findAllByNetworkInfo(String networkInfo);
    public String saveAllByBatteryLevel(String BatteryLevel);

//    public String saveAllByNetworkInfo(String network);
    public String saveAllConnectivityManager(ConnectivityManager connectivityManager);
    public String findAllByConnectivityManager(ConnnectivityManager connectivityManager);
    public List<BatteryReciever> updateByConnectivityManager(ConnnectivityManager connectivityManager);//Updating By Connectivity Manager
//    public String saveAllmBatteryLevel()
}

