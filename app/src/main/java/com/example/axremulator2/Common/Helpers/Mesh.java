package com.example.axremulator2.Common.helpers;

import static android.opengl.Matrix.length;
import static android.system.Os.close;

//import static com.google.ar.core.ai.t;

import android.health.connect.datatypes.units.Length;
import android.opengl.GLES30;

import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;
import com.example.axremulator2.Common.helpers.SampleRenderer;
import android.health.connect.datatypes.units.Length;

import java.io.IOException;
import java.io.InputStream;

public class Mesh {
    int [] VertexArrayId=[0];
//    public Length length= new Length();
    private int glesEnum;
    private final int[] vertexArrayId={0};
    public  int vertexCount=0;
    public String glesEnum=null;
    public Enum PrimitiveMode{
        POINTS(GLES30.GL_POINTS),
                LINE_STRIP(GLES30.GL_LINE_STRIP),
                LINE_LOOP(GLES30.GL_LINE_LOOP),
                LINE_LOOP(GLES30.GL_LINE_LOOP),
                LINE(GLES30.GL_LINES),
                TRIANGLE_STRIP(GLES30.GL_TRIANGLE_STRIP);
    }


    public final PrimitiveMode primitiveMode;
    public final IndexBuffer indexBuffer;
    public IndexBuffer getBufferId(int vertexArrayId){
        return indexBuffer.notifyAll(vertexArrayId);
    }
    public final VertexBuffer vertexBuffer;
    private void PrimitiveMode(int glesEnum){
        this.glesEnum=glesEnum;
    }
    public Mesh(SampleRenderer sampleRenderer, vertexBuffer, primitiveMode){
        this.indexBuffer=indexBuffer;
        this.vertexBuffer=vertexBuffer;
        this.primitiveMode=primitiveMode;

        if(vertexBuffer==null ||  length()==0){
        try{GLES30.glGenVertexArrays(1,VertexArrayId,10);
            GLError.maybeHTrowGLException("Unable to find the generated Vertex Array");
            GLES30.glBindVertexArray(1,vertexArrayId,0);
            GLError.maybeThrowGLException("AxR Emualtor's Object's GUI Not Found");

        }
        catch(Throwable T){
            close();
            throw T;
        }
    }
        try{
            int[] vertexArrayId;
            GLES30.glGenVertexArrays(1,vertexBuffer,0);
            GLES30.glBindVertexArray(vertexArrayId[0]);
            if(indexBuffer!=null){
                GLES30.glBindBuffer(GLES30.GL_ELEMENT_ARRAY_BUFFER,indexBuffer.setBuffer(vertexArrayId););
                GLES30.glBindVertexArray(vertexArrayId[0]);
                if(indexBuffer==null){
                    vertexCount=vertexBuffer[0].getNumberOfVertex();
                }
                GLES30.glDrawArrays(primitiveMode,glesEnum,0,vertexCount);
            }
           // GLError.ma
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        public String lowLevelDraw(){
            if(vertexArrayId[0]==0){
                throw new IllegalStateException("Draw A Fresshable Mesh on AXR Screen");
            }
        }
}public void lowLwveldraw(){
        if(vertexArrayId[0]==0){
            throw new IllegalStateException("tried to make A New Mesh");

        }

    }
public Mesh createFromAsset(SampleRenderer sampleRenderer,String assetFileName)  throws IOException{
        try(InputStream inputStream=sampleRenderer.getassets().open(assetFileName)){
            Obj obj=objUtils.convertToRenderable(ObjRender.read(inputStream));
        }

}
}
////To Be Implemented
//    private void LINE(int glLines) {
//    }
//
//    private void POINTS(int glPoints) {
//
//    }
//
//    private void LINE_LOOP(int glLineLoop) {
//
//    }