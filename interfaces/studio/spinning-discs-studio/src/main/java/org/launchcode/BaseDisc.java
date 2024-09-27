package org.launchcode;

public abstract class BaseDisc {
    private String discType;
    private double transferRate;
    private int capacity;
    private int spinSpeed;
    private int layers;
    private int usedCapacity;
    private String contents;

    public BaseDisc(String discType, double transferRate, int capacity, int spinSpeed, int layers, int usedCapacity, String contents)
    {
        this.discType = discType;
        this.transferRate = transferRate;
        this.capacity = capacity;
        this.spinSpeed = spinSpeed;
        this.layers = layers;
        this.usedCapacity = usedCapacity;
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public double getTransferRate() {
        return transferRate;
    }

    public void setTransferRate(double transferRate) {
        this.transferRate = transferRate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


}


