package com.example.axremulator2.axr_application;
import com.example.axremulator2.axr_application.MainBatteryManagement;
public class VirtualObjectMapper extends MainBatteryManagement{
    public int mBatterylevel=0;//initilize var
    public VirtualObjectMapper virtualObjectMapper;//obj declare
    public String getBatterylevel(int mBatterylevel){//Fetching Battery level
        return mBatterylevel;
    }
    public VirtualObjectMapper(VirtualObjectMapper virtualObjectMapper){//parameterzied constr
        this.virtualObjectMapper=virtualObjectMapper;
    }
    public Integer OnInit(){//init method declare

        if(mBatterylevel==0)return 0;//printing 0
        while(mBatterylevel!=0){//traversing through mBatterylevel
            else if(mBatterylevel>=0)mBatterylevel+=virtualObjectMapper;//incr mBatterylevel
        }return virtualObjectMapper;//Printing virtualObjectMapper
    }
}
