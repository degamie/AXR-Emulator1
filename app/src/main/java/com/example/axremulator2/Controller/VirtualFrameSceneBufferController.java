package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.MainAxr.New_Implement.Service.VirtualFrameSceneBufferService;

@Controller
public class VirtualFrameSceneBufferController {
    public String VirtualFrameSceneBufferId;
    @Autowired
    public VirtualFrameSceneBufferService virtualFrameSceneBufferService;
    @GetMapping("/saveAll/{VirtualFrameSceneBufferId}")//Fetching All VirtualFrameSceneBufferId in Server
    public String getAllByBufferId(@RequestParam "VirtualFrameSceneBufferId"String VirtualFrameSceneBufferId){
        return virtualFrameSceneBufferService.getAllByframeBufferId(VirtualFrameSceneBufferId);
    }
    @GetMapping("/saveAll/{framebufferName}")//Fetching All VirtualFrameSceneframebufferName in Server
    public String getAllByframeBufferName(String framebufferName){
        return virtualFrameSceneBufferRepository.saveAllByframebufferName(framebufferName);
    }


}
