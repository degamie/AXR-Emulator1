package com.example.axremulator2.Common.helpers;

import javax.annotation.processing.Generated;

@Getter
@Setter
@AllParamsConstructor
@NoParamsConstructor
public class FullScreenProvider {
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    public Long screenId;
    public FullScreenProvider fullScreenProvider;
}
