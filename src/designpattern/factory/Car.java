package designpattern.factory;

public class Car implements Vehicle{
    @Override
    public String getType() {
        return "This is car";
    }
}
