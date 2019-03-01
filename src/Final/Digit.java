package Final;

import java.util.Objects;

public class Digit {

    private String part1;
    private String part2;
    private String part3;

    public Digit(String part1, String part2, String part3) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
    }

    public String getPart1() {
        return this.part1;
    }
    public String getPart2() {
        return this.part2;
    }
    public String getPart3() {
        return this.part3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Digit digit = (Digit) o;
        return Objects.equals(part1, digit.part1) &&
                Objects.equals(part2, digit.part2) &&
                Objects.equals(part3, digit.part3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(part1, part2, part3);
    }

    @Override
    public String toString() {
        return part1 + "\n" + part2 + "\n" + part3 + "\n";
    }
}