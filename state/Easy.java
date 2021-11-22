import java.util.Random;

public class Easy implements State {

    private ArithemeticGame game;
    private Random random;

    public Easy(ArithemeticGame game) {
        this.game = game;
        random = new Random();
    }

    /**
     * Returns a random integer within a preset bound
     */
    public int getNum() {
        return random.nextInt(9) + 1;
    }

    /**
     * Return a random math operator from a preset list of operators
     */
    public String getOperation() {
        String[] operators = { "+", "-" };
        return operators[random.nextInt(operators.length)];
    }

    /**
     * Advances the user to the medium difficulty state
     */
    public void levelUp() {
        game.setState(game.getMediumState());
        System.out.println("You've been advanced to medium mode.");
    }

    /**
     * Since Easy is the lowest difficulty level, the user is kept in the same
     * state, but told they should study more.
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
