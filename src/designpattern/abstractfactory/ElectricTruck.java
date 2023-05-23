package designpattern.abstractfactory;

import designpattern.factory.Vehicle;

public class ElectricTruck implements Vehicle {
    @Override
    public String getType() {
        return "Electric Truck";
    }
}
