package com.example.axremulator2.MainAxr.New_Implement.Service;

import com.example.axremulator2.MainAxr.New_Implement.Repository.ScrrenProviderRepository;

@Service
public class ScrrenProviderService{
    @Autowired
    public ScrrenProviderRepository scrrenProviderRepository;
    public String setAllByScreenId(String ScreenId){//Binding ScreenId
        return scrrenProviderRepository.findAllByScreenId(ScreenId);
    }
    public String getAllByScreenId(String ScreenId){
        return scrrenProviderRepository.saveAllByScreenId(ScreenId);
    }
}
