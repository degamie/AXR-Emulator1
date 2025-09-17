@Repository
public interface FullScreenProviderRepository extends JpaRepository<FullScreenProvider,String>{
    public String findAllByScreenName(String ScreenName);
}
