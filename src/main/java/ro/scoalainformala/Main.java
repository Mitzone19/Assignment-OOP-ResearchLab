package ro.scoalainformala;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Rex", 5, "Pug"));
        animals.add(new Cat("Pisi", 3, "Black"));
        animals.add(new Parrot("Coco", 2, "Cococo"));

        for (Animal animal : animals) {
            animal.makeSound();
            System.out.println(animal);
        }
    }
}
