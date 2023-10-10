package Classes;

import Interfaces.IAdmin;

public class Admin extends Person implements IAdmin {
    public Admin(String email, String password) {
        super(email, password);
    }

    private String getAdminEmail() {
        return "kz@kbtu.kz";
    }

    private String getAdminPassword() {
        return "123";
    }


    @Override
    public boolean checkAdmin() {
        return getEmail().equals(getAdminEmail()) && getPassword().equals(getAdminPassword());
    }

    @Override
    public void showAllUsers(User user) {
        user.showAllUsers();
    }

    @Override
    public void createQuiz(Quiz quiz, Question question, Answer answer) {
        quiz.getQuiz().put(question, answer);
    }
}
