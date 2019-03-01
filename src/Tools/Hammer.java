package Tools;

import java.util.List;

public class Hammer implements Tool {

    @Override
    public void build(Furniture furniture) {
        System.out.println("Hammers the" + furniture.getName());
    }

    @Override
    public void build(List<Furniture> furnitures) {

    }
}
