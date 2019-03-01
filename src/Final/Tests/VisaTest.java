package Final.Tests;

import Final.CreditCards.Visa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VisaTest {

    @Test
    void isValid() {

        Long number1 = 4916482508517922L;

        boolean isValid = Visa.isValid(number1);

        Assertions.assertTrue(isValid);
    }
}

