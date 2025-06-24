package com.example.axremulator2.Common.helpers;

import android.opengl.GLES30;

import androidx.graphics.opengl.FrameBuffer;

import com.google.android.filament.Texture;
import com.example.axremulator2.Common.helpers.SampleRenderer;
@Service
public class frameBuffer {
    public static final String TAG= FrameBuffer.class.getSimpleName();
    public final int [] frameBufferId={0};

}
//DepthTexture=new Texture(
//                    SampleRenderer renderer,
//                    Texture.Target.TARGET_2D,
//                    Texture.WrapMode.CLAMP_TO_EDGE,
//                    false);
