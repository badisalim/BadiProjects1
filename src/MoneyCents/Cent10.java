package MoneyCents;

public class Cent10 extends Money {
    @Override
    public String toString() {
        return "Cent10";
    }

    @Override
    protected Integer getValue(Integer money) {
        return (new Cent20().getValue(money) - (new Cent20().getValue2(money) * 20));
        //=9
    }

    @Override
    protected Integer getValue2(Integer money) {

        return (new Cent10().getValue(money)) / 10;
    }
}
