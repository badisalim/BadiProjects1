package Final.Tests;

import Final.CreditCards.DiscoverCards;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscoverCardsTest {

    @Test
    void isValid() {

        Long number1 = 6011000593748746L;

        boolean isValid = DiscoverCards.isValid(number1);

        Assertions.assertTrue(isValid);
    }
}



