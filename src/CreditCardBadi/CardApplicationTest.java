package CreditCardBadi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CardApplicationTest {

    @Test
    void main() {

        Long number3 = 6011000593748746L;

        Assertions.assertEquals(DiscoverCards.isValid(number3), true);

        Long number4 = 4388576018410707L;

        Assertions.assertEquals(Visa.isValid(number4), true);

    }
}