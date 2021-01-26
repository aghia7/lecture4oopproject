package com.company;

import com.company.interfaces.IAthlete;
import com.company.interfaces.ILuxuryCar;
import com.company.interfaces.IVehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<IVehicle> cars = new ArrayList<>();

        cars.add(new UsualCar(50));
        cars.add(new TeslaModelS(700));


        moveCars(cars);

        stopCars(cars);

        // Example 1
        /* Uncomment this if you need the first example
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Thomas"));
        animals.add(new Dog("Rex"));
        animals.add(new Fox("Firefox"));
        // It is not possible to instantiate an
        // object using class Animal
        // animals.add(new Animal("Unknown animal"));
        for (Animal a : animals) {
            System.out.print(a.getName() + " says ");
            a.makeSound();
        }
        */

        //Example 2
        /* Uncomment this if you need the second example
        IAthlete athlete = new JumpingSwimmer("James");

        athlete.compete();
        athlete.sayHooray();
         */

    }

    public static void moveCars(List<IVehicle> cars) {
        for (IVehicle car : cars) {
            car.move();
            if (car instanceof ILuxuryCar) {
                ILuxuryCar c = (ILuxuryCar) car;
                c.autoPilot();
                c.turnOnConditioner();
            }
        }
    }

    public static void stopCars(List<IVehicle> cars) {
        System.out.println("--------------------");
        for (IVehicle car : cars) {
            car.stop();

            if (car instanceof ILuxuryCar) {
                ILuxuryCar c = (ILuxuryCar) car;
                c.turnOffConditioner();
            }
        }
    }


    public static void forceAnimalSay(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            System.out.print(animal.getName());
            System.out.print(" says ");
            animal.makeSound();
        }
    }

}

