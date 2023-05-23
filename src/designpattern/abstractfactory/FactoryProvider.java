package designpattern.abstractfactory;

import designpattern.factory.AbstractFactory;
import designpattern.factory.VehicleFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(boolean electric){
        if(electric){
            return new ElectricVehicleFactory();
        }else{
            return new VehicleFactory();
        }
    }
}
