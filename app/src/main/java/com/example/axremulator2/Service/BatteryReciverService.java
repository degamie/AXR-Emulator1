package com.example.axremulator2.Service;

import com.example.axremulator2.Repository.BatteryReciever;

@Service
public class BatteryReciverService {
    @Autowired
    public BatteryRecieverRepository batteryRecieverRepository;
    public String GetAll(){
        return batteryRecieverRepository.saveAll();//Saving All BatteryReciverServices
    }
}
