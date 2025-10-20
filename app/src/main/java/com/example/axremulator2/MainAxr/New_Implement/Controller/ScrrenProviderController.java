package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.Common.helpers.FullScreenProvider;

import com.example.axremulator2.MainAxr.New_Implement.Service.ScrrenProviderService;
//import com.example.axremulator2.MainAxr.New_Implement.Repository.ScrrenProviderRepository;
@Controller
public class ScrrenProviderController {
    @Autowried
     public ScrrenProviderService scrrenProviderService;
    @GetMapping("/saveAll/{ScreenName}")
    public String getAllByScreenName(String ScreenName){return scrrenProviderService.getAllByScreenName(ScreenName);}//Fetching ScreenName
    @PostMapping("/saveAll/{ScreenId}")
    public String setAllByScreenId(String ScreenId){//ScreenId's Retrieval in Server
        return scrrenProviderRepository.findAllByScreenId(ScreenId);
    }

    @GetMapping("/saveAll/{ScreenId}")
    public String getAllByScreenId(@PathVariabk "ScreenId" String ScreenId, @RequestBody FullScreenProvider){
        return scrrenProviderService.getAllByScreenId(ScreenId);
    }
}
