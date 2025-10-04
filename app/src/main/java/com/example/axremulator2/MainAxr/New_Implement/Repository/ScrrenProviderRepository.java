package com.example.axremulator2.MainAxr.New_Implement.Repository;

import com.example.axremulator2.Common.helpers.FullScreenProvider;

@Repository
public interface ScrrenProviderRepository extends JpaRepository<FullScreenProvider,String>{
    @Autowired
     public ScrrenProvider screenprovider;
    public String saveAllByScreenId(String  ScreenId);
    public String findAllByScreenId(String ScreenId);
    public String updateAllByScreenId(String ScreenId);

}
