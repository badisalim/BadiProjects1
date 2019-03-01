package Pokemons;

import java.util.List;

public class PokemonApp {

    public static void main(String[] args) {
        PokemonSummarizer pokemonSummarizer = new PokemonSummarizer();
//           Three ways to print out in Application
//                1.use public Method only with return up,(you have to print sout in Application)
//                2.use public Method with return down,( print sout in method ,but you have to reuse List and name it)
//                3.use public void Method without return,( print sout in method,but you have to remove list beside void and name it )
        pokemonSummarizer.nameAndAttack();
        pokemonSummarizer.nameType1Defence();
        pokemonSummarizer.nameGenerationLegendary();
        pokemonSummarizer.nameHp();
        pokemonSummarizer.seriesNoAndDetails();
        pokemonSummarizer.getNumberOfPokemonsStartWithA();
        pokemonSummarizer.getNumberOfPokemonsStartWithB();
        pokemonSummarizer.getNumberOfPokemonsStartWithZ();
        pokemonSummarizer.collect5();
        pokemonSummarizer.collect6();
        pokemonSummarizer.collect7();
        System.out.println(pokemonSummarizer.isMatches());
        pokemonSummarizer.ranged();


        List<String> pokemonZ = pokemonSummarizer.getNumberOfPokemonsStartWithA();
        System.out.println("How many pokemons start with Z: " + pokemonZ.size());
        System.out.println(pokemonZ);
//pokemonSummarizer.names();

//        pokemonSummarizer.collect().stream().forEach(System.out::println);
//        System.out.println(pokemonSummarizer.collect());
//        pokemonSummarizer.collect1().entrySet().stream().forEach(System.out::println);
//        System.out.println(pokemonSummarizer.collect1().entrySet());
//
//        pokemonSummarizer.collect2().stream().forEach(System.out::println);
//        System.out.println(pokemonSummarizer.collect2());
//
//        pokemonSummarizer.collect3().entrySet().stream().forEach(System.out::println);
//        System.out.println(pokemonSummarizer.collect3().entrySet());
//
//        pokemonSummarizer.collect4().entrySet().stream().forEach(System.out::println);
//        System.out.println(pokemonSummarizer.collect4().entrySet());
//
//        pokemonSummarizer.collect6().stream().forEach(System.out::println);
//        System.out.println(pokemonSummarizer.collect6());
//
//        pokemonSummarizer.collect7().entrySet().stream().forEach(System.out::println);
//        System.out.println(pokemonSummarizer.collect7().entrySet());





    }






}
