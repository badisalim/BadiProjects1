package WardRobe;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe implements Furniture {


    List<String> parts = new ArrayList<>();


    @Override
    public String toString() {
        return "Wardrobe{" +
                "parts=" + parts +
                '}';
    }

    @Override
    public void add(String part) {
        parts.add(part);


    }

    public List<String> getParts() {
        return parts;
    }
}


