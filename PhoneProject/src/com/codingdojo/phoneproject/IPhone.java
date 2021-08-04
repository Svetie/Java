package com.codingdojo.phoneproject;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
    	return (String.format("IPhone %s says %s", this.getVersionNumber(), this.getRingTone()));
    }
    
    @Override
    public String unlock() {
        return "Unlocking via facial recognition";
    }
    
    @Override
    public void displayInfo() {
        System.out.println(String.format("IPhone %s from %s", this.getVersionNumber(), this.getCarrier()));            
    }
}


