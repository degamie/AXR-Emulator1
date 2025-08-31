package com.example.axremulator2.MainAxr.New_Implement.Service;

import com.example.axremulator2.Common.helpers.SampleRenderer;
import com.example.axremulator2.MainAxr.New_Implement.Repository.SampleRendererRepository;

@Service
public class SampleRendererService {
   @Autowired
   public SampleRendererRepository samplerenderRepository;
   public String getAllRenderer(int Renderer){
       return samplerenderRepository.saveAll(Renderer);
   }

}
