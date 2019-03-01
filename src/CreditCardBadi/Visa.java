package CreditCardBadi;

public class Visa extends CreditCard {


    public static boolean isValid(long number) {
        return (getSize(number) >= 13 &&
                getSize(number) <= 16) &&
                (prefixMatched(number, 4) &&

                        ((sumOfDoubleEvenPlace(number) +
                                sumOfOddPlace(number)) % 10 == 0));
    }
}
