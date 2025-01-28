package com.example.axremulator2;

import static androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.build;

import static com.google.ar.schemas.sceneform.SceneformBundleDef.addModel;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Anchor;

import com.google.ar.sceneform.rendering.ModelRenderable;

public class MainAXRActivity extends AppCompatActivity {
    public int clickNum=0;
    public void onCreate(Bundle InstanceState){
        if(clickNum==1){
            Anchor anchor=hitResult.createAnchor();
            ModelRenderable modelRenderable.Builder()
                    .setSource()
                    .setIsFilamentGltf(true);
                    .build()
                    .thenAccept(modelRenderable->addModel(anchor,modelRenderable))
                    .exceptionally(throwable->{
                        AlertDialog alertDialog=new AlertDialog().Builder(this)
                    })
                                builder.setmessage("AXR App isn working Fine!");

        }
    }
}
