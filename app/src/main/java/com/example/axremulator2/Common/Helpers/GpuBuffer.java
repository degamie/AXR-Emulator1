package com.example.axremulator2.Common.helpers;

import java.nio.Buffer;

public class GpuBuffer {
    private static String TAG=GpuBuffer.class.getSimpleName();
    private final int  capacity=0;
    private final int  size=0;
    private final int  bufferId=0;
    public int INT_SIZE=4;
    public int FLOAT_SIZE=4;
    private  int  target;

    public GpuBuffer(target, int numberofBytesPerEntry, Buffer Entries){
        if(Entries!=null){
            if(!Entries.isDirect()){
                throw new IllegalArgumentException("if non-null entriesBuffer must be direct Buffer");
            }
            if(Entries.limit()==0){
                Entries=null;
            }
        }
    }

}
