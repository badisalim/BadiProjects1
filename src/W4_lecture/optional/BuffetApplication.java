package W4_lecture.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BuffetApplication {

    public static void main(String[] args) {
        List<Friend> friends = getFriends();
        Buffet buffet = new Buffet(friends);

        buffet.startEatingLikeCrazy();

        Optional<Friend> winner = buffet.findTheOneWhoAteTheMostSushi();
        if (winner.isPresent()) {
            Friend theWinner = winner.get();
            System.out.println("The winner is " + theWinner.getName());
            System.out.println("With " + theWinner.getAmountOfSushi() + " pieces of sushi");
        } else {
            System.out.println("Noone won yet.");
        }

    }

    private static List<Friend> getFriends() {
        List<Friend> friends = new ArrayList<>();
        String[] split = "Tamara,Hamada,Mohamed".split(",");
        List<String> names = Arrays.asList(split);
        for (String name : names) {
            Friend friend = new Friend(name);
            friends.add(friend);
        }
        return friends;
    }

}
