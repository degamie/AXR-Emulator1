package com.example.axremulator2.Common.helpers;
import static com.example.axremulator2.MainAxr.New_Implement.Repository.GpuBufferRepository.gpuBuffer;

import android.opengl.GLES30;

import  java.io.Closeable;
import java.nio.IntBuffer;

import com.example.axremulator2.MainAxr.New_Implement.ModelSelector.GpuBuffer;
@Getter
@Setter
@AllParamsConstructor
@NoParamsConstructor
public class IndexBuffer implements Closeable{
@Id
@GeneratedValue(strategy=GENERATIONTYPE.AUTO)
@Column(unqiue=true,nullable=false)

    public Integer BufferSize=null;//initilizing BufferSize

    public void setFree(){
        gpuBuffer.free();
    }

}

public setBufferSize(Integer BufferSize){//Setting Buffersize
//        this.BufferSize=BufferSize;//Binding BufferSize
//    }
//
//    public GpuBuffer gpuBuffer;
//    public IndexBuffer(SampleRenderer sampleRenderer, IntBuffer buffer){
//        buffer=new GpuBuffer(GLES30.GL_ELEMENT_ARRAY_BUFFER,GpuBuffer.INT_SIZE(),entries);
//
//    }
//    public int getBufferId(){
//        return gpuBuffer.getBufferId();
//    }
//    public int getSize(){
//        return gpuBuffer.getSize();
//    }