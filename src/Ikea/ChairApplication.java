package Ikea;

import java.util.Arrays;
import java.util.List;

public class ChairApplication {

    public static void main(String[] args) {
        Chair chair = new Chair();
        System.out.println("Is finished: " + chair.isFinished());

        List<Step> steps = getSteps();
        for (Step step : steps) {
            step.perform(chair);
        }

        System.out.println("Is finished: " + chair.isFinished());

    }

    private static List<Step> getSteps() {
        AddLeg leg = new AddLeg();
        AddSeat seat = new AddSeat();
        return Arrays.asList(
                leg, leg, leg, leg, seat
        );
    }

}
