package HeroSuperAndAdvanced;

import HeroSuperAndAdvanced.Advanced.Joker;

public class Spiderman implements Superhero {

    @Override
    public String getName() {
        return "spiderman";

    }

    @Override
    public void fight(Joker villain) {
        villain.weaken(getName());
    }
}
