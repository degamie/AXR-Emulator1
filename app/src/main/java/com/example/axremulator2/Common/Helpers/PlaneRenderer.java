package com.example.axremulator2.Common.Helpers;

import android.graphics.Mesh;
import android.graphics.Shader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class PlaneRenderer {
    private Mesh meshobj;
    private IndexBuffer indexBuffer;
    private VertexBuffer vertexBuffer;
    private final Shader shader;

    private FloatBuffer vertexBuffer=
            ByteBuffer.allocateDirect(INITIAL_VERTEX_BUFFER_SIZE)
                    .order(ByteOrder.nativeOrder())
                    .asFloatBuffer()
                    .indexBuffer=ByteBuffer.allocateDirect(INITIAL_VERTEX_BUFFER_SIZE_BYTES);
                    .order(ByteOrder.nativeOrder())
                    .asIntBuffer()

}
