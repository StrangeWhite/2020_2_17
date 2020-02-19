package com.company.real;

import com.company.ab2.CPU;

public class AMDCPU extends CPU {

    public AMDCPU(String name, double price, int coreNum) {
        super(name, price, coreNum);
    }

    @Override
    public void work() {
        System.out.println("AMDCPU is working~~~~~~~");
    }
}
