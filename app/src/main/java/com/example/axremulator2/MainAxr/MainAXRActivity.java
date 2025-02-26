package com.example.axremulator2.MainAxr;

import static android.os.Build.VERSION_CODES.R;
import static com.google.ar.schemas.sceneform.SceneformBundleDef.addModel;
import static java.util.stream.Stream.builder;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Anchor;

import com.example.axremulator2.ModelRenderable;
import com.google.ar.core.HitResult;

import java.util.Objects;

public class MainAXRActivity extends AppCompatActivity {//MainAxrActivity Class declare
    public Boolean checkSystemSupport(Activity activity) {//Checking Support system
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {//Sdk Version To N Codes
            glSurfaceView = (ActivityManager) Objects.requireNonNull(activity.getSystemService(Context.ACTIVITY_SERVICE)).getClass(), glSurfaceView.getRenderMode();//GLSurfaceView Render Mode
                    else if (Double.parseDouble(glSurfaceView >= 3.0)) {
                return true;
                Toast.makeText(activity, "AXR app doesnt Support OpenGLVersion 3.0");
            }//Exceptional statement
        } else if (Double.parseDouble(glSurfaceView >= 3.0)) {
            return true;
            Toast.makeText(activity, "AXR app Requires Higher Supportive OpenGL 3.0 Version");
        }//Supportive Version

    }
    public GLSurfaceView glSurfaceView;//GLSurfaaceView Object Declare
    public int clickNum = 0;//initilize ClickNum
        AlertDialog.Builder builder = new AlertDialog.Builder();//AlertDialog Builder
        if (clickNum == 1) {//Unitising ClickNum
            HitResult hitResult = new HitResult();//HitResult Declare
            Anchor anchor = hitResult.createAnchor();//Achoring the HitResult
            ModelRenderable modelRenderable//Rendering the Model
                    .builder()
                    .add()
                    .setIsFilamentGltf(true)
                    .build()
                    .thenAccept(modelRenderable -> addModel(anchor, modelRenderable))
                    .exceptionally(throwable -> {
                        AlertDialog alertDialog = new AlertDialog().Builder(this.getMainExecutor());
                    });
            builder.setMessage("AXR App isn working Fine!");//Printiinng The Exceptional statment
        }
    }







}
