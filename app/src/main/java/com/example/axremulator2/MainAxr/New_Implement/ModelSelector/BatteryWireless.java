package com.example.axremulator2.MainAxr.New_Implement.ModelSelector;

import com.example.axremulator2.Model.BatteryReciever;
import org.intellij.lang.annotations.Identifier;
@Getter
@Setter
@AllParamsConstructor
@NoParamsConstructor
public class BatteryWireless extends BatteryReciever{
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    @Column(unqiue=true,nullable=false)
    public String BatteryType;
    @Column(unqiue=false,nullable=true)
    public String BatteryConnectStatus;
   
  

}
