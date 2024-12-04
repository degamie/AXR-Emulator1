package com.example.axremulator2.Common.Helpers;

import android.content.res.AssetManager;

public class SampleRenderer {
    public static final String LABEL=SampleRenderer.class.getSimpleName();
    public AssetManager assetManager;
    public static final int ViePortHeight=1;
    public static final int ViePortWidth=1;
    public void Renderer(){}//To ibe IMpemented
    public static interface Renderer{
        public static void onSurfaceCreated(SampleRenderer renderer){};
        public static void onSurfaceChanged(SampleRenderer renderer);
        public static void onDrawFrame(SampleRenderer renderer);
    }
        AssetManager getassets(){
            return assetManager;

//        public static void onSurface(SampleRenderer renderer);
    }
}
