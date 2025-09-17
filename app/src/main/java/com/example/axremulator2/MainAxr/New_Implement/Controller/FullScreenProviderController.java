@Controller
public class FullScreenProviderController{
    @Autowired
    public FullScreenProviderService fullScreenProviderService;
    @GetMapping("/saveAll/{ScreenProviderName})


    public String getFullScreenProviderName(String ScreenProviderName){
        return fullScreenProviderService.getFullScreenProviderName(ScreenProviderName);
        }