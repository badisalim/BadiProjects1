package Animals;

import java.util.Arrays;
import java.util.List;

public class AnimalApplication {

    public static void main(String[] args) {
        Dog dog = new Dog("Tammi");
        dog.talk();

        Cat cat = new Cat("Mia");
        cat.talk();

        Bird bird = new Bird("Tweety");
        bird.talk();
        bird.fly();

        Fish fish = new Fish("Fishi");
        fish.swim();

        List<Animal> animals = Arrays.asList(dog, cat, bird,fish);


        System.out.println(animals);





//        Animal animal = new Animal("T-rex");
//        Talkative talkative = new Talkative();
    }
}
