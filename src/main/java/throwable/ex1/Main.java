package throwable.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj login. ");
        String login = scanner.next();
        System.out.println("Podaj hasło. ");
        String password = scanner.next();
        System.out.println("Podaj imię. ");
        String firstName = scanner.next();
        System.out.println("Podaj email. ");
        String email = scanner.next();


        User user = new User();
        user.create(login, password, firstName, email);
        System.out.println(user);
    }
}
