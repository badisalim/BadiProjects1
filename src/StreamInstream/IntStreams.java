package StreamInstream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreams {

    public static void main(String[] args) {
        List<Integer> ranged = IntStream.range(0, 4)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(ranged);

        List<Integer> rangeClosed = IntStream.rangeClosed(0, 4)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(rangeClosed);

        List<String> names = Stream.of("Hosam", "Omar", "Rabi", "Tamara")
                .collect(Collectors.toList());

        Random random = new Random();
        IntStream.iterate(0, n -> n + 7)
                .limit(names.size())
                .mapToObj(n -> random.nextInt(names.size()))
//                .map(n -> n % names.size())
                .map(n -> names.get(n))
                .forEach(n -> System.out.println(n));

        OptionalInt number = IntStream.iterate(0, n -> n + 1)
                .limit(100)
//                .filter(n -> n > 1000)
                .max();
        if (number.isPresent()) {
            System.out.println("number: " + number.getAsInt());
        } else {
            System.out.println("number is not present.");
        }

        OptionalDouble average = names.stream()
                .map(e -> e.split(""))
                .flatMap(e -> Stream.of(e))
                .mapToInt(e -> (int) e.charAt(0))
                .average();
        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        }

        IntStream.range(0, 3)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println("We will rock you!"));


    }
}
