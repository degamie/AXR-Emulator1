package com.example.axremulator2.Repository;

//@Getter
//@Setter
//@AllParamsConstructor
//@NoParamsConstructor

import com.example.axremulator2.Common.helpers.GpuBuffer;
@Repository
public interface GpuBufferRepository extends JpaRepository<GpuBuffer,String> {//Interface Declare with Inherited Class
    @Autowired
    public GpuBuffer gpuBuffer;
    public String saveAllBySize(float size);
}
