package com.example.axremulator2.MainAxr.New_Implement.Repository;

//@Getter
//@Setter
//@AllParamsConstructor
//@NoParamsConstructor

import com.example.axremulator2.MainAxr.New_Implement.ModelSelector.GpuBuffer;
@Repository
public interface GpuBufferRepository extends JpaRepository<GpuBuffer,String> {//Interface Declare with Inherited Class
    @Autowired
    public GpuBuffer gpuBuffer;
    public String saveAllBySize(float size);
}
