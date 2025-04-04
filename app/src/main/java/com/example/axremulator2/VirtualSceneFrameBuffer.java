package com.example.axremulator2.Common.helpers;

public class VirtualSceneFrameBuffer {
    public String frameBufferId;
    public VirtualSceneFrameBuffer virtualSceneFrameBuffer;
    public VirtualSceneFrameBuffer(VirtualSceneFrameBuffer){
        this.virtualSceneFrameBuffer=virtualSceneFrameBuffer;
    }
    public void setFrameBufferId(String frameBufferId){
        this.frameBufferId=frameBufferId;
    }
    public String getFrameBufferId(String frameId){
        return frameId;
    }
}
