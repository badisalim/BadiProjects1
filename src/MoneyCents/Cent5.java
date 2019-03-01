package MoneyCents;

public class Cent5 extends Money {

    @Override
    public String toString() {
        return "Cent5";
    }

    @Override
    protected Integer getValue(Integer money) {

        return new Cent10().getValue(money) - new Cent10().getValue2(money) * 10;
    }

    @Override
    protected Integer getValue2(Integer money) {

        return new Cent5().getValue(money) / 5;
    }
}
