import java.util.Random;

public class Medium implements State {

    private ArithemeticGame game;
    private Random random;

    public Medium(ArithemeticGame game) {
        this.game = game;
        random = new Random();
    }

    /**
     * Returns a random integer within a preset bound
     */
    public int getNum() {
        return random.nextInt(49) + 1;
    }

    /**
     * Return a random math operator from a preset list of operators
     */
    public String getOperation() {
        String[] operators = { "+", "-", "*" };
        return operators[random.nextInt(operators.length)];
    }

    /**
     * Advances the user to the hard difficulty state
     */
    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("You've been advanced to the hardest mode.");
    }

    /**
     * Lowers the user to the easy difficulty state
     */
    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("You are struggling, let's go to easy mode.");
    }
}
