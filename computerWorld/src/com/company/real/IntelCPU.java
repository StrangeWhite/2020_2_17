package com.company.real;

import com.company.ab2.CPU;

public class IntelCPU extends CPU {

    public IntelCPU(String name, double price, int coreNum) {
        super(name, price, coreNum);
    }

    @Override
    public void work() {
        System.out.println("IntelCPU is working~~~~~~~");
    }
}
