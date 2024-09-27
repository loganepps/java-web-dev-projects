package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String discType, double transferRate, int capacity, int spinSpeed, int layers, int usedCapacity, String contents) {
        super(discType, transferRate, capacity, spinSpeed, layers, usedCapacity, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("this " + getDiscType() + "spins at " + getSpinSpeed());
    }

    @Override
    public void storeData() {
        System.out.println(getDiscType() + "stores 500mb");
    }

    @Override
    public void readData() {
        System.out.println("reading audio data from " + getDiscType());
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
