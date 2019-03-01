package ListMapeSetOptional.W4_6ListAdvancedBackPack;

import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {
        Set<Item> backpack = new HashSet<>();

        System.out.println(backpack);

        Item toothPast = new Item("ToothPast");
        Item shavePast = new Item("ShavePast");
        Item raiser = new Item("Raiser");

        backpack.add(toothPast);
        backpack.add(shavePast);
        backpack.add(raiser);

        System.out.println("Backpack : " + backpack);

        Item anotherRaiser = new Item("Raiser");
        boolean containsraiser = backpack.contains(anotherRaiser);

        System.out.println("Is Raiser there? : " + containsraiser);

        backpack.remove(anotherRaiser);
        System.out.println("Backpack : " + backpack);


        boolean containsraiser2 = backpack.contains(anotherRaiser);

        System.out.println("Is Raiser there? : " + containsraiser2);

        backpack.add(toothPast);
        backpack.add(toothPast);
        System.out.println(backpack);
        System.out.println(backpack.size());

    }

}
