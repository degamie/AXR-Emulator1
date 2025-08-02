package com.example.axremulator2.MainAxr.New_Implement.Repository;

@Repository
public interface ScrrenProviderRepository extends JpaRepository<ScrrenProvider,String>{
    @Autowired
     public ScrrenProvider screenprovider;
    public String saveAllByScreenId(String  ScreenId);
    public String findAllByScreenId(String ScreenId);

}
