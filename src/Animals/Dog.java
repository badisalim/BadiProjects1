package Animals;

public class Dog extends Animal implements Talkative {


    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog";
    }

    @Override
    public void talk() {
        System.out.println(getName() + " barks");
    }


}
