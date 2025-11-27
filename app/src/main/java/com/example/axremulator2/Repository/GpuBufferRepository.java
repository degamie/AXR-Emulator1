package com.example.axremulator2.MainAxr.New_Implement.Repository;

//@Getter
//@Setter
//@AllParamsConstructor
//@NoParamsConstructor

//WID(28/11/2025)//Sarthak Mittal aka (Degamiesign)
import com.example.axremulator2.MainAxr.New_Implement.ModelSelector.GpuBuffer;
@Repository
public interface GpuBufferRepository extends JpaRepository<GpuBuffer,String> {//Interface Declare with Inherited Class
    @Autowired
    public GpuBuffer gpuBuffer;
    public String saveAllBySize(float size);
    public String findAllBySize(float size);
    public String updateAllByBufferSize(float Size);
    public String findAllBufferTime(String BufferTime);
    public String saveAllBufferTime(String BufferTime);//Fetching BufferTime
     public String saveAllgpuRenderer(String gpuRenderer);
     public void findAllgpuRenderer(String gpuRenderer);//Retreiving gpuRenderer in Server
    public String updateAllBygpuRenderer(String gpuRenderer);//updating GpuBuffer in Server
    public String existsAllbygpuRenderer(String gpuRenderer);//Checking GpuBufferRenderer's Existence in App
}
//    public String saveAllBySize(String size);

