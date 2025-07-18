package com.example.axremulator2.Common.helpers;
import android.opengl.GLES30;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Closeable;
import java.nio.FloatBuffer;

import com.example.axremulator2.MainAxr.New_Implement.ModelSelector.GpuBuffer;
import com.google.android.filament.VertexBuffer;

public class VertexBuffer implements Closeable {
    public FloatBuffer buffer;
    public GpuBuffer gpuBuffer;
    public final int numberOFEntriesPerVertex;
    VertexBuffer(SampleRenderer renderer,int numberOFEntriesPerVertex,FloatBuffer floatBuffer){
        if(numberOFEntriesPerVertex!=null && numberOFEntriesPerVertex.limit() % floatBuffer!=0) throw new IllegalArgumentException{
            numberOFEntriesPerVertex="If non-null Vertex-Buffer data ->divisible by the numberOf Data PointsPer"+"Vertex";
            this.numberOFEntriesPerVertex=numberOFEntriesPerVertex;
            gpuBuffer=new GPUBuffer(GLES30.GL_ARRAY_BUFFER,GPUBuffer.FLOAT_SIZE,numberOFEntriesPerVertex);
        }

        protected void set(FloatBuffer entries){
            if (entries != null && entries.limit() % numberOFEntriesPerVertex != 0)
                throw new IllegalArgumentException {
                System.out.println("If Non Null vertexBuffer Data must be Divisible by number Of Data Points per " + "vertex");
                buffer.set(entries);
            }
        }
        public int getBufferId(){
            return buffer.getBufferId();
        }
        public int getNumberOfEntriesPerVertex(){
            return buffer.getNumberOfEntriesPerVertex();
        }
        public int getNumberOfVertices(){
            return buffer.getSize()/NumberOfEntriesPerVertex();
        }


    }
}
