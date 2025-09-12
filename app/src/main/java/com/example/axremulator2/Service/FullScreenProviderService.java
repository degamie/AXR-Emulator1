@Service
public class FullScreenProviderService{
    @Autowired
    public FullScreenProviderRepository fullScreenProviderRepository;
}
public String setAllByScreenId(String ScreenId){
    return fullScreenProviderRepository.findAllByScreenId(ScreenId);
}