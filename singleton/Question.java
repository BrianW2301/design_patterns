package singleton;
/**
 * @author Brian White
 */
public class Question{
    private String question;
    private String[] answers;
    private int correctAnswer;
    /**
     * Question constructor
     * Initializes the question String, the String array of answer choices, and an intiger denoting the array index of the correct answer
     * @param the question
     * @param answer option 1
     * @param answer option 2
     * @param answer option 3
     * @param answer option 4
     * @param the correct answer
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
        this.question = question;
        answers = new String[]{ans1, ans2, ans3, ans4};
        this.correctAnswer = correctAnswer;
    }
    /**
     * Formats a question and all of its answer choices into an easy to read String
     * @return the formatted string
     */
    public String toString(){
        String string="\n";
        string+=question;
        for (int i=0; i<answers.length; i++){
            string+="\n "+(i+1)+". "+answers[i];
        }
        return string;
    }
    /**
     * Checks if the answer input by the user matches the correct answer
     * @param userAnswer
     * @return true if they match, false if they don't
     */
    public boolean isCorrect(int userAnswer){
        return userAnswer-1==correctAnswer;
    }
    /**
     * Gets the correct answer for a question
     * @return the answer
     */
    public String getCorrectAnswer(){
        return answers[correctAnswer];
    }
}