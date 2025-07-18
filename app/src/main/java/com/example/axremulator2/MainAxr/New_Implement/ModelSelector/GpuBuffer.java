package com.example.axremulator2.MainAxr.New_Implement.ModelSelector;

@Getter
@Setter
@AllParamsConstructor
@NoParamsConstructor

public class GpuBuffer {//Class Declare
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    @Column(unique=true,nullable=false)
    public float size;
    @Column(unique=false, nullable=true)
    public GpuBuffer gpubuffer;//Obj declare
    @Column(unique=false, nullable=true)
    public Object FLOAT_SIZE(float size) {
        size=0;
        return  size;
    }
}

//    public GpuBuffer(GpuBuffer gpubuffer){
//        this.gpubuffer=gpubuffer;
//    }
//    public static Object INT_SIZE() {}//tbc//
