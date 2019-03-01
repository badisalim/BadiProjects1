package Lectures.datastructure;

import java.util.*;

public class Datastructures {

    public static void main(String[] args) {
        listExample();
        setExample();
        mapExample();
        optionalExample();
    }

    public static void listExample(){

        System.out.println("LIST EXAMPLE -----------");

        List<String> playlist = new ArrayList<>();

        playlist.add("Paradise");
        playlist.add("Yellow Submarine");
        playlist.add("Chop Suey");
        playlist.add("Chop Suey");
        playlist.add("Chop Suey");
        playlist.add("Ode Joy");
        playlist.add("Imagine");

        String firstSong = playlist.get(0);

        System.out.println("First Song: " + firstSong);

        for (String song : playlist) {
            System.out.println(song);
        }

    }

    private static void setExample(){
        Set<String> playlist = new HashSet<>();

        System.out.println("SET EXAMPLE ---------");

        playlist.add("Paradise");
        playlist.add("Yellow Submarine");
        playlist.add("Chop Suey");
        playlist.add("Chop Suey");
        playlist.add("Chop Suey");
        playlist.add("Ode Joy");
        playlist.add("Imagine");

        boolean containsChopSuey = playlist.contains("Chop Suey");

        System.out.println("Is chop suey there? : " + containsChopSuey);

        for (String song : playlist) {
            System.out.println(song);
        }
    }

    private static void mapExample(){
        System.out.println("MAP EXAMPLE ------------");

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("tomato", "Tomate");
        dictionary.put("car", "Auto");
        dictionary.put("potato", "Kartoffel");

        String germanCar = dictionary.get("car");
        System.out.println("German for car: " + germanCar);

        Set<String> englishWords = dictionary.keySet();

        System.out.println(englishWords);

        Collection<String> germanWords = dictionary.values();

        System.out.println(germanWords);

        boolean isRoomThere = dictionary.containsKey("room");

        System.out.println("Is room there? : " + isRoomThere);

        Set<Map.Entry<String, String>> translations = dictionary.entrySet();

        System.out.println("All Translations: ");
        for (Map.Entry<String, String> translation : translations) {
            String englishWord = translation.getKey();
            String germanWord = translation.getValue();

            System.out.println(englishWord + " means " + germanWord);

        }


    }

    private static void optionalExample(){
        System.out.println("OPTIONAL EXAMPLE ----");

        Optional<String> myPackage  = getPackage();
        if(myPackage.isPresent()){
            System.out.println("Yeah I got: " + myPackage.get());
        }else {
            System.out.println("Oh no, where is my package?");
        }

    }


    private static Optional<String> getPackage(){
        if(isPackageThere()){
            return Optional.of("Christmas Present");
        } else {
            return Optional.empty();
        }
    }

    private static boolean isPackageThere(){
        Random random = new Random();
        return random.nextBoolean();
    }

}




