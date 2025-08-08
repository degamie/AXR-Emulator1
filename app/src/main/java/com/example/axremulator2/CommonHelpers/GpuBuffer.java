package com.example.axremulator2.Common.helpers;

import org.intellij.lang.annotations.Identifier;

@Getter
@Setter
@NoParamsConstructor
@AllParamsConstructor//Parma's Methods Declare
public class GpuBuffer {
    @Id
    @GeneratedValue(strategy=GENERATIONTYPE.IDENTITY)
    public  Long GpuBufferId;//BufferID Declare
}
