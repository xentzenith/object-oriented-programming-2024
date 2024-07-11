class Vehicle {
    String make;
    String model;
    int year;
    int gear = 3;

    void start() {
        System.out.println("Vehicle is starting.");
    }

    void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

class Car extends
        Vehicle {
    int numberOfDoors;

    void accelerate() {
        System.out.println("Car is accelerating.");
    }

    void brake() {
        System.out.println("Car is braking.");
    }

    String changeGear(int rotation){
        String[] gearName = {"D", "N", "R", "P"};
        
        if (rotation == 1){
            gear++;
            System.out.println("Gear changed to " + gearName[gear]);
        } else if (rotation == -1){
            gear--;
            System.out.println("Gear changed to " + gearName[gear]);
        }else{
            System.out.println("Invalid input rotation only 1(up) or -1(down)");
        }

        return gearName[gear];
    }
}

class Mtcycle extends Vehicle {
    boolean hasSidecar;

    void wheelie() {
        System.out.println("Motorcycle is performing a wheelie.");
    }

    void honkHorn() {
        System.out.println("Beep beep!");
    }

    void hasSidecar() {
        System.out.println("Motorcycle has a sidecar.");
    }
}

public class Lab6 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();

        Car car = new Car();
        car.start();
        car.changeGear(-1);// R
        car.changeGear(-1);// N
        car.changeGear(-1);// D [drive]
        car.accelerate();
        car.changeGear(1);// N
        car.changeGear(1);// R
        car.changeGear(1);// P [parked]
        car.brake();
        car.stop();

        Mtcycle motorcycle = new Mtcycle();
        motorcycle.start();
        motorcycle.wheelie();
        motorcycle.honkHorn();
        motorcycle.hasSidecar();
        motorcycle.stop();
    }
}
