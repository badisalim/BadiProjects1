package planets;

public class Venus implements Planet {

    @Override
    public String getName() {
        return "Venus";
    }

    @Override
    public Double weight(Double weight) {
        return weight * 0.91;
    }
}
