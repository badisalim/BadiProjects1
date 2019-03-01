package ResturantMeals;

public class Meal {

    private String name;
    private Double price;

    public Meal(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
