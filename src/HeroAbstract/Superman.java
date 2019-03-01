package HeroAbstract;

public class Superman extends Hero1{

    @Override
    public String getName() {
        return "Superman";
    }

    @Override
    public void saveTheCity() {
        System.out.println("Using his superpowers");
    }
}
