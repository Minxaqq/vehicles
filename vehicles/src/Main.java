import java.sql.SQLOutput;

interface Vehicle {
     void start();
     void stop();
    default void fuelUp(){
        System.out.println("tankowanie pojazdu");
    }
    static void service(){
        System.out.println("pojazd wymaga serwisu");
    }
}
 class Car implements Vehicle {
    public void start() {
        System.out.println("car start");
    }
    public void stop() {
        System.out.println("car stop");
    }
}
class Motorocycle implements Vehicle {
    public void start() {
        System.out.println("car start");
    }
    public void stop() {
        System.out.println("car stop");
    }
}

public class Main {
    public static void main(String[] args) {
    Car car = new Car();
        System.out.println("auto:");
    car.start();
    car.stop();
    car.fuelUp();
    Vehicle.service();
    Motorocycle motor = new Motorocycle();
        System.out.println("motor:");
    motor.start();
    motor.stop();
    motor.fuelUp();
    Vehicle.service();
    }
}