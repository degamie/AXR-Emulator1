package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.MainAxr.New_Implement.Service.BatteryWirelessService;

@Controller
public class BatteryWirelessController {
    @Autowired
    public BatteryWirelessService batteryWirelessService;
    public String getTextWifiInfo(String textWifiInfo){
        return batteryWirelessService.getTextWifiInfo(textWifiInfo);
    }
    public String getAllByBtnInfo(String btnInfo){
        return batteryWirelessService.getAllByBtnInfo(btnInfo);
    }
    @PostMapping("/find/{BatteryType}")
    public String setAllByBatteryType(String BatteryType){
        return batteryWirelessService.findAllByBatteryType(BatteryType);
    }
    @GetMapping("/saveAll/{BatteryConnectStatus}")
        public String getAllByBatteryConnectStatus(String BatteryConnectStatus){
        return batteryWirelessService.saveAllByBatteryConnectStatus(BatteryConnectStatus);//Fetching BatteryStatusConnetStatus
     }
}
