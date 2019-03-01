package HappinessCountries;

import W9_lecture.reader.FileReader;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class HappinessApplication {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();

        Stream<String> names = fileReader.asStream("W4_11WorldHappiness/world-happiness-2017.csv");

        names
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> Arrays.asList(e))
                .map(e -> new HappinessRecord(e.get(0), Integer.valueOf(e.get(1)), Double.valueOf(e.get(2))))
                .sorted(Comparator.comparing(e -> e.getRank()))
//                .sorted(Comparator.comparing(e->e.getCountry()))
//                .sorted(Comparator.comparing(e->e.getScore()))
//
//                .sorted((e1,e2) -> e2.getCountry().compareTo(e1.getCountry()))
//               .sorted((e1,e2) -> e2.getRank().compareTo(e1.getRank()))
//               .sorted((e1,e2) -> e2.getScore().compareTo(e1.getScore()))
//               .sorted(Comparator.comparing(HappinessRecord::getCountry).reversed())
                .limit(5)
                .forEach(e -> System.out.println(e));
    }
}

