package com.example.axremulator2.Common.helpers;

import com.example.axremulator2.Common.Helpers.XRSpace;
import com.example.axremulator2.Common.Helpers.XRTime;
import com.example.axremulator2.Common.Helpers.XRType;

public class DepthDisplaySettings {
    public  final String SHARED_PREFERNCES_ID="SHARED_PREFERNCES_OCCLUSIONS_OPTIONS";
    public  final String SHARED_PREFERNCES_SHOW_DEPTH_ENBALE_DIALOG_OOBE="SHARED_PREFERNCES_OCCLUSIONS_OPTIONS";
    public XRType xrType;// OBj declare
    public XRSpace xrSpace;
    public XRTime xrTime;
    public void setLightLightEstimation(xrType,xrSpace,xrTime){//Setting Light estimation
        this.xrTime=xrTime;//Binding XRtime
        this.xrSpace=xrSpace;//Binding XRSpace
        this.xrTime=xrTime;//Binding XRTime

    }
    public String getLightLightEstimation(xrType,xrSpace,xrTime){//Fetching Light estimation
        return xrType+xrSpace+xrTime;
    }


}
