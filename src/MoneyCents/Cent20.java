package MoneyCents;

public class Cent20 extends Money {


    @Override
    public String toString() {
        return "Cent20";
    }

    @Override
    protected Integer getValue(Integer money) {

        return new Cent50().getValue2(money) - new Cent50().getValue(money) * 50;
        //=49
    }

    @Override
    protected Integer getValue2(Integer money) {

        return (new Cent20().getValue(money)) / 20;
    }

    //return ((money - ((money / 50) * 50)) / 20);
}



