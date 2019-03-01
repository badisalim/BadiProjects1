package CreditCardBadi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AmericanExpressTest {

    @Test
    void isValid() {

        Long number1 = 379354508162306L;
        // CreditCard creditCard2 = new AmericanExpress();
        boolean isValid = AmericanExpress.isValid(number1);
//        Assertions.assertEquals(isValid, true);
        Assertions.assertTrue(isValid);
    }
}