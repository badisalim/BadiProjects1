package WardRobe;

import java.util.Arrays;
import java.util.List;


public class WardrobeBuilder {

    Step back = new AddBack();
    Step bottom = new AddBottom();
    Step door = new AddDoor();
    Step shelf = new AddShelf();
    Step side = new AddSide();
    Step top = new AddTop();

    List<Step> steps = Arrays.asList(bottom, side, side, back, top, shelf, shelf, shelf, shelf, shelf, shelf, shelf, shelf, door, door);


    public Wardrobe build() {
        Wardrobe wardrobe = new Wardrobe();
        for (Step step : steps) {
            step.perform(wardrobe);

        }

        return wardrobe;

    }
}
