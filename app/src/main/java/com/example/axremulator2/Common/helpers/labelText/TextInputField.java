package com.example.axremulator2.labelText;

import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.axremulator2.R;

public class TextInputField {
        public TextView textView;
        public Fade mfade;
        public ViewGroup viewGroup;
        public void setContentView(R.layout.activity_main);
        TextView labelText=new TextView(this);
        labelText.setText("AXR Emulator");
        labelText.setId(R.id.text);
         RootView rootView=(ViewGroup)findViewById(R.Id.mainlayout);
         mFade=new Fade(Fade.IN);
         TransitionManager.beginDelayedTransition(rootView,mFade);
         rootView.addView(labelText);
         rootView.addView(labelText);

}
