package Final.CreditCards;

import Final.CreditCard;

public class InstaPayment extends CreditCard {
    public static boolean isValid(Long number) {
        return (getSize(number) >= 16 &&
                (prefixMatched(number, 637)||
                        prefixMatched(number, 638)||
                        prefixMatched(number, 639))&&

                ((sumOfDoubleEvenPlace(number) +
                        sumOfOddPlace(number)) % 10 == 0));
    }
}



