import java.util.Scanner;

public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    public ArithemeticGame() {
        this.reader = new Scanner(System.in);
        this.easyState = new Easy(this);
        this.mediumState = new Medium(this);
        this.hardState = new Hard(this);
        this.state = easyState;
    }

    /**
     * Plays 1 round of the game
     * 
     * Gets 2 random numbers and a random math operation from the appropriate
     * difficulty level. Calculates an answer and compares it to an answer given by
     * the user. If the user's answer matched the calculated answer, their score is
     * increaded by 1. If they do not match, the user's score is decreased by 1.
     * Once the user's score reaches 3, their score is set to 0 and their difficulty
     * state is increased. Once the user's score reaches -3, their score is set to 0
     * and their difficulty state is decreased.
     */
    public void pressQuestionButton() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        String operator = state.getOperation();
        int answer = 0;
        int userAnswer;

        if (operator.equals("+")) {
            answer = num1 + num2;
        } else if (operator.equals("-")) {
            answer = num1 - num2;
        } else if (operator.equals("*")) {
            answer = num1 * num2;
        } else if (operator.equals("/")) {
            answer = num1 / num2;
        }

        System.out.println(num1 + " " + operator + " " + num2);
        userAnswer = reader.nextInt();

        if (userAnswer == answer) {
            System.out.println("Correct");
            score++;
        } else {
            System.out.println("Incorrect");
            score--;
        }

        if (score >= 3) {
            state.levelUp();
            score = 0;
        }
        if (score <= -3) {
            state.levelDown();
            score = 0;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getEasyState() {
        return easyState;
    }

    public State getMediumState() {
        return mediumState;
    }

    public State getHardState() {
        return hardState;
    }
}
