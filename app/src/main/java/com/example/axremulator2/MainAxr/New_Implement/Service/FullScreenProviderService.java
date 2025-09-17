public class FullScreenProviderService{
    @Autowired
    public FullScreenProviderRepository fullScreenProviderRepositor;
    public String getFullScreenProviderName(String ScreenProviderName){
        return FullScreebProivderRepository.saveAllByFullScreenPviderName(ScreenProviderName);
        }