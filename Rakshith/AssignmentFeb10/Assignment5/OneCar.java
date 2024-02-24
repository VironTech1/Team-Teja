package Assignment5;

import java.util.Scanner;

public class OneCar {

    int speed;

    public OneCar(){

    }

    void acceleration(int acceleration){


        if(acceleration>0){

            speed=speed+acceleration;
            System.out.println("Speed after acceleration :: "+speed);
        }else{
            System.out.println("Acceleration is negative, please enter positive ");
        }

    }

    void carBreak(int carBreak){
        if (carBreak>0){
            if(carBreak>=speed){
                speed=0;
            }else {
                speed = speed - carBreak;
               // System.out.println("Speed after car break greater or equal to zero"+speed);
            }
            System.out.println("Speed after applied breaks "+ speed);
        }
        else {
            System.out.println("Car Break must be positive:: ");
        }

    }

    public static void main(String[] args) {
        OneCar car= new OneCar();

        car.acceleration(40);
        car.carBreak(30);
        car.acceleration(40);
        car.carBreak(30);
        car.acceleration(40);
       // System.out.println(car.getSpeed());
    }

}
