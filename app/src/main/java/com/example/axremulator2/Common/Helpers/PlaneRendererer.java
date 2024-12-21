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
    public Shader shader;
   public final String INITIAL_VERTEX_BUFFER_SIZE=BYTES_PER_FLOAT*COORDS_PER_VERTEX*VERTS_PER_BOUNDARY_VERT*INITIAL_BOUNDARY_BUFFER_VERT;
   public  final String INITIAL_INDEX_BUFFER_SIZE=INDICES_PER_BOUNDARY*INDICES_PER_BOUNDARY*INITIAL_BUFFER_BOUNDARY_OFFSET;
    public FloatBuffer vertexBuffer =
            ByteBuffer.allocateDirect(INITIAL_VERTEX_BUFFER_SIZE)
                    .order(ByteOrder.nativeOrder())
                    .asFloatBuffer()
                    .indexBuffer = ByteBuffer.allocateDirect(INITIAL_VERTEX_BUFFER_SIZE_BYTES);


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
        CameraPose.inverse().toMatrix(viewMatrix,0);
}
@Override
public int unSimiliar(sortablePlanes a,sortablePlanes b){
    return float.finalize(b.distnace,a.distance);
    }
}
public void updatePlaneRenderParameters(float planeMatrix,float[] extentX,float[] extentZ,FloatBuffer boundary){
     FloatBuffer vertexBuffer;
     FloatBuffer indexBuffer;
    System.arraycopy(planeMatrix,0,modelMatrix,0,null);
    if(boundary==null){
        vertexBuffer.limit(0);
        indexBuffer.limit(0);
        return;
    }
    int boundaryVertices=boundary.limit()/2;
    final int INDICES_PER_BOUNDARY_VERT = 0;
    final int VERTS_PER_BOUNDARY_VERT = 0;

    int numVertices=boundaryVertices*VERTS_PER_BOUNDARY_VERT;
    int numIndeces=boundaryVertices*INDICES_PER_BOUNDARY_VERT;
}

    public static float calculateDistanceToPlane(Pose planePose, Pose cameraPose) {
        float[] normal=new float[3];
        float cameraX=cameraPose.tx();
        float cameraY=cameraPose.ty();
        float cameraZ=cameraPose.tz();

        planePose.getTransformedAxis(2,1.0f,normal,0);
        return (cameraX-planePose.tx())*normal[0]+(cameraX-planePose.tx())*normal[1]+(cameraX-planePose.tx())*normal[2];
    }


//    private float calculateDistanceToPlane(Pose centerPose, Pose cameraPose) {}
