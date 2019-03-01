package FilmsReader;


import W9_lecture.reader.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {

    private FileReader reader = new FileReader();

    public List<Film> getFilms(String filePath) {
        return reader.asStream(filePath)
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Film(
                        columns[8],
                        Double.valueOf(columns[9]),
                        Long.valueOf(columns[10]),
                        Integer.valueOf(columns[6]),
                        Long.valueOf(columns[0]),
                        Long.valueOf(columns[5])
                ))
                .collect(Collectors.toList());
    }
}
