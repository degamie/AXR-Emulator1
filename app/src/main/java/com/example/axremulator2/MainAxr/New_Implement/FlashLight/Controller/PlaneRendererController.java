package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.Common.helpers.PlaneRenderer;
import com.example.axremulator2.Service.PlaneRendererService;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class PlaneRendererController {
    public PlaneRendererController planeRendererController;
    @Autowired
    public  PlaneRendererService planeRendererService;
    @GetMapping("/saveAll/{IndexBuffer}")
    public String getAllBYIndexBuffer(@PathVariable ("IndexBuffer")String IndexBuffer, @RequestBody PlaneRenderer){
        return planeRendererService.getAllBYIndexBuffer(IndexBuffer);//fetching Indx Buffer in Server
    }
}
