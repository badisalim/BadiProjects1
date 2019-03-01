package Final.Tests;

import Final.CreditCards.Maestro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaestroTest {

    @Test
    void isValid() {

        Long number1 = 6761452049377475L;

        boolean isValid = Maestro.isValid(number1);

        Assertions.assertTrue(isValid);
    }
}