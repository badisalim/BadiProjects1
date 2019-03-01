package CoffeeMakers;

import W6_3Coffee.CoffeeMaker;

public class FrenchPress extends CoffeeMaker {

    @Override
    public String getName() {
        return "French press";
    }

    @Override
    public Integer getBrewingTime() {
        return 10;
    }

}
