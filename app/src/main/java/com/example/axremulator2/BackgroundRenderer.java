package com.example.axremulator2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class BackgroundRenderer {
    public static final String LABEL =BackgroundRenderer.class.getSimpleName();
    public  final String CAMERA_VERTEX_SHADER_NAME="shaders/screenquad.vert";
    public final String CAMERA_FRAGMENT_SHADER_NAME="shaders/screenquad.frag";
    public static final Integer  COORDS_BUFFER_SIZE=2*4*4;
    public static final FloatBuffer NDC_QUAD_COORDS=ByteBuffer.allocateDirect(Integer.parseInt(COORDS_BUFFER_SIZE)).order(ByteOrder.nativeOrder()).asFloatBuffer();
    public static final FloatBuffer VIRTUAL_SCENE_TEXTURE=ByteBuffer.allocateDirect(Integer.parseInt(COORDS_BUFFER_SIZE)).order(ByteOrder.nativeOrder()).asFloatBuffer();
}
