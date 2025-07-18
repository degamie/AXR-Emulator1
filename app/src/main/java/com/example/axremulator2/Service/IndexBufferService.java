package com.example.axremulator2.MainAxr.New_Implement.Service;

import com.example.axremulator2.Common.helpers.IndexBuffer;
import com.example.axremulator2.Common.helpers.IndexBufferRepository;

@Repository
public class IndexBufferService {
    @Autowired
    public IndexBufferRepository indexBufferRepository;//Injexting Indx Buffer Classs
    public String getAllByBufferSize (Integer bufferSize){
        return indexBufferRepository.saveAllByBufferSize(bufferSize);
    }

}