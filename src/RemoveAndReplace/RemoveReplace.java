package RemoveAndReplace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//        1. Create a list of words. Make sure you use ​ new ArrayList ​ to have a mutable list.
//        2. Use the ​ removeIf ​ method to remove every word that ends with the letter ​ e ​ .
//        3. Use the ​ replaceAll ​ method to transform every word in their uppercase version.
//        4. Use the ​ removeIf ​ method to remove every word that has less than six letters.
//        5. Use the ​ forEach ​ method to print every word one by one.
public class RemoveReplace {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));
        System.out.println(words);
        words.removeIf(e -> e.endsWith("e"));

        System.out.println(words);

        words.replaceAll(e -> e.toUpperCase());

        System.out.println(words);
        words.removeIf(e -> e.length() < 6);

        System.out.println(words);
        for (String word : words) {

        System.out.println(word);


        }

    }
}


