@Controller
public class FullScreenProviderService{
    @Autowired
    public FullScreenProviderService fullScreenProviderService;
}
@PostMapping("/findAll/{ScreenId}")//Binding ScreenId in Server
public String setAllByScreenId(String ScreenId){
    return fullScreenProviderRepository.findAllByScreenId(ScreenId);
}