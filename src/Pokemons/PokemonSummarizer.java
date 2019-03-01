package Pokemons;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PokemonSummarizer {

    private PokemonReader reader = new PokemonReader();
    private List<Pokemon> pokemons = reader.getPokemons("W10_ex1/pokemon.csv");

    public void nameAndAttack() {

        List<String> c = pokemons.stream()
                //       .sorted(Comparator.comparing(Pokemon::getName).reversed())
                .map(pokemon -> "Name: " + pokemon.getName() + " +HP+: "+nameHp()+" | Attack: " + pokemon.getAttack())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(c);
    }

    public void nameType1Defence() {

        Map<Integer, List<String>> c1 = pokemons.stream()
                .sorted(Comparator.comparing(Pokemon::getName).reversed())
                //.limit(2)
                .map(pokemon -> "Name: " + pokemon.getName() + " | Type1: " + pokemon.getType1() + " | Defence: " + pokemon.getDefence()+pokemon.getHp())
                .distinct().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()));
        System.out.println(c1);
    }

    protected void nameGenerationLegendary() {

        Set<String> c2 = pokemons.stream()
                .sorted(Comparator.comparing(Pokemon::getName).reversed())
                .limit(2)
                .map(pokemon -> "Name: " + pokemon.getName() + " | Generation: " + pokemon.getGeneration() + " | Legendary: " + pokemon.getLegendery())
                .collect(Collectors.toSet());
        System.out.println(c2);
    }

    public Map<String, Long> nameHp() {
        Map<String, Long>c6=
                pokemons.stream()
                        .sorted(Comparator.comparing(Pokemon::getName).reversed())
                        .filter(e -> e.getHp() > 50 && e.getHp() < 100)
                        .limit(3)
                        .map(pokemon -> "Name: " + pokemon.getName() + " | HP: " + pokemon.getHp())
                        .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(c6);
        return c6;
    }

    public void  seriesNoAndDetails() {
         Map<Integer, List<Pokemon>>c4=pokemons.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.groupingBy(Pokemon::getNumber, Collectors.toList()));
        System.out.println(c4);
    }

    public List<String> getNumberOfPokemonsStartWithA() {
        List<String>c5=  pokemons.stream()
                .filter(e -> e.getName().startsWith("A"))
                .map(pokemon -> pokemon.getName())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(c5);
        return c5;
    }
    public Optional<String> getNumberOfPokemonsStartWithZ() {
        Optional<String> b = pokemons.stream()
                .map(pokemon -> pokemon.getName())
                .filter(e -> e.startsWith("Z"))
                .findFirst();
        System.out.println(b);
        return b;

    }
    public void getNumberOfPokemonsStartWithB() {
        PokemonSummarizer pokemonSummarizer = new PokemonSummarizer();
        List<String> pokemonZ = pokemonSummarizer.getNumberOfPokemonsStartWithA();
        System.out.println("How many pokemons start with Z: " + pokemonZ.size() + "\n" + pokemonZ);
        long z = pokemons.stream()
                .filter(e -> e.getName().startsWith("Z"))
                .count();
        System.out.println("count: " + z);

    }


    public void collect5() {
        List<String> collect = pokemons.stream()
                .filter(e -> e.getName().startsWith("Z"))
                .map(pokemon -> pokemon.getName())
                .limit(4)
                .collect(Collectors.toList());
        collect.stream()
                .forEach(e -> System.out.println(e));
    }

    public List<String> collect6() {
        List<String> collect = pokemons.stream()
                .sorted(Comparator.comparing(Pokemon::getName).reversed())
                .map(pokemon -> "Name: " + pokemon.getName() + " | Attack: " + pokemon.getAttack())
                .limit(3)
                .collect(Collectors.toList());
        collect.stream()
                .forEach(e -> System.out.println(e));
        return collect;
    }

    public Map<String, Long> collect7() {

        Map<String, Long> collect = pokemons.stream()
                .sorted(Comparator.comparing(Pokemon::getName).reversed())
                .filter(e -> e.getHp() > 50 && e.getHp() < 100)
                .limit(3)
                .map(pokemon -> "Name: " + pokemon.getName() + " | HP: " + pokemon.getHp())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        collect.entrySet().stream()
                .forEach(e -> System.out.println(e));

        return collect;
    }

    public boolean isMatches() {
        boolean anyMatch = pokemons.stream()
                .sorted(Comparator.comparing(Pokemon::getName).reversed())
                .filter(e -> e.getHp() > 50 && e.getHp() < 100)
                //.limit(3)
                .map(pokemon -> pokemon.getName())
                .map(e -> e.length())
                .allMatch(length -> length < 50);
        // .anyMatch(e -> e .startsWith("B"));
        return anyMatch;

    }

    public List<Pokemon> ranged() {
        pokemons.stream();
        IntStream range = IntStream.range(0, 5);
        range.boxed()
                .collect(Collectors.toList());
        return pokemons;


        //.forEach(e->System.out.println(range);

    }

    public void names() {

        Stream.of(pokemons)
                .collect(Collectors.toList());
        Random random = new Random();
        IntStream.iterate(0, e -> e + 1)
                .limit(pokemons.size())
                .mapToObj(e -> random.nextInt(pokemons.size()))
                .map(e -> pokemons.get(e))
                // .collect(Collectors.toList());
                // collect().stream()
                .forEach(e -> System.out.println(e));
        OptionalInt number = IntStream.iterate(0, n -> n + 1)
                .limit(4)
                .filter(n -> n > 1)
                .max();
        if (number.isPresent()) {
            System.out.println("number: " + number.getAsInt());
        } else {
            System.out.println("number is not present.");
        }
        OptionalDouble average = pokemons.stream()
                .map(e -> e.getAttackSp())
                .flatMap(e -> Stream.of(e))
                .mapToInt(e -> (int) e.intValue())
                .average();
        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        }

        IntStream.range(0, 5)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println("We will rock you!"));


    }


}


