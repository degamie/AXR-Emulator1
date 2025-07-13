package com.example.axremulator2.Common.helpers;

import static android.text.method.TextKeyListener.clear;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;

import androidx.graphics.opengl.FrameBuffer;

import javax.microedition.khronos.egl.EGLConfig;
import com.example.axremulator2.Common.helpers.SampleRenderer.Renderer;


@Getter
@Setter
@AllParamsConstructor
@NoParamsConstructor
public class SampleRenderer {
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    @Column(unqiue=true,nullable=false)
    int framebufferId;
    @Column(unqiue=false,nullable=true)
    public static final String LABEL=SampleRenderer.class.getSimpleName();
    @Column(unqiue=false,nullable=true)
    public AssetManager assetManager;
    @Column(unqiue=false,nullable=true)
    public static final int ViePortHeight=1;
    @Column(unqiue=false,nullable=true)
    public static final int ViePortWidth=1;
    @Column(unqiue=false,nullable=true)
    public   GLES30 gles30;
    @Column(unqiue=false,nullable=true)
    public Renderer renderer;
    @Column(unqiue=false,nullable=true)
    public int ViewPortWidth;
    @Column(unqiue=false,nullable=true)
    public int ViewPortHeight;

//    public String getRenderer(Renderer renderer){
//        return  renderer;
//    }

}
//    @SuppressLint("NotConstructor")
//    public void SampleRenderer(GLSurfaceView glSurfaceView, Renderer renderer, AssetManager assetManager){
//        this.assetManager=assetManager;
//        glSurfaceView.setPreserveEGLContextOnPause(true);
//        glSurfaceView.setEGLContextClientVersion(3);
//        glSurfaceView.setEGLConfigChooser(8,8,8,180);
//        GLES30 gles31 = gles30;
//        glSurfaceView.setRenderer(
//                new GLSurfaceView.Renderer( {
//                    @Override
//                    public void onSurfaceCreated(GLES30 gl30, EGLConfig eglConfig) {
//                        GLES30.glEnable(GLES30.GL_BLEND);
//                        GLES30.glGetError();
//                        renderer.onSurfaceCreated(SampleRenderer.this);
//                    }
//                )};
//    };
//        @Override
//        public void onSampleRendererr(GLES30 gles30){
//
//            clear(null);
//            renderer.onDrawFrame(SampleRenderer.this);
//                }
//}
//    public static interface Renderer{
//        public void onSurfaceCreated(SampleRenderer renderer);
//        public void onSurfaceChanged(SampleRenderer renderer);
//        public void onDrawFrame(SampleRenderer renderer);
//    }
//        AssetManager getassets(){
//            return assetManager;
//
//    }
//    private void useFrameBuffer(FrameBuffer frameBuffer){
//         int framebufferId;
//         int ViewPortWidth;
//         int ViewPortHeight;
//        if(frameBuffer==null){
//            framebufferId=0;
//            ViewPortWidth=this.ViewPortWidth;
//            ViewPortHeight=this.ViewPortHeight;
//        }
//            else{
//                framebufferId=frameBuffer.getFrameBufferId();
//                ViewPortWidth=frameBuffer.getViewPortWidth();
//                ViewPortHeight=frameBuffer.getHeight();
//            }
//            GLES30.glBindFramebuffer(GLES30.GL_FRAMEBUFFER,framebufferId);
//            GLError.maybeThrownException("Unbale to Find FrameBuffer ","glFindFrameBuffer");
//            GLES30.glViewport(0,0,ViewPortWidth,ViewPortHeight);
//        GLError.maybeThrownGLException("Unbale to Find Dimension's ViePort Settings ","glViewport");
//
//    }

//To ibe IMpemented

//                    @Override
//                    public void onSurfaceChanged( gl30, int i, int i1) {
//
//                    }

//                     @Override
//                    public void onDrawFrame(GLES30 gl30) {
//
//