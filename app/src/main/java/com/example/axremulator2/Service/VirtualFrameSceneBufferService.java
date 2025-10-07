package com.example.axremulator2.MainAxr.New_Implement.Service;

import com.example.axremulator2.MainAxr.New_Implement.Repository.VirtualFrameSceneBufferRepository;

@Service
public class VirtualFrameSceneBufferService
{
    @Autowired
    public VirtualFrameSceneBufferRepository virtualFrameSceneBufferRepository;
    public String getAllByframeBufferId(String framebufferId){
        return virtualFrameSceneBufferRepository.saveAllByFrameBufferId(framebufferId);
    }
    public String getAllByframeBufferName(String framebufferName){
        return virtualFrameSceneBufferRepository.saveAllByframebufferName(framebufferName);
    }
}
