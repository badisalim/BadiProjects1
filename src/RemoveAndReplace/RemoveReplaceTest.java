package RemoveAndReplace;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RemoveReplaceTest {

    @Test
    void main() {
        List<String> words = new ArrayList<>(Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));

        words.removeIf(e -> e.endsWith("e"));
        List<String> expected = Arrays.asList("scenario", "glass", "backpack");
        Assertions.assertEquals(expected, words);

        System.out.println(words);

        words.replaceAll(e -> e.toUpperCase());

        System.out.println(words);
        words.removeIf(e -> e.length() < 6);

        expected = Arrays.asList("SCENARIO", "BACKPACK");
        Assertions.assertEquals(expected, words);

        System.out.println(words);
    }
}