package Tools;

import java.util.List;

public class ScrewDriver implements Tool {

    @Override
    public void build(Furniture furniture) {
        System.out.println("Fixes the" + furniture.getName());
    }

    @Override
    public void build(List<Furniture> furnitures) {

    }
}
