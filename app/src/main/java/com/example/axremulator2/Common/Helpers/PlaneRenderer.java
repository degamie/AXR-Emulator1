package com.example.axremulator2.Common.Helpers;

import android.graphics.Camera;
import android.graphics.Mesh;
import android.graphics.Shader;

import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;
import com.google.ar.core.Plane;
import com.google.ar.core.Pose;
import com.google.ar.core.TrackingState;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                    .asIntBuffer();

    public static float [] viewMatrix=new float[16];
    public static float [] ModelMatrix=new float[16];
    public static float [] ModelViewMatrix=new float[16];
    public static float [] ModelViewProjectionMatrix=new float[3];
    public static  float [] PlaneAngularMatrix=new float[4];

    public static float [] normalVector=new float[3];

    public final Map<Plane,Integer> planeIndexMap=new HashMap<>();
    public void DrawPlanes(SampleRenderer sampleRenderer, Collection<Plane>allPlanes, Pose CameraPose,float [] cameraProjection ){
        List<SortablePlane> sortablePlanes=new ArrayList<>();
        for(Plane plane:allPlanes){
            if(plane.getTrackingState()!= TrackingState.TRACKING || plane.getSubsumedBy()!=null){continue;}
            float distance=calculateDistanceToPlane(plane.getCenterPose(),CameraPose);
    }

}

    private float calculateDistanceToPlane(Pose centerPose, Pose cameraPose) {}
