package com.example.axremulator2.Common.helpers;

import android.opengl.GLES30;

import java.io.Closeable;
import java.nio.FloatBuffer;

import com.google.android.filament.VertexBuffer;

public class VertexBuffer implements Closeable {
    public GpuBuffer gpuBuffer;
    public final int numberOFEntriesPerVertex;
    VertexBuffer(SampleRenderer renderer,int numberOFEntriesPerVertex),FloatBuffer floatBuffer{
        if(numberOFEntriesPerVertex!=null && numberOFEntriesPerVertex.limit() % floatBuffer!=0) throw new IllegalArgumentException(
           "If non-null Vertex-Buffer data ->divisible by the numberOf Data PointsPer"+"Vertex";
        );{
            this.numberOFEntriesPerVertex=numberOFEntriesPerVertex;
            gpuBuffer=new GPUBuffer(GLES30.GL_ARRAY_BUFFER,GPUBuffer.FLOAT_SIZE,numberOFEntriesPerVertex);
        }



    }
}
