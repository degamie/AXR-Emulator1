package com.example.axremulator2.Service;

import com.example.axremulator2.Repository.BatteryReciever;

@Controller
public class BatteryReciverController {//Controller Class Declare
    @Autowired
     public BatteryReciverService batteryRecieverService ;//Injecting Service lAYER
    public BatteryReciverServiceController BatteryReciverServiceController=null;//Initializing Controller Obj
    @GetMapping("/save/{All}")
    public String GetAll(){//fetching All Req. Data
        return batteryRecieverService.saveAll();//Saving All BatteryReciverServices
    }
}
