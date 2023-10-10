import Menu.MainMenu;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Quiz App!");
        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenu();
    }
}
