package com.example.axremulator2.Service;

import com.example.axremulator2.Repository.BatteryWirelessRepository;

@Service
public class BatteryWirelessService {
    @Autowired
    public BatteryWirelessRepository batteryWirelessRepository;
    public String getTextWifiInfo(String textWifiInfo){
        return batteryWirelessRepository.saveAllBytextWifiInfo(textWifiInfo);

    }
}
