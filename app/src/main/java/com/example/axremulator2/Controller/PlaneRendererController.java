package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.Common.helpers.PlaneRenderer;
import com.example.axremulator2.MainAxr.New_Implement.Service.PlaneRendererService;

@Controller
public class PlaneRendererController {
    public PlaneRendererController planeRendererController;
    @Autowired
    public  PlaneRendererService planeRendererService;
    @GetMapping("/saveAll/{IndexBuffer}")
    public String getAllBYIndexBuffer(@PathVariable ("IndexBuffer")String IndexBuffer, @RequestBody PlaneRenderer){
        return planeRendererService.getAllBYIndexBuffer(IndexBuffer);//fetching Indx Buffer in Server
    }
    @PostMapping("/findAll/{ViewMatrix}")
    public String setAllBYViewMatrix(float[] VIewMatrix){
        return  planeRendererService.setAllBYViewMatrix(VIewMatrix);
    }

}
