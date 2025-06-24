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
    public String XRSessionStart(int XRSession,Boolean XRSession1){//XRSessionStart func Declare
        if(XRSession==0)return 0;//priting its Intial Val
        XRSession1=true;//Declareing its True Val
        while(XRSession1!=null){//Iteraitng
            if(XRSession>0){//
                XRSession++;//Incremneting XRSession
            }else XRSession=0;//XRSession Original Val
        }
        return XRSession;//Printing XRSession
    }
    public XRSession(Session session){//Parametrized Constructor
        this.session=session;
    }


}
