package ThermostatTests;


import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {

    private Predicate<Double> trigger;
    private Function<Double, String> display;

    public Thermostat(Predicate<Double> trigger, Function<Double, String> display) {
        this.trigger = trigger;
        this.display = display;
    }

    public String sense(Double temperature) {
        if (trigger.test(temperature)) {
            return "Warning!";
        }
        return display.apply(temperature);
    }

}


    //
//    private static double Temperature = -1;
//    private static double Temperature2 = 80;
//
//    private String isLowerThanFreezing(double value, char scale) {
//
//        if (Temperature <= (0.0) "C"){
//            return "warning freezing";
//        else{
//
//
//                private boolean isUperThanheating ( double value1, char scale1){
//                    if (Temperature <= (80) 'C'){
//                        return "warning heating";
//
//                    }
//                }
//            }
//        }
//
//  }
