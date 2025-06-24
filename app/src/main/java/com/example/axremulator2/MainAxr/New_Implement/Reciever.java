package com.example.wirelesschargingapplication;

import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatteryReciever;

public class Reciever extends BatteryReciever {
    public Reciever reciever;
    public Reciever(Reciever reciever){
        this.reciever=reciever;
    }
    public String getReciever(Reciever reciever){
        return reciever;
    }
}
