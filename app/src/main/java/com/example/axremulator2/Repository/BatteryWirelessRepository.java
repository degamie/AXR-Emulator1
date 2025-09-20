package com.example.axremulator2.MainAxr.New_Implement.Repository;

import com.example.axremulator2.Old_PCKGS.helpers.axr_application.BatteryWireless;

@Repository
public interface BatteryWirelessRepository extends JpaRepository<BatteryWireless,String> {
    public String saveAllBytextWifiInfo(String textWifiInfo);
    public String findAllBytextWifiInfo(String textWifiInfo);
    public String saveAllByBtnInfo(String btnInfo);
    public String findAllByBtnInfo(String btnInfo);
    public String findAllByBatteryType(String BatteryType);
    public String saveAllByBatteryConnectStatus(String BatteryConnectStatus);
    public String saveAllByWireType(String WireType);
}
