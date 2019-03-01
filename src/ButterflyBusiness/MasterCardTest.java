package ButterflyBusiness;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MasterCardTest {

    @Test
    void isValid() {
        Long number2 = 5196081888500645L;

        Assertions.assertEquals(MasterCard.isValid(number2), true);


    }
}