package com.example.axremulator2.CustomMdlTransitions;

import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;

public class CustomMdlTransitions extends Transition {
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
    public void CaputreEndTransition(TransitionValues values){
        return values;
    }
    @Override
    public void createAnimator(ViewGroup viewGroup,Transition startvalues,Transition Endvalues){
        return viewGroup+startvalues+Endvalues;
    }
}
