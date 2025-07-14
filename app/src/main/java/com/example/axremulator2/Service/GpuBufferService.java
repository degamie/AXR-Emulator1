package com.example.axremulator2.Service;

import com.example.axremulator2.Repository.GpuBufferRepository;

@Service

public class GpuBufferService {//Class Declare
    @Autowired
    public GpuBufferRepository gpuBufferRepository;
    public String getAllBySize(float size){
        return gpuBufferRepository.saveAllBySize(size) ;
    }
}
