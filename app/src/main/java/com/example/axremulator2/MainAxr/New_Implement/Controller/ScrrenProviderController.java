package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.Common.helpers.FullScreenProvider;

import com.example.axremulator2.MainAxr.New_Implement.Service.ScrrenProviderService;
//import com.example.axremulator2.MainAxr.New_Implement.Repository.ScrrenProviderRepository;
public class ScrrenProviderController {
    @Autowried
     public ScrrenProviderService scrrenProviderService;
    @GetMapping("/saveAll/{ScreenId}")
    public String getAllByScreenId(@PathVariabk "ScreenId" String ScreenId, @RequestBody FullScreenProvider){
        return scrrenProviderService.getAllByScreenId(ScreenId);
    }
}
