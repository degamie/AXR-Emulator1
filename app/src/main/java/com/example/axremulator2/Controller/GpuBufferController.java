package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.MainAxr.New_Implement.Service.GpuBufferService;

@Controller

public class GpuBufferController {//Class Declare
    @Autowired
     public GpuBufferService gpuBufferService;
    @GetMapping("/savaAll/{size})
    public String getAllBySize(float size){
        return gpuBufferService.getAllBySize(size) ;//GpuBuffer's Size Fetch
    }
    @PostMapping("/savaAll/{BufferTime}")//BufferTime's Retrieval in Server
    public String setAllBufferTime(String BufferTime){
        return gpuBufferRepository.findAllBufferTime(BufferTime);
    }
    @GetMapping("/savaAll/{size}")
    public String getAllBySize(String size){//size's Retrieval In Server
        return  gpuBufferRepository.saveAllBySize(size);
    }

}
//    public GpuBuffer(GpuBuffer gpubuffer){
//        this.gpubuffer=gpubuffer;
//    }
//    public static Object INT_SIZE() {}//tbc//
