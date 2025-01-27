package com.example.axremulator2.Old_PCKGS.helpers.axr_application;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wirelesschargingapplication.R;

public class BatteryWireless extends AppCompatActivity {
    TextView textWifiInfo;
    Button btnInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_main);
        textWifiInfo=(textViewInfo) findViewById(R.id.idText);
        btnInfo=(Button) findViewById(R.id.idBtm);
    }
    public void getWifiInfo(View view){
        WifiManager wifiManager=(WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo=wifiManager.getConnectionInfo();
        int ip=WifiInfo.getIpAddress();
        String macAddress=WifiInfo.getMacAddress();
        String bssId=WifiInfo.getBSSID();
        int rssid=wifiInfo.getRssi();
        String linkSpeed=WifiInfo.getLinkSpeed();
        int ssid=WifiInfo.getSSID();
        int networkId=WifiInfo.getNetworkId();
    }
}
