package com.example.axremulator2.MainAxr.New_Implement.Repository;

import com.example.axremulator2.Common.helpers.PlaneRenderer;

import javax.swing.SortOrder;

@Repository
public interface PlaneRendererIRepository extends JpaRepository<PlaneRenderer,String> {
    public PlaneRendererIRepository planerepository=new PlaneRendererRepository();
    @Autowired
    public PlaneRenderer planeRenderer;
    public String saveAllBYSortablePlanes(List<SortOrder>sortablePlanes);

    public String saveAllBYIndexBuffer(String IndxBuffer);

    public String findAllBYViewMatrix(float[] VIewMatrix);
    public String updateAllByViewMatrix(float[] ViewMatrix);
    public String saveAllByPlaneRender(float[] PlaneRenderer);

}
