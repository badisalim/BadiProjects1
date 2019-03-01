package HeroSuperAndAdvanced;

import HeroSuperAndAdvanced.Advanced.Joker;

public class Superman implements Superhero {
    @Override
    public String getName() {
        return "superman";
    }

    @Override
    public void fight(Joker villain) {
        villain.weaken(getName());
    }
}
