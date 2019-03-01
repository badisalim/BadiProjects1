package Animals;

public class Bird extends Animal implements Talkative {

    public Bird(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Bird";
    }

    @Override
    public void talk() {
        System.out.println(getName() + " tweets");
    }

    public void fly() {
        System.out.println(getName() + " flies");
    }
}
