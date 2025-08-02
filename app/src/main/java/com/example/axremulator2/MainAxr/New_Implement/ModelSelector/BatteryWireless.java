package com.example.axremulator2.MainAxr.New_Implement.ModelSelector;

import org.intellij.lang.annotations.Identifier;
@Getter
@Setter
@AllParamsConstructor
@NoParamsConstructor
public class BatteryWireless {
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    public String BatteryType;

}
