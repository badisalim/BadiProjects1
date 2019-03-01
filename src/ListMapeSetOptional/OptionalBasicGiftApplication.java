package ListMapeSetOptional;

import java.util.Optional;
import java.util.Random;

public class OptionalBasicGiftApplication {


    public static void main(String[] args) {
        Optional<String> giftBox = Optional.of("");


        System.out.println(giftBox);
        Optional<String> Gift = Optional.of("Robotoy");
        System.out.println(Gift);
        if (Gift.isPresent()) {
            System.out.println("Yeah I got my Gift: " + Gift.get());
        } else {
            System.out.println("Oh no, where is my Gift?");
        }
    }
    private static Optional<String> getGift(){
            if(isGiftThere()){
                return Optional.of("Christmas Present");


            } else {
                return Optional.empty();

               // System.out.println (getGift());
        }


    }



    private static boolean isGiftThere() {

            Random random = new Random();
            return random.nextBoolean();
               // System.out.println(Random);

       // System.out.println("the gift is"+ getGift(""));

    }
}