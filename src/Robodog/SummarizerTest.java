package Robodog;

import org.junit.jupiter.api.Test;

import java.util.List;

class SummarizerTest {

    private Summarizer summarizer = new Summarizer();

    @Test
    void findUniqueTricks() {
        String filePath = "Robodog/robodog.txt";
        List<String> tricks = summarizer.findUniqueTricks(filePath);
        System.out.println(tricks);

//        List<String> expected = Arrays.asList("bark, move left, move right, step backwards, step forward".split(", "));
//        Assertions.assertEquals(expected, tricks);

    }
}