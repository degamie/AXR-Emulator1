package com.example.axremulator2.MainAxr.New_Implement.Service;

import android.net.ConnectivityManager;

@Controller
public class BatteryReciverController {//Controller Class Declare
    @Autowired
     public BatteryReciverService batteryRecieverService ;//Injecting Service lAYER
    public BatteryReciverServiceController BatteryReciverServiceController=null;//Initializing Controller Obj
    @GetMapping("/save/{All}")
    public String GetAll(){//fetching All Req. Data
        return batteryRecieverService.saveAll();//Saving All BatteryReciverServices
    }
        @PostMapping("/findAll/{networkInfo}")
        public String setAllByNetworkInfo(String networkInfo){// NetworkInfo's Retreival
        return batteryRecieverService.setAllByNetworkInfo(networkInfo);
    }
    @GetMapping("/saveAll/{ConnectivityManager}")
    public String getAllConnectivityManager(ConnectivityManager connectivityManager){
        return  batteryRecieverRepository.saveAllConnectivityManager(connectivityManager);
    }



}
