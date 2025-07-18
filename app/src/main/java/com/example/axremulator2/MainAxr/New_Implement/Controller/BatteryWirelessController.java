package com.example.axremulator2.MainAxr.New_Implement.Controller;

import com.example.axremulator2.MainAxr.New_Implement.Service.BatteryWirelessService;

@Controller
public class BatteryWirelessController {
    @Autowired
    public BatteryWirelessService batteryWirelessService;
    public String getTextWifiInfo(String textWifiInfo){
        return batteryWirelessService.getTextWifiInfo(textWifiInfo);

    }

}
