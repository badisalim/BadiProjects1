package Final.CreditCards;

import Final.CreditCard;

public class MasterCard extends CreditCard {

    public static boolean isValid(long number) {
        return (getSize(number) >= 16 &&
                (prefixMatched(number, 51) ||
                        prefixMatched(number, 52) ||
                        prefixMatched(number, 53) ||
                        prefixMatched(number, 54) ||
                        prefixMatched(number, 55)) &&

                ((sumOfDoubleEvenPlace(number) +
                        sumOfOddPlace(number)) % 10 == 0));
    }
}