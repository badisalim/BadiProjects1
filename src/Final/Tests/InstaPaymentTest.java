package Final.Tests;

import Final.CreditCards.InstaPayment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstaPaymentTest {

    @Test
    void isValid() {

        Long number1 = 6378505180819368L;

        boolean isValid = InstaPayment.isValid(number1);

        Assertions.assertTrue(isValid);
    }
}



