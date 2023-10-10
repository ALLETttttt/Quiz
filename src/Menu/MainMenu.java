package Menu;

import Classes.Admin;
import Classes.Quiz;
import Classes.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {
    public void mainMenu() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Quiz quiz = new Quiz();
        User user = new User();
        System.out.println("Enter the System!");
        System.out.println("1. Registration \n2. Login \n3. Admin Mode");
        int choice = Integer.parseInt(input.readLine());
        UserMenu userMenu = new UserMenu();
        if (choice == 1) {
            userMenu.registration(user, input);
        }
        else if (choice == 2) {
            System.out.print("Email: ");
            String email = input.readLine();
            System.out.print("Password: ");
            String password = input.readLine();
            if (user.login(email, password)) {
                userMenu.login(user, quiz, email, input);
            }
            else {
                throw new IOException("Entered wrong data!!!");
            }
        }
        else if (choice == 3) {
            System.out.print("Email: ");
            String email = input.readLine();
            System.out.print("Password: ");
            String password = input.readLine();
            Admin admin = new Admin(email, password);
            if (admin.checkAdmin()) {
                AdminMenu adminMenu = new AdminMenu();
                adminMenu.enterAdminMode(user, admin, quiz, email, input);
            }
            else {
                throw new IOException("Entered wrong data!!!");
            }
        }
        else {
            throw new IOException("Wrong case!");
        }
    }
}
