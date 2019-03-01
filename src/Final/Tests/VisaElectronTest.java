package Final.Tests;

import Final.CreditCards.VisaElectron;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VisaElectronTest {


    @Test
    void isValid() {

        Long number1 = 4844655195775443L;

        boolean isValid = VisaElectron.isValid(number1);

        Assertions.assertTrue(isValid);
    }
}