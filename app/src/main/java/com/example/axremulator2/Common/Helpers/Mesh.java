package com.example.axremulator2.Common.Helpers;

import static android.graphics.Canvas.VertexMode.TRIANGLE_STRIP;
import static android.system.Os.close;

//import static com.google.ar.core.ai.t;

import android.opengl.GLES30;

import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;

public class Mesh {
    private int glesEnum;
    public Enum PrimitiveMode{
        POINTS(GLES30.GL_POINTS),
                LINE_STRIP(GLES30.GL_LINE_STRIP),
                LINE_LOOP(GLES30.GL_LINE_LOOP),
                LINE_LOOP(GLES30.GL_LINE_LOOP),
                LINE(GLES30.GL_LINES),
                TRIANGLE_STRIP(GLES30.GL_TRIANGLE_STRIP);
    }


    public final PrimitiveMode primitiveMode;
    public final IndexBuffer indexBuffer;
    public final VertexBuffer vertexBuffer;
    private void PrimitiveMode(int glesEnum){
        this.glesEnum=glesEnum;
    }
    public Mesh(indexBuffer,vertexBuffer,primitiveMode){
        this.indexBuffer=indexBuffer;
        this.vertexBuffer=vertexBuffer;
        this.primitiveMode=primitiveMode;

        if(vertexBuffer==null || VertexBuffer.Length==0){]
        try{
            GLES30.glBindVertexArray(1,VertexArrayId,0);
            GLError.maybeThrowGLException("AxR Emualtor's Object's GUI Not Found");

        }
        catch(Throwable T){
            close();
            throw T;
        }
    }
    public final int [] VertexArrayId=[0];


//To Be Implemented
    private void LINE(int glLines) {
    }

    private void POINTS(int glPoints) {

    }

    private void LINE_LOOP(int glLineLoop) {

    }
}