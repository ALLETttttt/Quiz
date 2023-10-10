package Classes;

import Interfaces.IUser;

import java.util.HashMap;

public class User extends Person implements IUser {


    private static HashMap<String, String> userList = new HashMap<String, String>();
    private static HashMap<String, Integer> leaderBoard = new HashMap<String, Integer>();

    public User(String email, String password) {
        super(email, password);
    }

    public User() {
        super();
    }


    public HashMap<String, String> getUserList() {
        return userList;
    }

    public void setUserList(HashMap<String, String> userList) {
        User.userList = userList;
    }

    public HashMap<String, Integer> getLeaderBoard() {
        return leaderBoard;
    }

    public void setLeaderBoard(HashMap<String, Integer> leaderBoard) {
        User.leaderBoard = leaderBoard;
    }

    @Override
    public void registration() {
        this.getUserList().put(getEmail(), getPassword());
        this.getLeaderBoard().put(getEmail(), 0);
        System.out.println("Registration done successfully!!!");
    }

    @Override
    public boolean login(String email, String password) {
        return this.getUserList().containsKey(email) && this.getUserList().containsValue(password);
    }

    @Override
    public void showLeaderBoard() {
        this.getLeaderBoard().forEach(
                (key, value) ->
                        System.out.println("User: " + key + " -> Points: " + value)
        );
    }


    public void showAllUsers() {
        this.getUserList().forEach(
                (key, value) ->
                        System.out.println("User: " + key + " -> Password: " + value)
        );
    }



}
