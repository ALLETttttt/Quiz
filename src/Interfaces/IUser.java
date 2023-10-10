package Interfaces;

public interface IUser {
    void registration();

    boolean login(String email, String password);

    void showLeaderBoard();
}
