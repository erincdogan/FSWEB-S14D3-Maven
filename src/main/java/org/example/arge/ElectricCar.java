package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }
    public String startEngine() {
        return super.getName() + " " + super.getDescription() + " "+ avgKmPerCharge + " "+ batterySize + " "+"is starting";
    }

    @Override
    public String drive() {
        return super.getName() + " " + super.getDescription() + " "+ avgKmPerCharge + " "+batterySize +" "+ "is driving";
    }
}

