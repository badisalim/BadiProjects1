package Validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthRuleTest {

    private LengthRule rule = new LengthRule();

    @Test
    void testIsSmaller() {
        String text = "Potato";
        boolean result = rule.isOk(text);
        Assertions.assertTrue(result);
    }

    @Test
    void testIsEquals() {
        String text = "0123456789";
        boolean result = rule.isOk(text);
        Assertions.assertTrue(result);
    }

    @Test
    void testIsBigger() {
        String text = "0123456789a";
        boolean result = rule.isOk(text);
        Assertions.assertFalse(result);
    }
}
