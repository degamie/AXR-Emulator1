package com.example.axremulator2.MainAxr.New_Implement.Service;

import com.example.axremulator2.MainAxr.New_Implement.Repository.GpuBufferRepository;

@Service

public class GpuBufferService {//Class Declare
    @Autowired
    public GpuBufferRepository gpuBufferRepository;
    public String getAllBySize(float size){
        return gpuBufferRepository.saveAllBySize(size) ;
    }
    public String setAllBufferTime(String BufferTime){
        return gpuBufferRepository.findAllBufferTime(BufferTime);
    }
}
