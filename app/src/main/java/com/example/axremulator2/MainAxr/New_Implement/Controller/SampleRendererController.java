package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.Common.helpers.SampleRenderer;
import com.example.axremulator2.MainAxr.New_Implement.Service.SampleRendererService;

@Controller
public class SampleRendererController{
   @Autowired
   public SampleRendererService samplerenderService;
   @GetMapping("/saveAll/{Renderer}")
    public String getAllRenderer(int Renderer){
        return samplerenderService.getAllRenderer(Renderer);
    }
    @GetMapping("/saveAll/{ViewPortHeight}")
    public String getAllByViewPortHeight(Integer ViewPortHeight){
        return  samplerenderRepository.saveAllByViewPortHeight(ViewPortHeight);
    }
    @GetMappping("/saveAll/{BufferId}")//Fetching BufferId in Server
    public String getAllByBufferId(String BufferId){
        return  samplerenderRepository.saveAllByBufferId(BufferId);
    }
    @PostMappping("/saveAll/{ViewPortWidth}")//Retrieving  ViewPortWidth in Server

    public String setAllByViewPortWidth(Integer ViewPortWidth){
         return samplerenderService.setAllByViewPortWidth(ViewPortWidth);
    }

}
