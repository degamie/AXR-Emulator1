package com.example.axremulator2.MainAxr.New_Implement.Service;

@Service
public class BatteryReciverService {
    @Autowired
    public BatteryRecieverRepository batteryRecieverRepository;
    public String GetAll(){
        return batteryRecieverRepository.saveAll();//Saving All BatteryReciverServices
    }
}
