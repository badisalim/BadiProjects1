package MoneyCents;

public class Cent50 extends Money {

    @Override
    public String toString() {
        return "Cent50";
    }

    @Override
    protected Integer getValue(Integer money) {

        return money / 50;

    }

    @Override
    protected Integer getValue2(Integer money) {
        return money;
    }


}
