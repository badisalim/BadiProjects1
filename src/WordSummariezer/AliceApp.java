package WordSummariezer;

import java.util.List;

public class AliceApp {

    public static void main(String[] args) {
        List<String> words = new WordReader().getWords("W10_reflection/week10/alice.txt");
        WordSummarizer wordSummarizer = new WordSummarizer();
        LetterSummarizer letterSummarizer = new LetterSummarizer();

        System.out.println("Number of words: " + wordSummarizer.count(words));
        System.out.println("Number of distinct words: " + wordSummarizer.countDistinct(words));
        System.out.println("Longest words: " + wordSummarizer.getLongest(words));
        System.out.println("Most appearing 5 words: ");
        wordSummarizer.get5MostAppearing(words)
                .forEach(System.out::println);
        System.out.println("Most appearing 5 letters: ");
        letterSummarizer.get5MostAppearingLetters(words)
                .forEach(System.out::println);
        System.out.println("Alice appearances: " + wordSummarizer.count("Alice", words));
    }

}
//    Number of words: 30355
//        Number of distinct words: 3433
//        Longest words: [unenforceability]
//        Most appearing 5 words:
//        1816 | the
//        940 | and
//        805 | to
//        690 | a
//        628 | of
//        Most appearing 5 letters:
//        15396 | e
//        12204 | t
//        9804 | a
//        9480 | o
//        8634 | i
//        Alice appearances: 398
