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

@Getter
@Setter
@AllParamsConstructor
@NoParamsConstructor
public class PlaneRenderer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)

    private Mesh meshobj;
    @Column(unique = false, nullable = true)
    private IndexBuffer indexBuffer;
    @Column(unique = false, nullable = true)
    private VertexBuffer vertexBuffer;
    @Column(unique = false, nullable = true)
    public Shader shader;
    //    public static final INITIAL_VERTEX_BUFFER_SIZE_BYTES=BYTES_PER_FLOAT*COORDS_PER
    public FloatBuffer vertexBuffer =
            ByteBuffer.allocateDirect(INITIAL_VERTEX_BUFFER_SIZE)
                    .order(ByteOrder.nativeOrder())
                    .asFloatBuffer()
                    .indexBuffer = ByteBuffer.allocateDirect(INITIAL_VERTEX_BUFFER_SIZE_BYTES);
    @Column(unique = false, nullable = true)
    public float[] PlaneViewMatrixviewMatrix = new float[16];
    @Column(unique = false, nullable = true)
    public final float[] viewMatrix = new float[16];
    @Column(unique = false, nullable = true)
    public final float[] ModelMatrix = new float[16];
    @Column(unique = false, nullable = true)
    public final float[] ModelViewMatrix = new float[16];
    @Column(unique = false, nullable = true)
    public final float[] ModelViewProjectionMatrix = new float[3];
    @Column(unique = false, nullable = true)
    public final float[] PlaneAngularMatrix = new float[4];
    @Column(unique = false, nullable = true)
    public final float[] normalVector = new float[3];
    @Column(unique = false, nullable = true)
    public List<SortedList> sortablePlanes = new ArrayList<>();
    @Column(unique = false, nullable = true)

    public final Map<Plane, Integer> planeIndexMap = new HashMap<>();


}

//    private float calculateDistanceToPlane(Pose centerPose, Pose cameraPose) {}
