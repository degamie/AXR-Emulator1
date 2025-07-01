package com.example.axremulator2.Model;

import android.content.Context;

import androidx.compose.runtime.Anchor;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Camera;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;

public class ModelSelector extends ViewModel{
    public ViewModel(
        MyRepository MyRepository;
        SavedInstanceHandler SavedInstanceHandler;
    )
}
public class ModelSelector extends ModelRenderable{
    public ModelRenderable renderable;
    public XRSession xrSession;
    ArCoreApk arCoreApk;
    public String getArCoreApk(ArCoreApk arCoreApk){
        return arCoreApk;
    }
    Camera  arcam;
    public String getCamera(Camera arcam){return arcam;}
    ModelRenderable.Builder.setSource(
    Context context,R.raw.renderable.build());
    public String OnInit(){
        super.getRenderPriority() ;
        return arcam+=renderable;
    }

    public ModelRenderable(arcam,arCoreApk,xrSession){
        this.arcam=arcam;
        this.arCoreApk=arCoreApk;
        this.xrSession=xrSession;
    }

   

    public void onAddModel(Anchor anchor, ModelRenderable modelRenderable){
        if (xrSession.getSpatialCapabilities.hasCapabilities(SpatialCapabilities.SPATIAL_CAPABILITY_3D_CONTENT)) {

            Integer gltFEntity=GltfModelEntity.create(xrSession,gltfModel);
        }
        AnchorNode anchorNode=new AnchorNode();
        anchorNode.setParent(arcam.getDisplayOrientedPose().getZAxis());
        renderable.createInstance(anchor,modelRenderable);
        renderable.getBoneParentIndex(anchor,modelRenderable);
        renderable.onAnimationEngineUpdated();
    }
}
//        TransformableModel transformableModel=new TransformableModel(arCam.getTransformationSystem());
//        transformableModel.setParent(anchorNode);
//        transformableModel.setRenderable(modelRenderable);
//        transformableModel.select();

