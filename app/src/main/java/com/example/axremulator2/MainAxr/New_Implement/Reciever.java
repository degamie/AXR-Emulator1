package com.example.wirelesschargingapplication;

import com.example.axremulator2.Model.BatteryReciever;

public class Reciever extends BatteryReciever {
    public Reciever reciever;
    public Reciever(Reciever reciever){
        this.reciever=reciever;
    }
    public String getReciever(Reciever reciever){
        return reciever;
    }
}
