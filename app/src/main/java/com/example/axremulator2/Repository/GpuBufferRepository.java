package com.example.axremulator2.MainAxr.New_Implement.Repository;

//@Getter
//@Setter
//@AllParamsConstructor
//@NoParamsConstructor

//WID(5/11/2025)

import com.example.axremulator2.MainAxr.New_Implement.ModelSelector.GpuBuffer;
@Repository
public interface GpuBufferRepository extends JpaRepository<GpuBuffer,String> {//Interface Declare with Inherited Class
    @Autowired
    public GpuBuffer gpuBuffer;
    public String saveAllByFloatTime(float Time);
    public void findAllByFLoatTIme(float time)

    public String findAllByGpuBuffer(String gpuBuffer);
    public String saveAllByGpuBuffer(GpuBuffer gpuBuffer);

    public String saveAllBySize(float size);
    public String findAllBySize(float size);
    public String updateAllByBufferSize(float Size);
    public String findAllBufferTime(String BufferTime);
    public String saveAllBufferTime(String BufferTime);//Fetching BufferTime
    public String updateAllByBufferTime(String BufferTime);//Updating BufferTime in GpBuffer
}
