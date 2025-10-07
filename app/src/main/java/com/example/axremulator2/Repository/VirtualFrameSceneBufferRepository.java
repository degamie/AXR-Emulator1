package com.example.axremulator2.MainAxr.New_Implement.Repository;

@Repository
public interface VirtualFrameSceneBufferRepository extends JpaRepository<VirtualFrameSceneBuffer,String>{
    public String saveAllByFrameBufferId(String FrameBufferId);
    public String findAllByFrameBufferId(String FrameBufferId);
    public String saveAllByBufferName(String FrameBufferName);
}
