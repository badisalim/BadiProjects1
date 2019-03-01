package Cars;

import W6_CarEvaluation.AutomaticCar;
import W6_CarEvaluation.Car;
import W6_CarEvaluation.ManualCar;

import java.util.Random;

public class Cars {

    private static Random random = new Random();

    public static Car getNextCar(String brand) {
        boolean automatic = random.nextBoolean();
        if (automatic) {
            return new AutomaticCar(brand);
        }
        return new ManualCar(brand);
    }

}
