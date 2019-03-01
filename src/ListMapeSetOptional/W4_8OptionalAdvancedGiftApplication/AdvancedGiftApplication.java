package ListMapeSetOptional.W4_8OptionalAdvancedGiftApplication;

import java.util.Optional;

public class AdvancedGiftApplication {

    public static void main(String[] args) {
        Optional<Box> giftBox = Optional.empty();

        System.out.println(giftBox);

        Box robotoy = new Box("RoboToy");

        giftBox= Optional.of(robotoy);
        System.out.println(giftBox);
if (giftBox.isPresent()){

    System.out.println("There is a present in the gift box");
    Box value = giftBox.get();
    System.out.println("The gift is a "+value);


}







//            for (int times = 0; times < 8; times++) {
//                Optional<String> text = giftBox.get(Present);
//                if (text.isPresent()) {
//                    System.out.println(text.get());
//                } else {
//


    }

}

