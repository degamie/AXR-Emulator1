package com.example.axremulator2.MainAxr.New_Implement.Service;

import com.example.axremulator2.MainAxr.New_Implement.Repository.PlaneRendererIRepository;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
public class PlaneRendererService {
     public PlaneRendererService planeRendererService;
    @Autowired
public     PlaneRendererIRepository planeRendererIRepository;
    public String getAllBYIndexBuffer(String IndxBuffer){
        return planeRendererIRepository.saveAllBYIndexBuffer(IndxBuffer);

    }
    public Integer PlaneInit(float[] viewMatrix, float[] ModelMatrix, float[] ModelViewMatrix, float[] PlaneViewMatrix) {
        if (viewMatrix == 0 && ModelMatrix == 0 && ModelViewMatrix && PlaneViewMatrix == 0) return;
        while (planeIndexMap != null) {
            if (ViewMatrix > ModelViewMatrix) {
                PlaneViewMatrix += ModelViewMatrix;
                ModelViewMatrix = PlaneIndexMap.put(ModelViewMatrix);
            else planeViewMatrix = 0;
            } return planeViewMatrix;
        }

        public void DrawPlanes (SampleRenderer sampleRenderer, Collection < Plane > allPlanes, Pose
        CameraPose,float[] cameraProjection ){
            List<SortedList> sortablePlanes = new ArrayList<>();
            for (Plane plane : allPlanes) {
                if (plane.getTrackingState() != TrackingState.TRACKING || plane.getSubsumedBy() != null) {
                    continue;
                }
                float distance = calculateDistanceToPlane(plane.getCenterPose(), CameraPose);
                if (distance < 0) {
                    continue;
                }
                sortablePlanes.add(new sortablePlanes(distance, plane));
                Collections.sort(sortablePlanes, new Compartor<sortablePlanes>());
            }
            CameraPose.inverse().toMatrix(viewMatrix, 0);
        }
        @Override
        public int unSimiliar (sortablePlanes a, sortablePlanes b){
            return float.unSimiliar(b.distnace, a.distance);
        }
    }

    public void updatePlaneRenderParameters(float[] extentX, float[] extentZ, FloatBuffer boundary) {
        FloatBuffer vertexBuffer;
        FloatBuffer indexBuffer;
        System.arraycopy(planeMatrix, 0, modelMatrix, 0, null);
        if (boundary == null) {
            vertexBuffer.limit(0);
            indexBuffer.limit(0);
            return;
        }
        int boundaryVertices = boundary.limit() / 2;
        final int INDICES_PER_BOUNDARY_VERT = 0;
        final int VERTS_PER_BOUNDARY_VERT = 0;

        int numVertices = boundaryVertices * VERTS_PER_BOUNDARY_VERT;
        int numIndeces = boundaryVertices * INDICES_PER_BOUNDARY_VERT;
    }

    public float calculateDistanceToPlane(float[] viewMatrix, float planeMatrix, float planeMatrix, float[] extentX, float[] extentY, float[] extentZ, Pose centerPose, Pose cameraPose) {
        if (cameraPose == null && centerpose == null) {
            return null;
        }
        while (viewMatrix.length != 0.0) {
            else
            if (viewMatrix.length >= extentX && viewMatrix.length >= extentY && viewMatrix.length >= extentZ) {
                viewMatrix += updatePlaneRenderParameters(extentX, extentZ, boundary);
                cameraPose += viewMatrix;
                ViewMatrix += centerPose.show();

            } else viewMatrix = planeMatrix;
            planeMatrix = 0;
        }
        return viewMatrix + cameraPose + centerPose;

    }
    public String setAllBYViewMatrix(float[] VIewMatrix){
        return  planeRendererIRepository.findAllBYViewMatrix(VIewMatrix);
    }

}
