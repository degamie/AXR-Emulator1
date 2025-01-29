package com.example.axremulator2;

import static androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.build;

import static com.google.ar.schemas.sceneform.SceneformBundleDef.addModel;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Anchor;

import com.google.ar.sceneform.rendering.ModelRenderable;

import java.util.Objects;

public class MainActivity extends ModelSelector{
    @Override
    public void onAddModel(Anchor anchor, ModelRenderable modelRenderable) {
        super.onAddModel(anchor, modelRenderable);
    }
}
public class MainAXRActivity extends AppCompatActivity {
    public int clickNum=0;
    public Boolean checkSystemSupport(Activity activity){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){
            OpenGLVersion=(ActivityManager) Objects.requireNonNull(activity.getSystemService(Context.ACTIVITY_SERVICE)).getDeviceConfigurationInfo().getGLESVersion();
                    else if(Double.parseDouble(OpenGLVersion>=3.0)){return true;Toast.makeText(activity,"AXR app doesnt Support OpenGLVersion 3.0");}
        }else if(Double.parseDouble(OpenGLVersion>=3.0)){return true;Toast.makeText(activity,"AXR app Requires Higher Supportive OpenGL 3.0 Version");}//Supportive Version

    }
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

//super.onCreate();//  To be Implemented

