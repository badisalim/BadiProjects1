package ListMapeSetOptional;

import java.util.HashSet;
import java.util.Set;

public class SetBasicBackpackApplication {
    public static void main(String[] args) {


        Set<String> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);
        String toothPast = "ToothPast";
        String phom = "Phom";
        String raiser = "Raiser";

        backpack.add(toothPast);
        backpack.add(phom);
        backpack.add(raiser);

        System.out.println("\n" + "Backpack: " + backpack);

        boolean containsToothPast = backpack.contains(toothPast);
        // System.out.println("Is toothPast there? : ");
        if (backpack.contains("ToothPast")) {
            System.out.println("The backback contain toothPast : " + containsToothPast);
        } else {
            System.out.println(false);
        }

            for (String string : backpack) {

                //Print out the list
                backpack.remove(toothPast);

                System.out.println("\n" + "Backpack: " + backpack);
                System.out.println("\n" + "the backpack no longer contain ToothPast");
                boolean containsPhom = backpack.contains("phom");

                // System.out.println("Is phom there? : " + containsPhom);
                if (!containsPhom) {
                    //System.out.println("Is phom there? : " + containsPhom);
                    System.out.println("Backpack: " + containsPhom);
                }

                backpack.add(phom);
                backpack.add(phom);
                //s System.out.println("\n" + backpack);
                System.out.println("Backpack: " + backpack.size());

            }
        }

    }


