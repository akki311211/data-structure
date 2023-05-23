package designpattern.factory;

public class VehicleFactory implements AbstractFactory{

    @Override
    public Vehicle getVehicle(String type) {
        if("Truck".equalsIgnoreCase(type)){
            return new Truck();
        }else if("Car".equalsIgnoreCase(type)){
            return new Car();
        }
        return null;
    }
}
