package ButterflyBusiness;

import challenge.katabank.Digit;
import challenge.katabank.DigitIterator;
import challenge.katabank.Line;
import challenge.katabank.LineIterator;
import exercise.week9.reader.FileReader;

import java.util.ArrayList;
import java.util.List;

public class DigitTranslator {

    private FileReader fileReader = new FileReader();

    private List<Digit> digits = loadDigits();

    public Integer toNumber(Digit digit) {
        int position = 0;
        for (position = 0; position < digits.size(); position++) {
            Digit original = digits.get(position);
            if (original.equals(digit)) {
                return position;
            }
        }
        return position;
    }

    private List<Digit> loadDigits() {
        List<Digit> digits = new ArrayList<>();
        List<String> lines = fileReader.asList("ButterflyBusiness/buterfly-business.txt");
        Line line = new LineIterator(lines).next();
        DigitIterator iterator = new DigitIterator(line);
        while (iterator.hasNext()) {
            digits.add(iterator.next());
        }
        return digits;
    }
}
