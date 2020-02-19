package com.company.ab2;

import com.company.ab.Component;
import com.company.ab.Workable;

public abstract class CPU extends Component implements Workable {

    private int coreNum;

    public CPU(String name, double price, int coreNum) {
        super(name, price);
        this.coreNum = coreNum;
    }

    public String description(){
        StringBuilder cpuDesBuilder = new StringBuilder();
        cpuDesBuilder.append(super.description())
                .append("CoreNum:{")
                .append(coreNum)
                .append("};");
        return cpuDesBuilder.toString();
    }

}
