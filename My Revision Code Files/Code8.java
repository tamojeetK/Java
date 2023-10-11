
class Vehicle {
    public void drive() {
    }
}
/*
 * Also, you need to add a drive() method in your Vehicle class because you’re
 * trying to override it in your subclasses.
 * If you don’t want to implement the method in the Vehicle class,
 * you can make it an abstract method in an abstract class or provide a default
 * implementation
 */

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("The Car is driving! ");
    }
}

class Truck extends Vehicle {
    @Override
    public void drive() {
        System.out.println("The Truck is driving! ");
    }
}

class Bike extends Vehicle {
    @Override
    public void drive() {
        System.out.println("The Bike is driving! ");
    }
}

public class Code8 {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();

        Vehicle[] vehicles = { car, bike, truck };

        // car.drive();

        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }

    }
}