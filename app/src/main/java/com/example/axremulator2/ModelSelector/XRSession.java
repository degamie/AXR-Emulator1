package com.example.axremulator2.ModelSelector;

import android.app.Activity;

import androidx.xr.runtime.Session;

public class XRSession extends Activity {//XR Session inheriting Activity
    public Session session;//Session obj declare
    public XRSession xrSession;//XRSession obj declare

    public  int XRSession=Session.create();//Creaing XRSession
    public XRSession(){//Default Constructor
        return ;
    }
    public XRSession(Session session){//Parametrized Constructor
        this.session=session;
    }


}
