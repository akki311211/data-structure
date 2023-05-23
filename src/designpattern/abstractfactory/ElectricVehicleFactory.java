package designpattern.abstractfactory;

import designpattern.factory.AbstractFactory;
import designpattern.factory.Vehicle;

public class ElectricVehicleFactory implements AbstractFactory {
    @Override
    public Vehicle getVehicle(String type) {
        if("Truck".equalsIgnoreCase(type)){
            return new ElectricTruck();
        }else if("Car".equalsIgnoreCase(type)){
            return new ElectricCar();
        }
        return null;
    }
}
