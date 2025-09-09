package com.example.axremulator2.MainAxr.New_Implement.Repository;

import com.example.axremulator2.Common.helpers.SampleRenderer;

 @Repository
public interface SampleRendererRepository extends JpaRepository<SampleRenderer,String >{
    @Autowired
    public SampleRenderer samplerender;
    public String getRenderer(int Renderer);
    public String saveAllByViewPortHeight(Integer ViewPortHeight);

     public String saveAllByBufferId(String BufferId);
     public String findAllByBufferId(String BufferId);
}
