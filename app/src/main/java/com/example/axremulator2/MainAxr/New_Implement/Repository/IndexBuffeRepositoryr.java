package com.example.axremulator2.Common.helpers;
import static com.example.axremulator2.MainAxr.New_Implement.Repository.GpuBufferRepository.gpuBuffer;

import com.example.axremulator2.Common.helpers.IndexBuffer;

@Repository
public interface IndexBufferRepository extends JpaRepository<IndexBuffer,String> {
    public String saveAllByIndexBufferId(String IndexBufferId);//Fetching IndxBufferId
    public String findAllByIndexBufferId(String IndexBufferId);
    public String saveAllByBufferSize(Integer bufferSize);
    public String findAllByBufferSize(Integer bufferSize);//Finding BufferSize
    public String saveAllByIndexNumber(String BufferNumber);
    public String findAllByIndexNumber(String BufferNumber);//BufferNumber's Finding In IndexBuffer

}