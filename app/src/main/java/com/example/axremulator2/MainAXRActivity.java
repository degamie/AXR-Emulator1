package com.example.axremulator2;

import  com.example.axremulator2.ModelRenderable;
import static androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.build;

import static com.google.ar.schemas.sceneform.SceneformBundleDef.addModel;

import static java.util.stream.Stream.builder;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Anchor;

import com.example.axremulator2.ModelSelector.ModelSelector;
import com.google.ar.core.HitResult;
import com.google.ar.sceneform.rendering.ModelRenderable;

import java.util.Objects;
import com.example.axremulator2.AppCompatActivity;
public class MainActivity extends ModelSelector {
    @Override
    public <Anchor> String onAddModel(Anchor anchor,ModelRenderable modelRenderable) {
        super.onAddModel(anchor, modelRenderable);
    }
}
public class MainAXRActivity extends AppCompatActivity {
   public   GLSurfaceView glSurfaceView;
    public int clickNum=0;
    public Boolean checkSystemSupport(Activity activity){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){
            glSurfaceView =(ActivityManager) Objects.requireNonNull(activity.getSystemService(Context.ACTIVITY_SERVICE)).getClass(),glSurfaceView.getRenderMode();
                    else if(Double.parseDouble(glSurfaceView>=3.0)){return true;Toast.makeText(activity,"AXR app doesnt Support OpenGLVersion 3.0");}
        }else if(Double.parseDouble(glSurfaceView>=3.0)){return true;Toast.makeText(activity,"AXR app Requires Higher Supportive OpenGL 3.0 Version");}//Supportive Version

    }
    public void onCreate(Bundle InstanceState){
        AlertDialog.Builder builder=new AlertDialog.Builder();
        if(clickNum==1){
            HitResult hitResult=new HitResult();
            Anchor anchor= hitResult.createAnchor();
            ModelRenderable modelRenderable
                    .builder()
                    .add()
                    .setIsFilamentGltf(true)
                    .build()
                    .thenAccept(modelRenderable->addModel(anchor,modelRenderable))
                    .exceptionally(throwable->{
                        AlertDialog alertDialog=new AlertDialog().Builder(this.getMainExecutor());
                    });
                    builder.setMessage("AXR App isn working Fine!");
        }
    }
}

//super.onCreate();//  To be Implemented

