package designpattern.abstractfactory;

import designpattern.factory.Vehicle;

public class ElectricCar implements Vehicle {
    @Override
    public String getType() {
        return "Electric Car";
    }
}
