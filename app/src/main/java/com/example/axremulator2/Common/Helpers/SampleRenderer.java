package com.example.axremulator2.Common.helpers;

import static android.text.method.TextKeyListener.clear;

import android.content.res.AssetManager;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;

import androidx.graphics.opengl.FrameBuffer;

import javax.microedition.khronos.egl.EGLConfig;

public class SampleRenderer {
    public static final String LABEL=SampleRenderer.class.getSimpleName();
    public AssetManager assetManager;
    public static final int ViePortHeight=1;
    public static final int ViePortWidth=1;
    public   GLES30 gles30;
    Renderer renderer;
    public int ViewPortWidth;
    public int ViewPortHeight;

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
}
    public static interface Renderer{
        public void onSurfaceCreated(SampleRenderer renderer);
        public void onSurfaceChanged(SampleRenderer renderer);
        public void onDrawFrame(SampleRenderer renderer);
    }
        AssetManager getassets(){
            return assetManager;

    }
    private void useFrameBuffer(FrameBuffer frameBuffer){
         int framebufferId;
         int ViewPortWidth;
         int ViewPortHeight;
        if(frameBuffer==null){
            framebufferId=0;
            ViewPortWidth=this.ViewPortWidth;
            ViewPortHeight=this.ViewPortHeight;
        }
            else{
                framebufferId=frameBuffer.getFrameBufferId();
                ViewPortWidth=frameBuffer.getWidth();
                ViewPortHeight=frameBuffer.getHeight();
            }

    }

}
//To ibe IMpemented

//                    @Override
//                    public void onSurfaceChanged( gl30, int i, int i1) {
//
//                    }

//                     @Override
//                    public void onDrawFrame(GLES30 gl30) {
//
//