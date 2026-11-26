package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getUserName() {
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        return userName;
    }
}
