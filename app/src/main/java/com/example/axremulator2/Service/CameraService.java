@Service
public class CameraService extends FlashLight {
    public FlashLight flashLight;
    @Autowired
    public CameraRepository cameraRepository;

    public String getAllCamera(Camera camerstate, FlashLight flashLight) {
        while (camerastate != flashlightId) {
            if (camerstate.CAMERA_STATE_ON) {
                cameraRepository.saveAllCamera(camerstate) += flashLightController.TorchLightToggleFlash(flashLight);
            } else cameraRepository.saveAllCamera(0);
        }
        return cameraRepository.saveAllCamera(camerstate);

    }
}