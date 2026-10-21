package com.pluralsight;

public class CellPhone {
    //serialNumber, model, carrier, phoneNumber, owner
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
    //   public String getName() {
    //      return this.name;
    //   }
    //   public void setName(String name) {
    //      this.name = name;

    public int getSerialNumber(){
        return this.serialNumber;
    }
    public String getModel(){
        return this.model;
    }
    public String getCarrier(){
        return this.carrier;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getOwner(){
        return this.owner;
    }
}
