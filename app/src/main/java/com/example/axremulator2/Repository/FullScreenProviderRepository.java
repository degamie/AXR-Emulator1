@Repository
public interface FullScreenProviderRepository extends JpaRepository<FullScreenProvider,String>{
    public String findAllByScreenId(String ScreenId);
}