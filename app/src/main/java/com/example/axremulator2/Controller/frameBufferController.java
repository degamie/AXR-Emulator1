package com.example.axremulator2.Common.helpers;

import android.opengl.GLES30;

import androidx.graphics.opengl.FrameBuffer;

import com.google.android.filament.Texture;
import com.example.axremulator2.Common.helpers.SampleRenderer;
import com.example.axremulator2.Common.helpers.rameBufferService;
@Component
@Controller
public class FrameBufferController {
    public   FrameBufferController frameBufferController=new FrameBufferController();
    @Autowired
    public FrameBufferService frameBufferService;
    public String getAllBufferName(String BufferName){
        return frameBufferService.getAllframeBufferName(BufferName)
    }
    @PostMapping("/findAll/BufferName")//Retriving BufferName in Server
    public String setAllBufferName(String BufferName){
        return frameBufferService.setAllframeBufferName(BufferName)
    }

}
//DepthTexture=new Texture(
//                    SampleRenderer renderer,
//                    Texture.Target.TARGET_2D,
//                    Texture.WrapMode.CLAMP_TO_EDGE,
//                    false);
