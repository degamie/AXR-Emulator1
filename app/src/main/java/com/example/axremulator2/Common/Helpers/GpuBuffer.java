package com.example.axremulator2.Common.helpers;

import static java.lang.reflect.Array.set;

import android.opengl.GLES30;
import android.util.Log;

import java.nio.Buffer;

public class GpuBuffer {
    private static String TAG=GpuBuffer.class.getSimpleName();
    private final int  capacity=0;
    private final int  size=0;
    private final int  bufferId=0;
    public int INT_SIZE=4;
    public int FLOAT_SIZE=4;
    private  int  target;
public final int numberOfBytesPerEntry= 0;
    public GpuBuffer(target, int numberofBytesPerEntry, Buffer entries){
        if(entries!=null){
            if(!entries.isDirect()){
                throw new IllegalArgumentException("if non-null entriesBuffer must be direct Buffer");
            }
            if(entries.limit()==0){
                entries=null;
            }
            this.target=target;
            this.numberOfBytesPerEntry=numberofBytesPerEntry;

        if(entries==null){this.size=0;this.capacity=0;}
        else {
            this.size=entries.limit();
            this.capacity=entries.limit();
        }
        try{
            GLES30.glBindVertexArray(0);
            GLError.maybeHTrowGLException("Failed to Throw Unbinding Vertex Array","glBIndVertexArray");
            GLES30.glGenBuffers(1,bufferId,0);
            GLError.maybeHTrowGLException("Failed to Unbind The Genederated Buffers" ,"glGenBuffera");
            GLES30.glBindBuffer(target,bufferId[0]);
            GLError.maybeHTrowGLException("Failed to Throw Buffer Object","glBindBuffer");

        }
        }
        public set(Buffer buffer){
            if(entries==null || entries.limit()==0){
                entries=0;
                return ;
                if(entries==null || !entries.limit()==0){
                    int size=0;
                    return;
                }
                if(entries.isDirect()){
                    throw new IllegalArgumentException("If non null RuntimeEntries(Buffer Occurs)its a Direct Buffer");
                }
                GLES30.glBindBuffer(target,bufferId[0]);
                GLError.maybeHTrowGLException("Binding Vertex Groups Not Found!","glBufferId");

            }
        }
//                if(entries==null || !entries.limit()==0)


        public void free(){
            if(bufferId[0]!=0){
                GLES30.glDeleteBuffers(1,bufferId,0);
                GLError.maybeHTrowGLException(Log.WARN,TAG,"Unable to find GlBufferID oBject","GLBufferDelete");
                bufferId[0]=0;
            }
        }


    }

    public int getBufferId() {return bufferId;}
}
