package com.example.axremulator2.MainAxr.New_Implement.Repository;

import com.example.axremulator2.Common.helpers.SampleRenderer;

//WID(23/12/2025)(DegamieSign)
 @Repository
public interface SampleRendererRepository extends JpaRepository<SampleRenderer,String >{
    @Autowired
    public SampleRenderer samplerender;
    public String getRenderer(int Renderer);
    public String saveAllByViewPortHeight(Integer ViewPortHeight);
    public String findAllByViewPortWidth(Integer ViewPortWidth);

     public String saveAllByBufferId(String BufferId);
     public String findAllByBufferId(String BufferId);
     public void findAllByviewPortSize(float viewPortSize);
     public String saveByviewPortSize(float viewPortSize);//Fetchign PortSize in App
}
