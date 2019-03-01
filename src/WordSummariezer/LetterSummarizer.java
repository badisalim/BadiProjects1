package WordSummariezer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LetterSummarizer {

    public List<String> get5MostAppearingLetters(List<String> words) {
        return words.stream()
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getValue() + " | " + e.getKey())
                .collect(Collectors.toList());
    }

}
