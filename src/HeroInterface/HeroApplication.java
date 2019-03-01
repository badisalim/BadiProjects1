package HeroInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class HeroApplication {

    public static void main(String[] args) {
        List<Hero> heroes = getHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero name: " + hero.getName());
            System.out.println("Saves the city by: ");
            hero.saveTheCity();
            System.out.println("Super hero name: "+ hero.getName());
           // Fighting fighter = (Fighting) hero;
            //Superman superman = (Superman) fighter;


        }

        Optional<Superman> superman = heroes.stream()
                .filter(hero -> hero.getClass().isAssignableFrom(Superman.class))
                .map(hero -> (Superman) hero)
                .findFirst();
        if(superman.isPresent()){
            System.out.println("I found superman.");
            superman.get().freezing();
        } else {
            System.out.println("Superman was not there");
        }

    }

    private static List<Hero> getHeroes() {
        return Arrays.asList(
                new Batman(),
                new Superman()
        );
    }

}
