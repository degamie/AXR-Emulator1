package com.example.axremulator2.Common.helpers;

import android.opengl.GLES30;

import androidx.graphics.opengl.FrameBuffer;

import com.google.android.filament.Texture;
import com.example.axremulator2.Common.helpers.SampleRenderer;
@Repository
public class frameBufferRepository{
    public List<frameBuffer> saveAll();
    public String getframeBufferId(Long FrameBufferId);
}
//DepthTexture=new Texture(
//                    SampleRenderer renderer,
//                    Texture.Target.TARGET_2D,
//                    Texture.WrapMode.CLAMP_TO_EDGE,
//                    false);
