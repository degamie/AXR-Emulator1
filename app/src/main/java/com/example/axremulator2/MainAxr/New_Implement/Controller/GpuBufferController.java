package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.Service.GpuBufferService;

@Controller

public class GpuBufferController {//Class Declare
    @Autowired
     public GpuBufferService gpuBufferService;
    @GetMapping("/savaAll/{size})
    public String getAllBySize(float size){
        return gpuBufferService.getAllBySize(size) ;//GpuBuffer's Size Fetch
    }
}
//    public GpuBuffer(GpuBuffer gpubuffer){
//        this.gpubuffer=gpubuffer;
//    }
//    public static Object INT_SIZE() {}//tbc//
