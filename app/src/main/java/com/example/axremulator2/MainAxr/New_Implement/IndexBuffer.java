package com.example.axremulator2.Common.helpers;
import android.opengl.GLES30;

import  java.io.Closeable;
import java.nio.IntBuffer;

import com.example.axremulator2.Common.helpers.SampleRenderer;
import com.example.axremulator2.Common.helpers.GpuBuffer;
public class IndexBuffer implements Closeable{
    public Integer BufferSize=null;//initilizing BufferSize
    public setBufferSize(Integer BufferSize){//Setting Buffersize
        this.BufferSize=BufferSize;//Binding BufferSize
    }

    public GpuBuffer gpuBuffer;
    public IndexBuffer(SampleRenderer sampleRenderer, IntBuffer buffer){
        buffer=new GpuBuffer(GLES30.GL_ELEMENT_ARRAY_BUFFER,GpuBuffer.INT_SIZE(),entries);

    }
    public int getBufferId(){
        return gpuBuffer.getBufferId();
    }
    public int getSize(){
        return gpuBuffer.getSize();
    }
    public void setFree(){
        gpuBuffer.free();
    }

}
