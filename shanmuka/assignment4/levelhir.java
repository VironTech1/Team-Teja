package assignment4;

class AnimalKingdom {
    public void survive() {
        System.out.println("Animals in the kingdom are striving to survive.");
    }
}

class Mammal extends AnimalKingdom {
    public void giveBirth() {
        System.out.println("Mammal is giving birth.");
    }
}

class Dog extends Mammal {
    public void survive() {
        System.out.println("Dog is adapting to survive in the environment.");
    }

    public void giveBirth() {
        super.giveBirth();
        System.out.println("Dog is giving birth to puppies.");
    }
}

class Cat extends Mammal {
    public void survive() {
        System.out.println("Cat is adapting to survive in the environment.");
    }

    public void giveBirth() {
        super.giveBirth();
        System.out.println("Cat is giving birth to kittens.");
    }
}

class Bat extends Mammal {
    public void survive() {
        System.out.println("Bat is adapting to survive in the environment.");
    }

    public void giveBirth() {
        super.giveBirth();
        System.out.println("Bat is giving birth to bat pups.");
    }
}

public class levelhir {
    public static void main(String[] args) {
        AnimalKingdom animalKingdom = new AnimalKingdom();
        Mammal genericMammal = new Mammal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        Bat myBat = new Bat();

        System.out.println("Generic Animal Kingdom:");
        animalKingdom.survive();

        System.out.println("\nGeneric Mammal:");
        genericMammal.survive();
        genericMammal.giveBirth();

        System.out.println("\nMy Dog:");
        myDog.survive(); 
        myDog.giveBirth();

        System.out.println("\nMy Cat:");
        myCat.survive(); 
        myCat.giveBirth();

        System.out.println("\nMy Bat:");
        myBat.survive(); 
        myBat.giveBirth();
    }
}
