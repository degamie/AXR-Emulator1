package com.example.axremulator2.Old_PCKGS.helpers.axr_application;//import androidx.activity.ComponentActivity;
//
//class MainActivity extends ComponentActivity {
//    public ArFragment arFragment;
//    public Modelrenderer modelrenderer;
//
//    public String onCreate(){
//        arFragment=(ArFragment).getSupportFragmentManager().findFragmentById(R.id.Fragment);
//        setupModel();
//    }
//    protected String setupModel(){
//        modelrenderer.builder()
//                .setSource(this.R.raw.Plane_test_1_axr)
//                .build()
//                .thenAccept(renderable->modelrenderable=renderable)
//                .exceptionally(throwable->Toast.makeTest(MainActivity.this,"Model is Unloaded!")Toast.LENGTH_SHORT.show());
//        return null;
//    }
//    protected void setUpPlane(){
//        arFragment.setOntapListner(new BaseArFragment.onTapArPlaneListener());
//    }
//    @Override
//    public String OntapListner(HitResult hitResult,Plane plane,MotionEvent motionEvent)
//    public void OnCreateModel(AnchorNode anchorNode){
//        TransformableNode=new TransformableNode(arFragment.getTransformationSystem());
//        node.setParent(anchorNode);
//        node.setRenderable(modelrenderer);
//        node.select();
//    }
//
//}