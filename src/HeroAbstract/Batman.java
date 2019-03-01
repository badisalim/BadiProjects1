package HeroAbstract;

public class Batman extends Hero1 {

    @Override
    public String getName() {
        return "Batman";
    }

    @Override
    public void saveTheCity() {
        System.out.println("Using his brain and fancy technology");
    }

    public void driveTheBatmobile(){
        System.out.println("Uses the batmobile");
    }

}
