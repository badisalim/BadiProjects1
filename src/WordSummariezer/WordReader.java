package WordSummariezer;



import W9_lecture.robodog.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordReader {


    public List<String> getWords(String filePath) {
        return new FileReader().asStream(filePath)
                .map(String::toLowerCase)
                .map(e -> e.replaceAll(",;’s’#:‘//-'.*()\\[] ?!      ", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
//                .map(e -> e.replaceAll("", " "))
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList());
    }

}
