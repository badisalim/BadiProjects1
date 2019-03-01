package EvenOdd;



import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        NumberFilter filter = new NumberFilter();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4,5,6,7);

        List<Integer> filtered = filter.getEven(numbers);
        System.out.println(filtered);

        NumberFilter filter1 = new NumberFilter();
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4,5,6,7);
        List<Integer> filtered1 = filter1.getOdd(numbers1);
        System.out.println(filtered1);
    }
}




