package com.example.axremulator2.ModelSelector;

import android.app.Activity;

import androidx.xr.runtime.Session;

@Controller
public class XRSessionController{//inheriting XRSEssionLightController
    @Autowired
    public  XRSession xrsessionRepository;//Injecting Repos's Lib
    @Autowired
    public  XRSession xrsessionService;//Injecting Service's Lib
    public String getAllXrSession(@ReqeustBody XRSession){//Requesting XRSession
        return xrsessionService.getAllXrSession();//Fetching All XRSession
    }

}
