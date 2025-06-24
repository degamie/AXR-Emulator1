package com.example.axremulator2.Common.helpers;

import android.opengl.GLES30;

import androidx.graphics.opengl.FrameBuffer;

import com.google.android.filament.Texture;
import com.example.axremulator2.Common.helpers.SampleRenderer;
@Controller
public class frameBufferController{
    @GetMapping("/save/{FrameBufferId}")
    //Fethcing FramewBufferId
    public String getframeBufferId(Long FrameBufferId){
        return frameBufferService.getframeBufferId(FrameBufferId);
    }
}