package com.company.ab2;

import com.company.ab.Component;
import com.company.ab.Workable;

public abstract class Disk extends Component implements Workable {

    private int volume;  //单位：MB

    public Disk(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String description() {
        StringBuilder diskDesBuilder = new StringBuilder();
        diskDesBuilder.append(super.description())
                .append("Volume:{")
                .append(volume)
                .append("};");
        return diskDesBuilder.toString();
    }
}
