package HeroSuperAndAdvanced.Advanced;

import HeroSuperAndAdvanced.Batman;
import HeroSuperAndAdvanced.Spiderman;
import HeroSuperAndAdvanced.Superhero;
import HeroSuperAndAdvanced.Superman;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {

        Superman superman=new Superman();
        Batman batman=new Batman();
        Spiderman spiderman=new Spiderman();

    List<Superhero>superheroes= Arrays.asList(spiderman,superman,batman);

    public Superhero call() {

        Random random=new Random();

        Integer randomHero =random.nextInt(3);
        return superheroes.get(randomHero);


    }

}
