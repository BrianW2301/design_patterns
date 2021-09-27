package singleton;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    private TriviaGame(){
        questions = DataLoader.getTriviaQuestions();
        reader = new Scanner(System.in);
        rand = new Random();
        score = 0;
    }
    public static TriviaGame getInstance(){
        triviaGame = new TriviaGame();
        return triviaGame;
    }

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

    private boolean playRound(){
        int questionNum = rand.nextInt(10);
        System.out.println(questions.get(questionNum));
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
