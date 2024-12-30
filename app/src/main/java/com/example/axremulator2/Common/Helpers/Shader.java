package com.example.axremulator2.Common.helpers;

import android.opengl.GLES30;

import java.io.Closeable;

public class Shader implements Closeable{
    private static final String TAG=Shader.class.getSimpleName();
    public Enum BlendFactor{
        ZERO(GLES30.GL_ZERO)
        ONE(GLES30.GL_ONE),
    SRC_COLOR(GLES30.GL_SRC_COLOR);
    }
    final int GlesEnum;
    private BlendFactor(String glesEnum){
        this.GlesEnum=glesEnum;
    }

}
