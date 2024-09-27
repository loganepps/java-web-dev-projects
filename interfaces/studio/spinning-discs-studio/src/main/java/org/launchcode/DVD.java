package org.launchcode;


public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String discType, double transferRate, int capacity, int spinSpeed, int layers, int usedCapacity, String contents) {
        super(discType, transferRate, capacity, spinSpeed, layers, usedCapacity, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("this " + getDiscType() + "spins at " + getSpinSpeed());
    }

    @Override
    public void storeData() {
        System.out.println(getDiscType() + "stores 100gb");
    }

    @Override
    public void readData() {
        System.out.println("reading video data from " + getDiscType());
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
