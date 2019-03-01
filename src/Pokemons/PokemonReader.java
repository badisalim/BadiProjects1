package Pokemons;

import W9_lecture.reader.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonReader {

    private FileReader reader = new FileReader();

    public List<Pokemon> getPokemons(String filePath) {
        return reader.asStream(filePath)
                .skip(1)
                .map(e -> e.replaceAll(",", " "))
                .map(e -> e.replaceAll("\\.", ""))
                .map(e -> e.split(";"))

                .map(columnes -> new Pokemon(Integer.valueOf(columnes[0]),
                        columnes[1],
                        columnes[2],
                        columnes[3],
                        Integer.valueOf(columnes[4]), Integer.valueOf(columnes[5]), Integer.valueOf(columnes[6]),
                        Integer.valueOf(columnes[7]), Integer.valueOf(columnes[8]), Integer.valueOf(columnes[9]),
                        Integer.valueOf(columnes[10]), Integer.valueOf(columnes[11]), Boolean.valueOf(columnes[12])))
                .collect(Collectors.toList());

    }

}
//    List<String> words = Stream.of(quote)
//            .map(e -> e.replaceAll(",", " "))
//            .map(e -> e.replaceAll("\\.", ""))
//            .map(e -> e.split(" "))
//            .flatMap(e -> Stream.of(e))
//            .collect(Collectors.toList());
//        System.out.println("Words: " + words);
