package HeroSuperAndAdvanced;

import HeroSuperAndAdvanced.Advanced.Joker;

public class Batman implements Superhero {
    @Override
    public String getName() {
        return "batman";
    }

    @Override
    public void fight(Joker villain) {
        villain.weaken(getName());
    }
}
