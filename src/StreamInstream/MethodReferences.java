package StreamInstream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferences {

    public static void main(String[] args) {
        List<String> names = Stream.of("Hamada", "Norbert", "Diba", "Mahtab")
                .collect(Collectors.toList());

        System.out.println("Awesome sort");
        names.stream()
                .map(String::toUpperCase)
                .sorted(MethodReferences::awesomeSort)
                .forEach(MethodReferences::greet);

        Collections.swap(names, 0, 2);
        System.out.println(names);

        System.out.println("Reverse sort");
        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int awesomeSort(String name1, String name2) {
        String awesomeName = "Norbert";
        if (name1.equalsIgnoreCase(awesomeName)) {
            return -1;
        }
        if (name2.equalsIgnoreCase(awesomeName)) {
            return 1;
        }
        return name1.compareTo(name2);
    }

}
