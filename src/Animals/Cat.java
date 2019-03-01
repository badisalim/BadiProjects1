package Animals;

public class Cat extends Animal implements Talkative {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat";
    }

    @Override
    public void talk() {
        System.out.println(getName() + " miaus");
    }
}
