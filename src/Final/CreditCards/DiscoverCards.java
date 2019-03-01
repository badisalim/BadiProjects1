package Final.CreditCards;

import Final.CreditCard;

public class DiscoverCards extends CreditCard {
    public static boolean isValid(Long number) {
        return (getSize(number) >= 16 &&
                (prefixMatched(number, 6011)||
                  prefixMatched(number, 622126)||
                  prefixMatched(number, 622925)||
                  prefixMatched(number, 644)||
                  prefixMatched(number, 645)||
                  prefixMatched(number, 646)||
                  prefixMatched(number, 647)||
                  prefixMatched(number, 648)||
                  prefixMatched(number, 649)||
                  prefixMatched(number, 65))&&

                ((sumOfDoubleEvenPlace(number) +
                        sumOfOddPlace(number)) % 10 == 0));
    }
}
