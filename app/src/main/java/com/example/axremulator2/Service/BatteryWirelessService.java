package com.example.axremulator2.MainAxr.New_Implement.Service;

import com.example.axremulator2.MainAxr.New_Implement.Repository.BatteryWirelessRepository;

@Service
public class BatteryWirelessService {
    @Autowired
    public BatteryWirelessRepository batteryWirelessRepository;
    public String getTextWifiInfo(String textWifiInfo) {
        return batteryWirelessRepository.saveAllBytextWifiInfo(textWifiInfo);
    }
    public String getAllByBtnInfo(String btnInfo){
        return batteryWirelessRepository.saveAllByBtnInfo(btnInfo);
    }
    public String findAllByBatteryType(String BatteryType){
        return batteryWirelessRepository.findAllByBatteryType(BatteryType);
    }
     public String getAllByBatteryConnectStatus(String BatteryConnectStatus){
        return batteryWirelessRepository.saveAllByBatteryConnectStatus(BatteryConnectStatus);//Fetching BatteryStatusConnetStatus
     }
}
