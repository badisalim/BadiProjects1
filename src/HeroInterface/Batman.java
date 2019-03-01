package HeroInterface;

public class Batman implements Hero, Fighting{
    public Batman() {
    }

    @Override
    public String getName() {
        return "Batman";
    }

    @Override
    public void fighting() {

    }



    @Override
    public void saveTheCity() {
        System.out.println("Using his brain and fancy technology");
    }

    public void driveTheBatmobile(){
        System.out.println("Uses the batmobile");
    }

}
