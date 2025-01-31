//package com.example.axremulator2.Common.helpers;
//
//import android.opengl.GLES30;
//
//import androidx.graphics.opengl.FrameBuffer;
//
//import com.google.android.filament.Texture;
//import com.example.axremulator2.Common.helpers.SampleRenderer;
//public class frameBuffer {
//    public static final String TAG= FrameBuffer.class.getSimpleName();
//    public final int [] frameBufferId={0};
//    public Texture colorTexture;
//    public Texture DepthTexture;
//    public final int width=-1;
//    public final int height=-1;
//    public FrameBuffer(SampleRenderer sampleRenderer,int width,int height){
//        try{
//            colorTexture=new Texture(sampleRenderer,Texture.Target.TEXTURE_2D,false);
//            DepthTexture=new Texture(sampleRenderer,Texture.Target.TEXTURE_2D,Texture.Wrap_Mode.Clamp_To_EDGE,false);
//
//            GLES30.glBindTexture(GLES30.GL_TEXTURE_2D,DepthTexture.getTextureId());
//            GLError.maybethrowException("Unable to find Depth Texture","glBindTexture");
//            GLES30.glGenBuffers(1,frameBufferId,0);
//        }
//        resize(width,height);
//    }
//    public void onDrawFrame(Mesh mesh,frameBufferId){
//        onDrawFrame(Mesh,frameBufferId)=0;
//    }
//    public String FrameBuffer(){
//        getColorTexture();
//        return colorTexture;
//    }
//}
////DepthTexture=new Texture(
////                    SampleRenderer renderer,
////                    Texture.Target.TARGET_2D,
////                    Texture.WrapMode.CLAMP_TO_EDGE,
////                    false);
