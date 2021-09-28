package singleton;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * @author Brian White
 */
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;
    /**
     * TriviaGame constructor
     * Initializes reader, rand, score, and questions
     * Fills questions ArrayList with questions from a text document via the DataLoader class
     */
    private TriviaGame(){
        questions = DataLoader.getTriviaQuestions();
        reader = new Scanner(System.in);
        rand = new Random();
        score = 0;
    }
    /**
     * Checks if a TriviaGame object exists and if it does not, creates a TriviaGame object
     * @return the TriviaGame object
     */
    public static TriviaGame getInstance(){
        if (triviaGame == null)
            triviaGame = new TriviaGame();
        return triviaGame;
    }
    /**
     * Plays a trivia game for as long as the user wishes
     * Continues to ask questions as long as the user enters a p and does not enter a q when prompted
     * After the user quits the game, they are presented with how many questions they answered correctly
     */
    public void play(){
        String again = "p";
        while (again.charAt(0)=='p' || again.charAt(0)=='P'){
            playRound();
            System.out.println("(P)lay or (Q)uit:");
            again = reader.next();
            while (again.charAt(0)!='p' && again.charAt(0)!='P' && again.charAt(0)!='q' && again.charAt(0)!='Q'){
                System.out.println("That is not a valid response.\nPlease enter \"P\" to play again or \"Q\" to quit");
                again = reader.next();
            }
        }
        String goodbye = "You won "+score+" game";
        if (score != 1){goodbye+="s";}
        goodbye+="\nGoodbye";
        System.out.println(goodbye);
    }
    /**
     * Chooses a random question from the ArrayList of questions
     * Displays the question and its answer choices
     * If the user answers correctly, their score is increased by 1
     * @return true if the user answers correctly or false if the user answers incorrectly
     */
    private boolean playRound(){
        int questionNum = rand.nextInt(questions.size());
        System.out.println(questions.get(questionNum));
        System.out.print("Enter answer: ");
        if (questions.get(questionNum).isCorrect(reader.nextInt())){
            System.out.println("That is correct!");
            score ++;
            return true;
        }
        System.out.println("That is incorrect!");
        System.out.println("The correct answer is " +questions.get(questionNum).getCorrectAnswer());
        return false;
    }
}
