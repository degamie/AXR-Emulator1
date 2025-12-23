import java.util.List;

import android.content.Context;
import android.content.Intent;
import com.example.wirelesschargingapplication.axr.AXR_Application.app.src.main.java.com.example.axr_application.BatterySimulator.BatteryListener;

//WID(23/12/2025)Sarthak Mittal#1
@Repository
public interface BatteryListenerRepository extends JpaRepository<batterylistner,String>{
    @Autowired
    public BatteryListener batterylistner;
    public String saveAllByIntent(Intent intent);
    public String findAllByIntent(Intent intent);
    public String updateByIntent(Intent intent);//updating Intent In App
    public String saveAllByStatus(String status);
    public String findAllByStatus(String status);// Finding BatteryStatus
    public String  saveAllById(String BatteryId);
    public String findAllByContext(Context context);
    public  List<BatteryListener> saveAllByContext(String BatteryId);
    public List<BatteryListener> saveAll(String BatteryId);
    public  List<BatteryListener> saveAllById(String BatteryId);
    public String findAllById(String BatteryId);
    public String saveAllByBatteryStatus(String BatteryId);
    public String findAllByBatteryStatus(String Status);
    public String saveAllByIntentAction(IntentAction intentAction);
    public void findAllByIntentAction(IntentAction intentAction);
    public String updateAllBYIntentAction(IntentAction intentAction);
    public String existsAllByIntentAction(IntentAction intentAction);
}
