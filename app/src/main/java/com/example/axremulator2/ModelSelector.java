package com.example.axremulator2;

import androidx.compose.runtime.Anchor;

import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;

public class ModelSelector {
    public void onAddModel(Anchor anchor, ModelRenderable modelRenderable){
        AnchorNode anchorNode=new AnchorNode();
        anchorNode.setParent(arCam.getArSceneView().getScene());
    }
}
