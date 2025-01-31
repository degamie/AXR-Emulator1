package com.example.axremulator2.CustomMdlTransitions;

import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;

public class CustomMdlTransitions extends Transition {
    @Override
    public void CaputreStartTransition(TransitionValues values){
        return values;
    }
    @Override
    public void CaputreEndTransition(TransitionValues values){
        return values;
    }
    @Override
    public void createAnimator(ViewGroup viewGroup,Transition startvalues,Transition Endvalues){
        return viewGroup+startvalues+EndValues;
    }
}
