package RockScisorPaper;

public interface Move {

    String getName();

    boolean defeats(Move move);

}
