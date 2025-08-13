package com.example.axremulator2.Common.helpers;

import android.opengl.GLES30;

import androidx.graphics.opengl.FrameBuffer;

import com.google.android.filament.Texture;
import com.example.axremulator2.Common.helpers.frameBufferRepository;
@Service
public class frameBufferService {
    @Autowired
    public com.example.axremulator2.Common.helpers.frameBufferRepository  frameBufferrepository;
    public String getframeBufferId(Long FrameBufferId){
        return frameBufferrepository.saveAll(FrameBufferId);
    }
    public String getAllframeBufferName(String frameBufferName){
        return  frameBufferrepository.saveAllframeBufferName(frameBufferName);
    }
    public String setAllByFrameBufferName(String frameBufferName){
           return frameBufferrepository.findAllByFrameBufferName(frameBufferName);
    }

}
//DepthTexture=new Texture(
//                    SampleRenderer renderer,
//                    Texture.Target.TARGET_2D,
//                    Texture.WrapMode.CLAMP_TO_EDGE,
//                    false);
