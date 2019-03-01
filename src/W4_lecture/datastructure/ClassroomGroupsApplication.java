package W4_lecture.datastructure;

import java.util.*;

public class ClassroomGroupsApplication {

    public static void main(String[] args) {
        Map<String, List<String>> groups = new HashMap<>();

        groups.put("kitchen", new ArrayList<>(Arrays.asList("Omar", "Leen", "Tamara")));
        groups.put("learning area", new ArrayList<>(Arrays.asList("Paul", "Fabian", "Stefan")));

        List<String> kitchenGroup = groups.get("kitchen");



        System.out.println("The kitchen group contains");
        for (String name: kitchenGroup) {
            System.out.println(name);
        }

        changeKitchenGroup(groups);

        System.out.println("The kitchen group contains");
        for (String name: kitchenGroup) {
            System.out.println(name);
        }



    }

    private static void changeKitchenGroup(Map<String, List<String>> groups){
        List<String> kitchenGroup = groups.get("kitchen");

        kitchenGroup.remove(1);
        kitchenGroup.add("Tina");

    }




}
