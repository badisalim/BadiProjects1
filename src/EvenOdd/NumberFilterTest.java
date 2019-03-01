package EvenOdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NumberFilterTest {

    private NumberFilter filter = new NumberFilter();

    @Test
    void getEven() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        List<Integer> filtered = filter.getEven(numbers);

        List<Integer> expected = Arrays.asList(2, 4);
        Assertions.assertEquals(expected, filtered);
    }

    @Test
    void getOdd() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        List<Integer> filtered = filter.getOdd(numbers);

        List<Integer> expected = Arrays.asList(1, 3);
        Assertions.assertEquals(expected, filtered);
    }
}