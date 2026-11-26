package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String userName = Cli.getUserName();
        System.out.println("Hello, %s!".formatted(userName));
    }
}
