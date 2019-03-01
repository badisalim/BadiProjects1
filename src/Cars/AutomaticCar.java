package Cars;

import W6_CarEvaluation.Car;

public class AutomaticCar extends Car {

    public AutomaticCar(String brand) {
        super(brand);
    }

    @Override
    protected String getType() {
        return "Automatic";
    }


}
