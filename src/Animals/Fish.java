package Animals;

public class Fish extends Animal implements Swime {

    public Fish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Fish";
    }

    @Override
    public void swim() {
        System.out.println(getName()+ " swim");

    }
}



