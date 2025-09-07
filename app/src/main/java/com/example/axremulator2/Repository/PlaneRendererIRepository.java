package com.example.axremulator2.MainAxr.New_Implement.Repository;

import com.example.axremulator2.Common.helpers.PlaneRenderer;

@Repository
public interface PlaneRendererIRepository extends JpaRepository<PlaneRenderer,String> {
    public PlaneRendererIRepository planerepository=new PlaneRendererRepository();
    @Autowired
    public PlaneRenderer planeRenderer;

    public String saveAllBYIndexBuffer(String IndxBuffer);
    public String findAllBYViewMatrix(float[] VIewMatrix);
    public String updateAllByViewMatrix(float[] ViewMatrix);

}
