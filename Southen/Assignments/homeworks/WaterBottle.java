
//4. Water bottle has capacity and water level.
//   Water level can be changed by filling, sipping and emptying.
//Make sure that water level can't cross bottle capacity when filling and it should be reduced by sipping and emptying. Check all conditions and write program.

package com.in28minutes.oops.Exercises;

public abstract class WaterBottle {

	
	public void filling() {
		
	}
	
	public void sipping() {
		
	}
	
	public void emptying() {
		
	}
}



 class Aluminium {
    double bottleCapacity = 10;
    double waterLevel = 3;

    public void filling(double newWaterCapacity) {
        double spaceLeft = bottleCapacity - waterLevel;
        if (newWaterCapacity > spaceLeft) {
            System.out.println("Cannot fill the bottle, it will overflow!");
        } else {
            waterLevel += newWaterCapacity;
            System.out.println("The water capacity is: " + waterLevel);
        }
    }

    public void sipping(double sipAmount) {
        if (sipAmount <= waterLevel) {
            waterLevel -= sipAmount;
            System.out.println("The water in the bottle after sipping is: " + waterLevel);
        } else {
            System.out.println("There is not that much water in the bottle!");
        }
    }

    public void emptying() {
        waterLevel = 0;
        System.out.println("The bottle has been emptied.");
    }
 }

    

