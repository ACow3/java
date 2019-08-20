package com.phoneassignment.phones;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String ringer = "IPhone " + this.getVersionNumber() + " says " + this.getRingTone();
		return ringer;
    }
    @Override
    public String unlock() {
		return "Unlock with Facial Recognition";
        
    }
    @Override
    public void displayInfo() {
        System.out.format("IPhone %s from %s %n" , this.getVersionNumber(), this.getCarrier());          
    }
}