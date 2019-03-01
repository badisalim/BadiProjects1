package CoffeeMakers;

import W6_3Coffee.CoffeeMaker;

public class AutoDrip extends CoffeeMaker {
    @Override
    public String getName() {
        return "Auto drip";
    }

    @Override
    public Integer getBrewingTime() {
        return 6;
    }

}
