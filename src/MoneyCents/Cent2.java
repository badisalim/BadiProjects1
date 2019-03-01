package MoneyCents;

public class Cent2 extends Money {
    @Override
    public String toString() {
        return "Cent2";
    }

    @Override
    protected Integer getValue(Integer money) {

        return new Cent5().getValue(money) - new Cent5().getValue2(money) * 5;
    }

    @Override
    protected Integer getValue2(Integer money) {
        return new Cent2().getValue(money) / 2;
    }
}
