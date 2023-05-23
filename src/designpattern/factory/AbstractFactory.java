package designpattern.factory;

import designpattern.factory.Vehicle;

public interface AbstractFactory {
    Vehicle getVehicle(String type);
}
