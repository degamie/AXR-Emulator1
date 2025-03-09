package com.example.axremulator2.CustomMdlTransitions;

import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.axremulator2.MainAxr.MainAXRActivity;

public class CustomMdlTransitions extends Transition {
    public  int animResId=0;
    private final int values=0;//Values initialize
    public CustomMdlTransitions customMdlTransitions;//Object Declare
    public CustomMdlTransitions(int values){//parameterized Constructor
        this.values=values;
    }
    @Override
    public void CaputreStartTransition(TransitionValues values){//Func declare
        if(values==0)return 0;//checking initial val
        while(values!=0){else if(values>0)values++;}//inc Val
        return values;//Printing Val
    }
    @Override
    public void createAnimator(ViewGroup viewGroup,Transition startvalues,Transition Endvalues){
        viewGroup.setOnClickListener();

        Animation animation= AnimationUtils.loadAnimation(MainAXRActivity.this,animResId);
        ImageView imageView=new ImageView();
        imageView.startAnimation(animation);
        return viewGroup+startvalues+Endvalues;
    }
    @Override
    public void CaputreEndTransition(TransitionValues values){
        return values;
    }

}
