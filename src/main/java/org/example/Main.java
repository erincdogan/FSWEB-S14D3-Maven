package org.example;

import org.example.company.*;
import org.example.arge.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        CarSkeleton carSkeleton = new CarSkeleton("Mercedes", "Base car");
//        System.out.println(carSkeleton.startEngine());
//        GasPoweredCar gasPoweredCar = new GasPoweredCar("BMW", "Canavar", 5.5, 8);
//        System.out.println(gasPoweredCar.startEngine());
//        System.out.println(gasPoweredCar.drive());
//        ElectricCar electricCar = new ElectricCar("Tesla", "Ceryanlı", 500, 80);
//        System.out.println(electricCar.startEngine());
//        System.out.println(electricCar.drive());
//        HybridCar hybridCar = new HybridCar("BYD", "Çinli", 750, 30, 4);
//        System.out.println(hybridCar.startEngine());
//        System.out.println(hybridCar.drive());
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());
    }
}