package MoneyCents;

public class Cent1 extends Money {
    @Override
    public String toString() {
        return "Cent1";
    }

    @Override
    protected Integer getValue(Integer money) {

        return new Cent2().getValue(money) - new Cent2().getValue2(money) * 2;
    }

    @Override
    protected Integer getValue2(Integer money) {

        return new Cent1().getValue(money) / 1;
    }
}
