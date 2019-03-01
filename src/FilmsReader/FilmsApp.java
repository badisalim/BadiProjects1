package FilmsReader;

import java.util.List;

public class FilmsApp {

    public static void main(String[] args) {
        FilmSummarizer filmSummarizer = new FilmSummarizer();
        Ac filmSummarizer6 = new Ac();

        List<Film> films6 = filmSummarizer6.getTop3Rated6();
        System.out.println("Top2 Rated new class \n " +films6);
        List<Film> films7=filmSummarizer6.getCount7();
        System.out.println("Top2 Count new class \n " +films7);

        List<Film> films = filmSummarizer.getTop3Rated();
        System.out.println("Top3 Rated \n " + films);

        List<Film> films1 = filmSummarizer.getTop3RatedLongerThan3Hours();
        System.out.println("Top3 Rated LongerThan 3Hours \n " + films1);

        List<Film> films2 = filmSummarizer.getTop4MostExpensive();
        System.out.println("Top4 Most Expensive \n " + films2);

        List<Film> films3 = filmSummarizer.getTop4MostExpensiveShorterThan90Minutes();
        System.out.println("Top4 Most Expensive Shorter Than 90Minutes \n " + films3);

        List<Film> films4 = filmSummarizer.getTop4RatedLowBudget();
        System.out.println("Top4 Rated Low Budget \n " + films4);
    }

}
