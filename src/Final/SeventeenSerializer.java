package Final;

import java.util.HashMap;

public class SeventeenSerializer {

    public static HashMap<String, String> numbers = new HashMap<>();

    static {
        numbers.put((" _ ") +
                ("| |") +
                ("|_|") , "0");

        numbers.put(("   ") +
                ("  |") +
                ("  |"), "1");

        numbers.put((" _ ") +
                (" _|") +
                ("|_ "), "2");

        numbers.put((" _ ") +
                (" _|") +
                (" _|") , "3");

        numbers.put(("   ") +
                ("|_|") +
                ("  |") , "4");

        numbers.put((" _ ") +
                ("|_ ") +
                (" _|") , "5");

        numbers.put((" _ ") +
                ("|_ ") +
                ("|_|") , "6");

        numbers.put((" _ ") +
                ("  |") +
                ("  |") , "7");

        numbers.put((" _ ") +
                ("|_|") +
                ("|_|") , "8");

        numbers.put((" _ ") +
                ("|_|") +
                (" _|") , "9");

        numbers.put(("   ") +
                ("___") +
                ("   ") , "99");

        numbers.put(("   ") +
                ("   ") +
                ("   ") , "88");

        numbers.put(("   ") +
                ("   ") +
                (" . ") , "77");
    }

    public static String convertSevenSegmentToInt(String sevenSegmentNumber) {

        return numbers.get(sevenSegmentNumber);


    }
}
