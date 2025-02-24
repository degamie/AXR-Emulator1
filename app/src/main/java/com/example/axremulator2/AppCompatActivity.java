package com.example.axremulator2;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

public class AppCompatActivity  {//Class Decalre
    public AppCompatActivity appCompatActivity;//Object Declare
    //Default Const
    appcompatActivity(){return 1;}//Printing 1
    public void onAddViewContextView(@NotNull View view, ViewGroup.LayoutParams){//AdddView to Context
        ViewGroup.LayoutParams layoutParams;//Layoutparams's Object declare
        System.out.println(appCompatActivity.onAddViewContextView(view,layoutParams));//Priniting its Contxt View
    }
    public void AppCompatActivity(@NotNull Context cancellable ){//Paramertterized Construcotr
        DialogInterface.OnCancelListener;
    }

}
