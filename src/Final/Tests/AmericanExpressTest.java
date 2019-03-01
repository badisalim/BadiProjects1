package Final.Tests;

import ButterflyBusiness.AmericanExpress;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AmericanExpressTest {

    @Test
    void isValid() {

        Long number1 = 379354508162306L;

        boolean isValid = AmericanExpress.isValid(number1);

        Assertions.assertTrue(isValid);
    }
}