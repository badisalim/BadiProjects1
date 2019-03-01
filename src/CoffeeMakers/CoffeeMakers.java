package CoffeeMakers;

import W6_3Coffee.AutoDrip;
import W6_3Coffee.AutomaticCoffeeMachine;
import W6_3Coffee.CoffeeMaker;
import W6_3Coffee.FrenchPress;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    private static List<CoffeeMaker> coffeeMakers = Arrays.asList(
            new AutoDrip(), new AutomaticCoffeeMachine(), new FrenchPress()
    );

    public static List<CoffeeMaker> asList() {
        return coffeeMakers;
    }

    public static Optional<CoffeeMaker> get(String name){
        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            if (coffeeMaker.getName().equals(coffeeMaker)){
                return Optional.of(coffeeMaker);
            }
        }
        return Optional.empty();
    }

}
