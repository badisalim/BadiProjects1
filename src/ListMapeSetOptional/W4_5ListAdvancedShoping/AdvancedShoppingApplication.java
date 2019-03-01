package ListMapeSetOptional.W4_5ListAdvancedShoping;

import java.util.ArrayList;
import java.util.List;

public class
AdvancedShoppingApplication {

    public static void main(String[] args) {


        List<GroceryClass> groceries = new ArrayList<>();
        GroceryClass bananas = new GroceryClass("bananas");
        GroceryClass orange = new GroceryClass("orange");
        GroceryClass tomatos = new GroceryClass("tomatos");

        System.out.println(groceries);

        groceries.add(bananas);
        groceries.add(orange);
        groceries.add(tomatos);
        System.out.println(groceries);

//        for (int i = 0; i < groceries.size(); i++) {
//            if (Objects.equals(orange,groceries.get(i))) {
        groceries.remove(orange);
//            }
        System.out.println(groceries);
//        }

        groceries.add(orange);
        groceries.add(orange);

        System.out.println(groceries);

        groceries.remove(2);
        System.out.println(groceries);

        System.out.println(groceries.size());
    }

}