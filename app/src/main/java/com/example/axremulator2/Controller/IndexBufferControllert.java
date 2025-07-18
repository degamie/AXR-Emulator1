package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.Common.helpers.IndexBufferRepository;
import com.example.axremulator2.MainAxr.New_Implement.Service.IndexBufferService;

@Controller
public class IndexBufferController{//Controller Claas Declare
    @Autowired
    public IndexBufferService indexBufferService;//Injecting  IndxBuffer's Service Classs
    @GetMapping("/saveAll/{bufferSize}")
    public String getAllByBufferSize (Integer bufferSize){// fetching Buffer Size
        return indexBufferService.getAllByBufferSize(bufferSize);
    }

}