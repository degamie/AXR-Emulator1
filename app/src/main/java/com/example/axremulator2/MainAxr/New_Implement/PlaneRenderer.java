package com.example.axremulator2.Common.helpers;

import java.util.Vector;

public class PlaneRenderer {//Class Declare
    public PlaneRenderer planeRenderer;//Obj declare
    public Vector<Integer>3dPlane=new Vector<Integer>;//3dPlane vector declare
    public PlaneRenderer(PlaneRenderer planeRenderer,Vector<Integer>3dPlane){//Param Constr declare
        this.planeRenderer=planeRenderer;//Binding All the Obj
        this.3dPlane=3dPlane;
    }
}
