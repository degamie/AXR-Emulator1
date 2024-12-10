package com.example.axremulator2.Common.Helpers;

import static android.text.method.TextKeyListener.clear;

import android.content.res.AssetManager;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class SampleRenderer {
    public static final String LABEL=SampleRenderer.class.getSimpleName();
    public AssetManager assetManager;
    public static final int ViePortHeight=1;
    public static final int ViePortWidth=1;
    public   GLES30 gles30;
    Renderer renderer;
    public void SampleRenderer(GLSurfaceView glSurfaceView,Renderer renderer,AssetManager assetManager){
        this.assetManager=assetManager;
        glSurfaceView.setPreserveEGLContextOnPause(true);
        glSurfaceView.setEGLContextClientVersion(3);
        glSurfaceView.setEGLConfigChooser(8,8,8,180);
        glSurfaceView.setRenderer(
                new GLSurfaceView.Renderer() {
                    @Override
                    public void onSurfaceCreated(GLES30 gl30, EGLConfig eglConfig) {
                        GLES30.glEnable(GLES30.GL_BLEND);
                        GLError.maybeThrownError("Failed toe Enable Blending","glEnable");
                        renderer.onSurfaceCreated(SampleRenderer.this);
                    }
                }
        @Override
        public void onSampleRendererr(GLES30 gles30){

            clear(null,0f,0f,0f,0f);
            renderer.onDrawFrame(SampleRenderer.this);

        }
        );
}//To ibe IMpemented

//                    @Override
//                    public void onSurfaceChanged( gl30, int i, int i1) {
//
//                    }

//                     @Override
//                    public void onDrawFrame(GLES30 gl30) {
//
//
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
