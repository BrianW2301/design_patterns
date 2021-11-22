import java.util.Random;

public class Hard implements State {

    private ArithemeticGame game;
    private Random random;

    public Hard(ArithemeticGame game) {
        this.game = game;
        random = new Random();
    }

    /**
     * Returns a random integer within a preset bound
     */
    public int getNum() {
        return random.nextInt(99) + 1;
    }

    /**
     * Return a random math operator from a preset list of operators
     */
    public String getOperation() {
        String[] operators = { "+", "-", "*", "/" };
        return operators[random.nextInt(operators.length)];
    }

    /**
     * Since Hard is the highest difficulty level, the user is kept in the same
     * state, but told they are doing a good job.
     */
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    /**
     * Lowers the user to the medium difficulty state
     */
    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You are struggling, let's go to medium mode.");
    }

}
