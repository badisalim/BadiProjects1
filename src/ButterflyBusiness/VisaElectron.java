package ButterflyBusiness;

public class VisaElectron extends CreditCard {

    public static boolean isValid(long number) {
        return (getSize(number) >= 16 &&
                (prefixMatched(number, 4026) ||
                        prefixMatched(number, 417500) ||
                        prefixMatched(number, 4508) ||
                        prefixMatched(number, 4844) ||
                        prefixMatched(number, 4913) ||
                        prefixMatched(number, 4917)) &&

                ((sumOfDoubleEvenPlace(number) +
                        sumOfOddPlace(number)) % 10 == 0));
    }
}