package com.example.axremulator2.MainAxr.New_Implement.Service;

import android.net.ConnectivityManager;

import com.example.axremulator2.MainAxr.New_Implement.Repository.BatteryRecieverRepository;

@Service
public class BatteryReciverService {
    @Autowired
    public BatteryRecieverRepository batteryRecieverRepository;
    public String GetAll(){
        return batteryRecieverRepository.saveAll();//Saving All BatteryReciverServices
    }
    public String setAllByNetworkInfo(String networkInfo){
        return batteryRecieverRepository.findAllByNetworkInfo(networkInfo);
    }
    public String getAllConnectivityManager(ConnectivityManager connectivityManager){
        return  batteryRecieverRepository.saveAllConnectivityManager(ConnectivityManager connectivityManager)
    }
}
