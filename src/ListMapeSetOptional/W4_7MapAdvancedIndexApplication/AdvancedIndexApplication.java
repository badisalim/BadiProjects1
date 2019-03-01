package ListMapeSetOptional.W4_7MapAdvancedIndexApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {
    public static void main(String[] args) {

        Map<Integer, List<Topic>> indexMap = new HashMap<>();
        System.out.println(indexMap);
        Integer page1 = new Integer(1);
        Integer page2 = new Integer(2);

        Topic math = new Topic("Math");
        Topic sport = new Topic("Sport");
        Topic phesics = new Topic("Phesics");

        List<Topic> topics1 = new ArrayList<>();
        List<Topic> topics2 = new ArrayList<>();

        topics1.add(math);
        topics2.add(sport);
        topics2.add(phesics);

        indexMap.put(page1, topics1);
        indexMap.put(page2, topics2);

        System.out.println(indexMap);
        System.out.println(indexMap.values());
        System.out.println(indexMap.keySet());


        Topic eclogy = new Topic("Ecology");


        List<Topic> stored = indexMap.get(page1);
        stored.add(eclogy);
        System.out.println(indexMap);
        if (indexMap.containsKey(page1)) {
            System.out.println("The page number 1 exists as key");

        }

        System.out.println(indexMap.size());

    }
}