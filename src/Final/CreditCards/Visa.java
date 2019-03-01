package Final.CreditCards;

import Final.CreditCard;

import java.util.List;

public class Visa extends CreditCard {


    public static boolean isValid(long number) {
        return isValidLuhn(number) && length(number) && startsWith(number) && doesntStartWith(number);
    }

    private static boolean isValidLuhn(long number) {
        return (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }

    private static boolean length(long number) {
        return getSize(number) == 13 || getSize(number) == 16 || getSize(number) == 19;
    }

    private static boolean startsWith(long number) {
        return prefixMatched(number, 4);
    }

    private static boolean doesntStartWith(long number) {
        List<Integer> beginnings = List.of(4026, 417500, 4508, 4844, 4913, 4917);
        return beginnings.stream()
                .noneMatch(beginning -> prefixMatched(number, beginning));
    }
}
