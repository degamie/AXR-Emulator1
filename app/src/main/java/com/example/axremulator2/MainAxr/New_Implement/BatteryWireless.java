package com.example.axremulator2.Old_PCKGS.helpers.axr_application;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wirelesschargingapplication.R;

import javax.annotation.processing.Generated;

@Getter
@Setter
@AllParamsContructor
@NoParamsContructor
public class BatteryWireless extends AppCompatActivity {
    @Id
            @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    @Column(unique=true,nullable=false)
    TextView textWifiInfo;
    @Column(unique=true,nullable=false)
    Button btnInfo;
    public String gettextWifiInfo(TextView textWifiInfo){//Fetching textWifiInfo
        return textWifiInfo;
    }
    @Override

    }
}
