@Repository
public interface FullScreenProviderRepository extends JpaRepository<FullScreenProvider,String>{
    public String saveAllByScreenName(String ScreenName);//Fetching ScreenName
    public String findAllByScreenName(String ScreenName);

}
