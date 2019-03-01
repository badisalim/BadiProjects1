package CreditCardBadi;

public class DiscoverCards extends CreditCard {
    public static boolean isValid(long number) {
        return (getSize(number) >= 15 &&
                (prefixMatched(number, 6)) &&

                ((sumOfDoubleEvenPlace(number) +
                        sumOfOddPlace(number)) % 10 == 0));
    }
}