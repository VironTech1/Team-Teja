// 1. Car has speed and it can be changed by acceleration and applying break.


package com.southen.homeworks;

class Vehicle {
    String name;

    public void sound() {
        System.out.println("Every vehicle has its own sounds");
    }
}

class Car extends Vehicle {

    String make;
    String model;
    double speed;

    public void sound() {
        System.out.println("Car makes sounds like vroom vroom");
    }

    public void accelerate(double speedIncrease) {
        speed += speedIncrease;
        System.out.println("The car is accelerated at the speed of " + speed + " m/h");
    }
    

    public void applyBrake(double reduceSpeed) {
        if (speed > 0 && reduceSpeed <= speed) {
            speed -= reduceSpeed;
            System.out.println("The vehicle speed after applying the brake: " + speed);
        } else if (reduceSpeed > speed) {
            System.out.println("The reduced speed should not be more than the actual speed of the vehicle");
        } else {
            System.out.println("The vehicle is at rest position");
        }
    }
}

public class VehicleRunner{

    public static void main(String[] args) {

        Car car = new Car();
        car.speed = 38;

        //car.accelerate(40);

        car.applyBrake(60);
    }
}
