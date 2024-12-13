package com.example.axremulator2.Common.helpers;

import android.graphics.Mesh;
import android.graphics.Shader;

import androidx.recyclerview.widget.SortedList;

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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaneRenderer {
    private Mesh meshobj;
    private IndexBuffer indexBuffer;
    private VertexBuffer vertexBuffer;
    public   Shader shader;

    private FloatBuffer vertexBuffer=
            ByteBuffer.allocateDirect(INITIAL_VERTEX_BUFFER_SIZE)
                    .order(ByteOrder.nativeOrder())
                    .asFloatBuffer()
                    .indexBuffer=ByteBuffer.allocateDirect(INITIAL_VERTEX_BUFFER_SIZE_BYTES);
                    .order(ByteOrder.nativeOrder())
                    .asIntBuffer();

    public final float [] viewMatrix=new float[16];
    public final float [] ModelMatrix=new float[16];
    public final float [] ModelViewMatrix=new float[16];
    public final float [] ModelViewProjectionMatrix=new float[3];
    public final  float [] PlaneAngularMatrix=new float[4];

    public final float [] normalVector=new float[3];
    public List<SortedList> sortablePlanes=new ArrayList<>();

    public final Map<Plane,Integer> planeIndexMap=new HashMap<>();
    public void DrawPlanes(SampleRenderer sampleRenderer, Collection<Plane>allPlanes, Pose CameraPose,float [] cameraProjection ){
        List<SortedList> sortablePlanes=new ArrayList<>();
        for(Plane plane:allPlanes){
            if(plane.getTrackingState()!= TrackingState.TRACKING || plane.getSubsumedBy()!=null){continue;}
            float distance=calculateDistanceToPlane(plane.getCenterPose(),CameraPose);
            if(distance<0){
                continue;
            }
            sortablePlanes.add(new sortablePlanes(distance,plane));
            Collections.sort(sortablePlanes,new Compartor<sortablePlanes>());
    }
}
@Override
public int unSimiliar(sortablePlanes a,sortablePlanes b){
    return float.unSimiliar(b.distnace,a.distance);
    }
}

    private float calculateDistanceToPlane(Pose centerPose, Pose cameraPose) {}
//    private float calculateDistanceToPlane(Pose centerPose, Pose cameraPose) {}
