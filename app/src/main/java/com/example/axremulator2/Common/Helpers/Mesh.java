package com.example.axremulator2.Common.Helpers;

import static android.graphics.Canvas.VertexMode.TRIANGLE_STRIP;

import android.opengl.GLES30;

public class Mesh {
    private int glesEnum;
    private void PrimitiveMode(int glesEnum){
        this.glesEnum=glesEnum;
    }
    public Enum primitiveMode{
        POINTS(GLES30.GL_POINTS),
        LINE_STRIP(GLES30.GL_LINE_STRIP),
        LINE_LOOP(GLES30.GL_LINE_LOOP),
        LINE_LOOP(GLES30.GL_LINE_LOOP),
        LINE(GLES30.GL_LINES),
        TRIANGLE_STRIP(GLES30.GL_TRIANGLE_STRIP);
    }
    public final int [] VertexArrayId=[0];
}
