package com.example.axremulator2.Common.helpers;

import android.opengl.GLES30;

import androidx.graphics.opengl.FrameBuffer;

import com.google.android.filament.Texture;
import com.example.axremulator2.Common.helpers.SampleRenderer;
@Service
public class frameBufferService {
    @Autowired
    public frameBufferRepository frameBufferrepository;
    public String getframeBufferId(Long FrameBufferId){
        return frameBufferRepository.saveAll(FrameBufferId);

    }

}
//DepthTexture=new Texture(
//                    SampleRenderer renderer,
//                    Texture.Target.TARGET_2D,
//                    Texture.WrapMode.CLAMP_TO_EDGE,
//                    false);
