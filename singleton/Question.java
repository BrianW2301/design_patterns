package singleton;

public class Question{
    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
        this.question = question;
        answers = new String[]{ans1, ans2, ans3, ans4};
        this.correctAnswer = correctAnswer;
    }

    public String toString(){
        String string="\n";
        string+=question;
        for (int i=0; i<answers.length; i++){
            string+="\n "+(i+1)+". "+answers[i];
        }
        return string;
    }

    public boolean isCorrect(int userAnswer){
        return userAnswer-1==correctAnswer;
    }

    public String getCorrectAnswer(){
        return answers[correctAnswer];
    }
}