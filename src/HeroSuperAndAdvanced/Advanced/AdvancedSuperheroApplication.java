package HeroSuperAndAdvanced.Advanced;

import HeroSuperAndAdvanced.Superhero;

public class AdvancedSuperheroApplication {

    public static void main(String[] args) {
        HeroSuperAndAdvanced.SuperheroCaller superheroCaller=new HeroSuperAndAdvanced.SuperheroCaller();
      //SuperheroCaller superheroCaller = new SuperheroCaller();
        Joker joker = new Joker();

        for (int times = 0; times < 10; times++) {
            Superhero badi = (Superhero) superheroCaller.call();
            badi.fight(joker);

        }

    }
}
