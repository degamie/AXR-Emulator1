package com.example.axremulator2;

import androidx.compose.runtime.Anchor;

import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;

public class ModelSelector {
    public ModelSelector modelSelector;
    public String getModelSelector(ModelSelector modelSelector){
        return modelSelector;
    }
    public void onAddModel(Anchor anchor, ModelRenderable modelRenderable){
        AnchorNode anchorNode=new AnchorNode();
        anchorNode.setParent(arCam.getArSceneView().getScene());
        TransformableModel transformableModel=new TransformableModel(arCam.getTransformationSystem());
        transformableModel.setParent(anchorNode);
        transformableModel.setRenderable(modelRenderable);
        transformableModel.select();
    }
}
