package com.phoneassignment.phones;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String ringer = "Galaxy " + this.getVersionNumber() + " says " + this.getRingTone();
    	return ringer;
        
    }
    @Override
    public String unlock() {
		return "Unlock phone via finger print";
        
    }
    @Override
    public void displayInfo() {
        System.out.format("Galaxy %s from %s %n", this.getVersionNumber(), this.getCarrier());           
    }
}