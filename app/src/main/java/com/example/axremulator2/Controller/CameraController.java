@Controller
public  class CamerController extends FlashLightController{
    @Auotwired
    public CameraService cameraService;
    @Auotwired
    public FlashLightController flashLightController
    @GetMapping("/saveAll/{CameraState}")
    public String getAllCamera(@RequestBody Camera cameraState,@PathVariable "flasgLightId" String flashLightId ,@RequestBody FlashLight  flashLight){
        return cameraService.getAllCamera(cameraState,flashLight);
    }

}