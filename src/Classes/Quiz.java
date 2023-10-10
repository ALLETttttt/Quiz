package Classes;

import java.util.HashMap;

public class Quiz {

    private static HashMap<Question, Answer> quiz = new HashMap<Question, Answer>();

    public Quiz(HashMap<Question, Answer> quiz) {
        Quiz.quiz = quiz;
    }

    public Quiz() {}

    public HashMap<Question, Answer> getQuiz() {
        return quiz;
    }

    public void setQuiz(HashMap<Question, Answer> quiz) {
        Quiz.quiz = quiz;
    }


}
