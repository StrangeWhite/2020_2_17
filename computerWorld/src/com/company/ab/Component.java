package com.company.ab;

public abstract class Component {

    private double price;    //单位：yuan
    private String name;

    public Component(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String description(){
        StringBuilder descriptionBuilder = new StringBuilder();
        descriptionBuilder.append("Name:{")
                .append(name)
                .append("};Price:{")
                .append(price)
                .append("};");
        return descriptionBuilder.toString();
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
