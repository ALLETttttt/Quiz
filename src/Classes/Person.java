package Classes;

public abstract class Person {
    private String email;
    private String password;


    public Person(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Person() {

    }


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
