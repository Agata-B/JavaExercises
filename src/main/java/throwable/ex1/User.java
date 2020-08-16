package throwable.ex1;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

public class User {

    private String login;
    private String password;
    private String firstName;
    private String email;
    private LocalDate creationDate;

    public User() {
    }

    private User(String login, String password, String firstName, String email, LocalDate creationDate) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.email = email;
        this.creationDate = creationDate;
    }


    public static User create(String login, String password, String firstName, String email) {
        if (StringUtils.isAllEmpty(login, password, firstName, email)) {
            throw new IllegalArgumentException("Arguments is empty.");
        }
        if (login.length() < 6){
            throw new IllegalArgumentException("Login cannot be shorter than 6 characters.");
        }
        return new User(login, password, firstName, email, LocalDate.now());
    }

}
