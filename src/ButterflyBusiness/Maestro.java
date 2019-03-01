package ButterflyBusiness;

public class Maestro extends CreditCard {

    public static boolean isValid(long number) {
        return (getSize(number) >= 16 &&
                (prefixMatched(number, 5018) ||
                        prefixMatched(number, 5020) ||
                        prefixMatched(number, 5038) ||
                        prefixMatched(number, 5893) ||
                        prefixMatched(number, 6304) ||
                        prefixMatched(number, 6759) ||
                        prefixMatched(number, 6761) ||
                        prefixMatched(number, 6762) ||
                        prefixMatched(number, 6763)) &&

                ((sumOfDoubleEvenPlace(number) +
                        sumOfOddPlace(number)) % 10 == 0));
    }
}
