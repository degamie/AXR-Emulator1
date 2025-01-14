package com.example.axremulator2.Common.helpers;

public class Texture extends Shader{
    public  int textureUnit=0;
    public void UniformTextureUnitForm(){
        if(!Uniform instanceof UniformTexture){
            textureUnit=textureUnit++;
    }
        else {
            UniformTexture uniformTexture=(uniformTexture)uniformTexture;
    }
    textureUnit=UniformTexture.getTextureUnit();
}
}

