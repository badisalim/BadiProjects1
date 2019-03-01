package ButterflyBusiness;

public class AmericanExpress extends CreditCard {
    public static boolean isValid(long number) {
        return (getSize(number) >= 15 &&

                (prefixMatched(number, 34) ||
                        prefixMatched(number, 37)) &&

                ((sumOfDoubleEvenPlace(number) +
                        sumOfOddPlace(number)) % 10 == 0));
    }


}
