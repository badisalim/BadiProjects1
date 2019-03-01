package HeroInterface;

public class Superman implements Hero, Fighting, Freezing{


    @Override
    public String getName() {
        return "Superman";
    }

    @Override
    public void freezing() {
        System.out.println("I'm superman, i will freeze you!");
    }

    @Override
    public void fighting() {

    }

    @Override
    public void saveTheCity() {
        System.out.println("Using his superpowers");
    }
}
