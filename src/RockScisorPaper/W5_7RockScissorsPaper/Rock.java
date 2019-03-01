package RockScisorPaper.W5_7RockScissorsPaper;

public class Rock implements Move {

    @Override
    public String getName() {
        return "rock";
    }

    @Override
    public boolean defeats(Move move) {
        return move.getName().equalsIgnoreCase("scissors");
    }
}
