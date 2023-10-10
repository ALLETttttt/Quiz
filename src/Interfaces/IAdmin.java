package Interfaces;

import Classes.Answer;
import Classes.Question;
import Classes.Quiz;
import Classes.User;

public interface IAdmin {
    boolean checkAdmin();

    void showAllUsers(User user);

    void createQuiz(Quiz quiz, Question question, Answer answer);

}
