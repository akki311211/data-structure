package designpattern.prototype;

public class ConcretePrototype implements Prototype{
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ConcretePrototype obj1 = new ConcretePrototype();
        ConcretePrototype obj2 = (ConcretePrototype) obj1.clone();
    }
}
