package com.example.axremulator2.MainAxr.Camera;

@Repository
public interface CameraRepository extends JpaRepository<Cameramdl,String> {
    public String saveAllByCameraState(String camerastate);
    public void findAllByCameraState(Camera CameraState);
public Cameramdl cameramdl;

    public String OnRequestPermisission(String reqCode,String Permission,Boolean grantPermission);
    public String cameraAeAutoCharacter();
    public String saveAllByCameraLensView(Camera cameraState);
    public String findAllByCameraLensView(Camera cameraState);
}
