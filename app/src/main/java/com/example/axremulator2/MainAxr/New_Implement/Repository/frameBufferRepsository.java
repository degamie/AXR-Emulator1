package com.example.axremulator2.Common.helpers;

import android.opengl.GLES30;

import androidx.graphics.opengl.FrameBuffer;

import com.google.android.filament.Texture;
import com.example.axremulator2.MainAxr.New_Implement.ModelSelector.VirtualSceneFrameBuffer;

import java.util.List;

@Repository
public class frameBufferRepository extends JpaRepository<VirtualSceneFrameBuffer,String> {
    @Autowired
    public VirtualSceneFrameBuffer virtualSceneFrameBuffer;

    public List<VirtualSceneFrameBuffer> saveAll();
    public String getframeBufferId(Long FrameBufferId);
    public String saveAllframeBufferName(String frameBufferName);
}
//DepthTexture=new Texture(
//                    SampleRenderer renderer,
//                    Texture.Target.TARGET_2D,
//                    Texture.WrapMode.CLAMP_TO_EDGE,
//                    false);
