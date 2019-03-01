package Cars;

import W6_CarEvaluation.Car;
import W6_CarEvaluation.Cars;
import W6_CarEvaluation.Hansel;

import java.util.Arrays;
import java.util.List;

public class CarApplication {

    public static void main(String[] args) {
        Hansel hansel = new Hansel();
        String[] split = "Audi, Mercedes, Seat, Skoda, Tesla, Bmw, Peugeot, Citroen, Jeep, Ferrari".split(", ");
        List<String> brands = Arrays.asList(split);
        for (String brand : brands) {
            Car car = Cars.getNextCar(brand);
            hansel.haveATry(car);
        }
    }

}
