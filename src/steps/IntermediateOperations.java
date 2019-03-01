package steps;

import W9_lecture.club.Clubber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {
        List<String> animals = Stream.of("cat", "dog", "mouse", "rabbit", "horse")
                .collect(Collectors.toList());

        System.out.println("---LIST");
        animals.stream()
                .skip(1)
                .forEach(e -> System.out.println(e));
        Set<String> animalSet = animals.stream()
                .collect(Collectors.toSet());

        System.out.println("---SET");
        animalSet.stream()
                .skip(1)
                .sorted()
                .skip(1)
                .limit(2)
                .forEach(e -> System.out.println(e));

        System.out.println("---Another");
        animalSet.stream()
                .filter(e -> e.length() < 6)
                .sorted((e1, e2) -> e1.compareTo(e2))
                .forEach(e -> System.out.println(e));

        System.out.println("---Numbers");
        Set<Integer> numbers = Stream.of(111, 22, 3, 44444, 55555, 666, 77)
                .collect(Collectors.toSet());

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .map(e -> e.toString())
                .sorted((e1, e2) -> Integer.valueOf(e2.length()).compareTo(e1.length()))
                .forEach(e -> System.out.println(e));


        System.out.println("---Clubbers");
        List<Clubber> clubbers = getClubbers();
        clubbers.stream()
//                .sorted((e1, e2) -> e1.getAge().compareTo(e2.getAge()))
                .sorted(Comparator.comparing(Clubber::getAge).reversed())
                .map(e -> e.getAge() + " " + e.getName())
                .forEach(clubber -> System.out.println(clubber));

        System.out.println("---VIP Clubbers");
        clubbers.stream()
                .filter(e -> e.getAge() > 20)
                .sorted(Comparator.comparing(e -> e.getName()))
//                .map(Clubber::getName)
                .map(e -> e.getName())
                .skip(2)
                .limit(3)
                .forEach(e -> System.out.println(e));

        clubbers.stream()
                .forEach(clubber -> clubber.setMoney(clubber.getAge() * 2));


        System.out.println("---CASH");
        clubbers.stream()
                .map(e -> e.getAge() + " " + e.getName() + " " + e.getMoney())
                .forEach(clubber -> System.out.println(clubber));

        List<Integer> collectedMoney = clubbers.stream()
                .filter(e -> e.getAge() >= 18)
                .filter(e -> e.getMoney() >= 40)
                .map(get40EuroFromClubber())
                .map(e -> 40)
                .collect(Collectors.toList());

//        clubbers.stream()
//                .forEach(clubber -> clubber.setMoney(clubber.getMoney() - 40));

        System.out.println(collectedMoney);
        int total = collectedMoney.size() * 40;
        System.out.println("total: " + total);
    }

    private static Function<Clubber, Clubber> get40EuroFromClubber() {
        return clubber -> {
            int remaining = clubber.getMoney() - 40;
            clubber.setMoney(remaining);
            return clubber;
        };
    }

    private static List<Clubber> getClubbers() {
        return Arrays.asList(new Clubber("El", 24),
                new Clubber("Niklas", 19),
                new Clubber("Lisa", 15),
                new Clubber("Omar", 12),
                new Clubber("Hamada", 23),
                new Clubber("John", 22),
                new Clubber("Khajag", 77),
                new Clubber("Sahar", 28));
    }

}
