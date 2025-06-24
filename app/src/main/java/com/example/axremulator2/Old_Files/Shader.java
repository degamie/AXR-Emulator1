package com.example.axremulator2.Common.helpers;

import android.content.res.AssetManager;
import android.opengl.GLES30;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;

import com.example.axremulator2.Common.helpers.SampleRenderer;


public class Shader implements Closeable{
    public Boolean depthLevel;
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
    public Shader setDepthLevel(Boolean depthLevel){
        this.depthLevel=depthLevel;
        return this;
    }
    public Shader setDepthWrite(String depthWrite){
        this.depthWrite=depthWrite();

    }
    public Shader setCultFace(String CultFace){
            this.CultFace=CultFace;
            return this;
    }
    public Shader setBlned(BlendFactor rgbBlend,BlendFactor destrgbBlend,BlendFactor destAlphaBlend){
        this.rgbBlend=rgbBlend;
        this.destrgbBlend=destAlphaBlend;
        this.destAlphaBlend=destAlphaBlend;
        return this;
    }
    public <Uniform> void setTexture(String name, String texture, String location){
        location=getUniformLocation(name);
        Uniform uniform=(Uniform).get(texture);
    }
    public Shader vect2(String name,float[] val){
        if(val.length!=2){
            throw new IllegalArgumentException("Array's value must be 2 ");
        }
    }
    public Shader vect3(String name,float[] val){
        if(val.length!=3){
            throw new IllegalArgumentException("Array's value must be 3");
        }
    }
    public Shader vect4(String name,float[] val){
        if(val.length!=4){
            throw new IllegalArgumentException("Array's value must be 4");
        }
    }


}
