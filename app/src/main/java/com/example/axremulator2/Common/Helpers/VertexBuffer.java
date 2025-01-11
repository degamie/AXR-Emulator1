package com.example.axremulator2.Common.helpers;
import com.example.axremulator2.Common.helpers.SampleRenderer;

import android.media.Image;
import android.opengl.GLES30;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Closeable;
import java.nio.FloatBuffer;

import com.google.android.filament.VertexBuffer;

public class VertexBuffer implements Closeable {
    public FloatBuffer buffer;
    public GpuBuffer gpuBuffer;
    public Boolean useOCclusion;
    public float aspectRatio;
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
    public void updateCameraTextureDepth(Image image){
    GLES30.glBindTexture(GLES30.GL_TEXTURE_2D,CameraTexture.getTextureId());
    GLES30.glTexImage2D(GLES30.GL_TEXTURE_2D);
    GLES30.GL_RG8,
    image.getWidth();
    image.getHeight(0),
        GLES30.GL_RG8,
        GLES30.GL_UNSIGNED_BYTE;
    image.getPlanes()[0].getBuffer();
    if(useOCclusion){
        aspectRatio=(float) image.getWidth()/(float) image.getHeight();
        OcclusionShader.setFloat("U_Depth_aspect_ratio",aspectRatio);
        ;
    }
    }
}
