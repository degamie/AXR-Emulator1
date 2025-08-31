package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.Common.helpers.SampleRenderer;
import com.example.axremulator2.MainAxr.New_Implement.Service.SampleRendererService;

@Controller
public interface SampleRendererController{
   @Autowired
   public SampleRendererService samplerenderService;
   @GetMapping("/saveAll/{Renderer}")
    public String getAllRenderer(int Renderer){
        return samplerenderService.getAllRenderer(Renderer);
    }

}
