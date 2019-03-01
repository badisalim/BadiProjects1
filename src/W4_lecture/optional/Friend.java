package W4_lecture.optional;

public class Friend {

    private String name;
    private Integer amountOfSushi = 0;

    public Friend(String name) {
        this.name = name;
    }

    public void eatOneSushi() {
        amountOfSushi++;
    }

    public String getName() {
        return name;
    }

    public Integer getAmountOfSushi() {
        return amountOfSushi;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }
}
