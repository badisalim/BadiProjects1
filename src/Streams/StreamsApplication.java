package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {


    public static void main(String[] args) {
        List<Integer> firstTwentyNo = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            firstTwentyNo.add(i);
        }

        System.out.println(firstTwentyNo);

        List<Integer> Even = firstTwentyNo.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(Even);

        List<Integer> Odd = firstTwentyNo.stream()
                .filter(e -> e % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(Odd);

        List<Integer> DevisibleBigger = firstTwentyNo.stream()
                .filter(e -> (e > 10 && (e % 3 == 0)))
                .collect(Collectors.toList());

        System.out.println(DevisibleBigger);

        List<Integer> smallMult = firstTwentyNo.stream()
                .filter(e -> (e < 5))
                .map(e -> e * 3)
                .collect(Collectors.toList());

        System.out.println(smallMult);


        List<String> bigSmall = firstTwentyNo.stream()
                .filter(e -> (e > 8 && e < 12))
                .map(e -> "number " + e + " has " + e.toString().length() + " digits")
                .collect(Collectors.toList());
        System.out.println(bigSmall);
    }


}
