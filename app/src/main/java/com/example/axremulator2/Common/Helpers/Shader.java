package com.example.axremulator2.Common.helpers;

import android.content.res.AssetManager;
import android.opengl.GLES30;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;

import com.example.axremulator2.Common.helpers.SampleRenderer;


public class Shader implements Closeable{
    private static final String TAG=Shader.class.getSimpleName();
    public Enum BlendFactor{
        ZERO(GLES30.GL_ZERO),
        ONE(GLES30.GL_ONE),
        SRC_COLOR(GLES30.GL_SRC_COLOR);
    }
    final int GlesEnum;
    private BlendFactor(String glesEnum){
        this.GlesEnum=glesEnum;
    }
    public Shader createFromAssets(SampleRenderer renderer,String fragmentShaderFileName,Map<String,String>defines)throws IOException {
        AssetManager assetManager= renderer.getassets();
        return new Shader();
    }
    public Shader setDepthWrite(String depthWrite){
        this.depthWrite=depthWrite();

    }
    public Shader setCultFace(String CultFace){
            this.CultFace=CultFace;
            return this;
    }

}
