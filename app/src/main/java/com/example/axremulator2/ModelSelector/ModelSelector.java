package com.example.axremulator2.ModelSelector;

import androidx.compose.runtime.Anchor;

import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;

public class ModelSelector extends ModelRenderable{
    public ModelRenderable renderable;
    public void onAddModel(Anchor anchor, ModelRenderable modelRenderable){
        AnchorNode anchorNode=new AnchorNode();
        anchorNode.setParent(arCam.getArSceneView().getScene());
        renderable.createInstance(anchor,modelRenderable);
        renderable.getBoneParentIndex(anchor,modelRenderable);
        renderable.onAnimationEngineUpdated();
//        TransformableModel transformableModel=new TransformableModel(arCam.getTransformationSystem());
//        transformableModel.setParent(anchorNode);
//        transformableModel.setRenderable(modelRenderable);
//        transformableModel.select();
    }
}
