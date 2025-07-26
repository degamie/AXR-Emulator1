package com.example.axremulator2.MainAxr.New_Implement.ModelSelector;

@Getter
@Setter
@AllParamsConstructor
@NoParamsConstructor
public class VirtualSceneFrameBuffer {
    public VirtualSceneFrameBuffer virtualSceneFrameBuffer;
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    @Column(unique=true,nullable=false)

    public String frameBufferId;
    @Column(unique=true,nullable=false)

    public String frameBufferName;

}
//public VirtualSceneFrameBuffer(VirtualSceneFrameBuffer){
//        this.virtualSceneFrameBuffer=virtualSceneFrameBuffer;
//    }
//    public void setFrameBufferId(String frameBufferId){
//        this.frameBufferId=frameBufferId;
//    }
//    public String getFrameBufferId(String frameId){
//        return frameId;
//    }
