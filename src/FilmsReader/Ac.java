package FilmsReader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ac {
    private static List<Film> films = readFilms();

    private static List<Film> readFilms() {
        return new FilmReader().getFilms("exercise/week9/source/films.csv");
    }

    public  List<Film> getTop3Rated6() {
        return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(2)
                .collect(Collectors.toList());
    }

    public List<Film>getCount7(){
        return films.stream()
                .sorted(Comparator.comparing(Film::getVoteCount).reversed())
                .limit(2)
                .collect(Collectors.toList());
    }
}
