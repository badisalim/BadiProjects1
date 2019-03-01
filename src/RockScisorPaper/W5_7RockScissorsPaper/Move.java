package RockScisorPaper.W5_7RockScissorsPaper;

public interface Move {

    String getName();

    boolean defeats(Move move);

}
