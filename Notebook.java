package com.company;

public class Notebook {
    private String OZU = "", HDD = "", OS = "", color = "";

    public Notebook(){

    }

    public Notebook(String OZU, String HDD, String OS, String color){
        this.OZU = OZU;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
    }

    public void setOZU(String OZU) {
        this.OZU = OZU;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOZU() {
        return OZU;
    }

    public String getOS() {
        return OS;
    }

    public String getHDD() {
        return HDD;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "OZU='" + OZU + '\'' +
                ", HDD='" + HDD + '\'' +
                ", OS='" + OS + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
