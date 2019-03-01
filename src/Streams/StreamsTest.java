package Streams;

import W9_lecture.robodog.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {


    private FileReader reader = new FileReader();
    private List<String> names = reader.asList("W9_lecture/source/names.txt");

    @Test
    void testStreams() {

        List<String> expected = Arrays.asList("El");

        List<String> result = names.stream()
                .filter(name -> name.length() < 4)
                .collect(Collectors.toList());

        Assertions.assertEquals(expected, result);

        System.out.println("Names that are shorter than four characters: \n" + result);

    }

    @Test
    void endsWithMTest() {

        List<String> expected = Arrays.asList("HOSAM", "TAMMAM");
        List<String> result = names.stream()

                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        Assertions.assertEquals(expected, result);
        System.out.println("Names that end with m uppercased:" + result);


    }

    @Test
    void containsEAndRTest() {

        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        List<String> result = names.stream()
                .filter(e -> e.contains("e") && e.contains("r"))
                .collect(Collectors.toList());
        Assertions.assertEquals(expected, result);

        System.out.println(result);
    }

    @Test
    void containAandMAndDoubleA() {

        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");
        List<String> result = names.stream()
                .filter(e -> e.length() == 4)
                .map(e -> e.toLowerCase())
                .filter(e -> e.contains("a") && e.contains("m"))
                .map(e->e.replaceAll("a","aa"))
                .collect(Collectors.toList());
        Assertions.assertEquals(expected, result);

        System.out.println(result);

    }

}

