package com.example.axremulator2.ModelSelector;

import androidx.compose.runtime.Anchor;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Camera;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.example.axremulator2.ModelSelector.XRSession;
public class ModelSelector extends ModelRenderable{
    public ModelRenderable renderable;
    public XRSession xrSession;
    ArCoreApk arCoreApk;
    Camera  arcam;
    public String OnInit(){
        super.getRenderPriority();
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

